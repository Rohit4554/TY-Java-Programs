import java.util.Scanner;

public class A1A4ArrayReverse 
{
     
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int array[]=new int [size];
        System.out.println("Enter the Array Elements:");
         for(int i=0;i<size;i++)
         {
            array[i] = sc.nextInt();
         }
         System.out.println("Reverse Order Array:");
         for(int i=size-1;i>=0;i--)
         {
            System.out.print(array[i]+" ");
         }
    }
}
