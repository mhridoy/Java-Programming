package March;
import java.util.Scanner;
public class ArrayInsertElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        int pos = sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        int x = sc.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}