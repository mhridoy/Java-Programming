package March;

public class CopyArray {
    public static void main(String[] args) {
        int[] origianArr = {10,20,43,87,98};
        int[] copiedArr= new int[origianArr.length];

       /* Method 01
        int[] copy = origianArr;
        System.out.print("Original array is : ");
        for (int i = 0; i < origianArr.length ; i++) {
            System.out.print(origianArr[i] + " ");
        }
        System.out.println();
        System.out.print("Copied array is : ");
        for (int i = 0; i < copy.length ; i++) {
            System.out.print(copy[i] + " ");
        }*/

        /* Method 02
        for (int i = 0; i < origianArr.length ; i++) {
            copiedArr[i]=origianArr[i];
        }
        for (int i = 0; i < copiedArr.length ; i++) {
            System.out.print (copiedArr[i] + " ");
        } */

        //Method 03

        System.arraycopy(origianArr,0,copiedArr,0,origianArr.length);
        System.out.print("Original array is : ");
        for (int i = 0; i < origianArr.length ; i++) {
            System.out.print(origianArr[i] + " ");
        }
        System.out.println();
        System.out.print("Copied array is : ");
        for (int i = 0; i < copiedArr.length ; i++) {
            System.out.print(copiedArr[i] + " ");
        }

    }
}
