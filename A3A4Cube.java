import java.util.*;
interface function 
{
    void cube(int n);
}
class demo implements function 
{
    public void cube(int n) 
    {
        System.out.println("Cube :" + (n * n * n));
    }
}
public class  A3A4Cube
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for finding cube: ");
        int n = sc.nextInt();
        function d = new demo();
        d.cube(n);
        sc.close();
    }
}