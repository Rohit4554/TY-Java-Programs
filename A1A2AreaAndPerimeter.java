import java.util.Scanner;

public class A1A2AreaAndPerimeter 
{
    public static void main(String args[])
    {
        System.out.println("Enter the Length of Rectangle:");
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        System.out.println("Enter the Breadth of Rectangle:");
       // Scanner sc = new Scanner(System.in);
        float breadth = sc.nextFloat();
        float area = length*breadth;
        float perimeter= 2*(length+breadth);
        System.out.println("Area of Rectangle is  "+area);
        System.out.println("Perimeter of rectangle "+perimeter);

    }
    
}

    
