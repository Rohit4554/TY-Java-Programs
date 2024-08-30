
/**
 * The MyNumber class provides methods to perform various checks on an integer.
 */
public class A1B2MyNumberDoc 
{
    private int value;

    /**
     * Default constructor that initializes the value to 0.
     */
    public A1B2MyNumberDoc()
   {
        this.value = 0;
    }

    /**
     * Constructor that initializes the value to the specified value.
     * @param value the value to initialize the object with
     */
    public A1B2MyNumberDoc(int value) 
    {
        this.value = value;
    }

    /**
     * Checks if the number is negative.
     * return true if the number is negative, false otherwise
     */
    public boolean isNegative() 
    {
        return value < 0;
    }

    /**
     * Checks if the number is positive.
     * @return true if the number is positive, false otherwise
     */
    public boolean isPositive() 
    {
        return value > 0;
    }

    /**
     * Checks if the number is zero.
     * @return true if the number is zero, false otherwise
     */
    public boolean isZero() 
    {
        return value == 0;
    }

    /**
     * Checks if the number is odd.
     * @return true if the number is odd, false otherwise
     */
    public boolean isOdd() 
    {
        return value % 2 != 0;
    }

    /**
     * Checks if the number is even.
     * @return true if the number is even, false otherwise
     */
    public boolean isEven() 
    {
        return value % 2 == 0;
    }

    /**
     * The main method to create a MyNumber object, pass a value using command line arguments,
     * and perform the various checks.
     * @param args command line arguments
     */
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            System.err.println("Usage: java MyNumber <number>");
            System.exit(1);
        }

        // Convert command line argument to integer
        int inputValue = Integer.parseInt(args[0]);

        // Create an object of MyNumber
        MyNumber number = new MyNumber(inputValue);

        // Perform tests and print results
        System.out.println("Number: " + inputValue);
        System.out.println("isNegative: " + number.isNegative());
        System.out.println("isPositive: " + number.isPositive());
        System.out.println("isZero: " + number.isZero());
        System.out.println("isOdd: " + number.isOdd());
        System.out.println("isEven: " + number.isEven());
    }
}
