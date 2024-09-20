

import java.io.*;
import java.util.*;

public class A4A3FileCopy 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of File 1 (source): ");
        String f1 = sc.nextLine();

        System.out.println("Enter Name of File 2 (destination): ");
        String f2 = sc.nextLine();

        // Using try-with-resources to automatically close streams
        try
             (FileInputStream fin = new FileInputStream(f1);
             FileOutputStream fout = new FileOutputStream(f2)) 
             {

            int ch;
            // Copy the contents of the first file to the second file
            while ((ch = fin.read()) != -1) 
            {
                fout.write(ch);
            }

            // Adding "End of File" at the end of the second file
            String end = "\nEnd of File";
            byte[] b = end.getBytes();
            fout.write(b);

            System.out.println("File Content Copied and 'End of File' added.");
        } catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) 
        {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }

        sc.close();
    }
}
