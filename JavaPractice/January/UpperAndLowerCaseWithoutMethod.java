package January;

public class UpperAndLowerCaseWithoutMethod {

        public static void main(String[] args) {
            String x = "shahnaz";
            String y = "JAVA";
          //  char upper[] = x.toCharArray();
            char lower[] = y.toCharArray();
            int size = lower.length;

            int i=0;
            while(i!=size){

             //  upper[i] = (char) (upper[i] - 32);
               lower[i] = (char) (lower[i] + 32);

                    i++;
                }
           // System.out.println(upper);
            System.out.println(lower);
            }


        }

