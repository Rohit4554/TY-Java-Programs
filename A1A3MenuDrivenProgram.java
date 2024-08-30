
import java.util.Scanner;

public class A1A3MenuDrivenProgram 
{

    public static void calculateCylinderVolume(Scanner sc)
     {
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume);
    }

    
    public static void calculateFactorial(Scanner sc) 
    {
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++)
         {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }


    public static void checkArmstrongNumber(Scanner sc)
     {
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (originalNumber != 0) 
        {
            int digit = originalNumber % 10;
            result += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        if (result == number) 
        {
            System.out.println(number + " is an Armstrong number.");
        }
         else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate the volume of a cylinder");
            System.out.println("2. Find the factorial of a given number");
            System.out.println("3. Check if a number is Armstrong or not");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
             {
                case 1:
                    calculateCylinderVolume(scanner);
                    break;
                case 2:
                    calculateFactorial(scanner);
                    break;
                case 3:
                    checkArmstrongNumber(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
