package October;

import java.util.Arrays;
import java.util.Scanner;

public class JollyJumper {


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner (System.in);

            while(true){
                int n = in.nextInt();

                int array [] = new int [n];

                for(int i=0; i<n;i++){

                    array[i] = in.nextInt();
                }


                // Calculate absulute differeces

                int tempArray [] = new int [n];

                for(int i =0; i<n-1;i++){ // 0 1 2

                    tempArray [i] = Math.abs(array[i]-array[i+1]);
                }
                Arrays.sort(tempArray); // 1 2 3

                boolean breakSequence = false;
                for ( int i =1;i<n;i++){
                    if(tempArray[i]==i) continue;
                    else {
                        breakSequence = true;
                        break;
                    }
                }
                if(breakSequence){
                    System.out.println("Not Jolly");
                }
                else
                {
                    System.out.println("Jolly");
                }

            }
        }

    }

