import java.io.*;
public class A4A2FileContentReverse 
{
    public static void main(String[] args) 
    {
       try
       {
            FileInputStream fin = new FileInputStream("sample.txt");
            String str = "";
            int ch;
            System.out.println("Original Content of File :\n");

            while ((ch = fin.read()) != -1) 
            {
                System.out.printf("%c", ch);
                str += (char) (ch);
            }
             // reverse the string content
            StringBuffer sbf = new StringBuffer(str);
            System.out.println("\n\nReverse File Content: \n" + sbf.reverse());
            System.out.println("\nOriginal file content in UpperCase: \n" + str.toUpperCase());
            fin.close();
        } 
        catch (Exception e) 
        {
           System.out.println(e);
        }
    }

}