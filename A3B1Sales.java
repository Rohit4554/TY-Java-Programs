import java.util.*;
abstract class order
{
    int id;
    String desc;
    Scanner sc = new Scanner(System.in);
    public void setData(int id, String desc)
    {
       this.id=id;
       this.desc=desc;
    }
    abstract public void accept();
    abstract public void display();
}
class purchase_order extends order
{
    String cname;
    public void accept()
    {
       System.out.print("Enter Customer Name :");
       String n = sc.nextLine();
       cname=n;
    }
     public void display()
    {
      System.out.println("\t"+id +"\t"+desc+"\t\t"+cname);
    }

}
class sales_order extends order
{
    String vname;
    public void accept()
    {
       System.out.println("Enter Vendor/Saller Name :");
       String n = sc.nextLine();
       vname=n;
    }
     public void display()
     {
        System.out.println("\t"+id +"\t"+desc+"\t\t"+vname);
    }

}
public class A3B1Sales 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        purchase_order p[] = new purchase_order[3];
        for (int i = 0; i < 3; i++) 
        { 
             p[i] = new purchase_order();
             System.out.println("\nEnter "+(i+1)+" Customer Data :");
             System.out.print("Enter ID :");
             int cid = sc.nextInt();
             sc.nextLine();
             System.out.print("Enter Description :");
             String desc = sc.nextLine();
             p[i].setData(cid, desc);
             p[i].accept();
        }
        System.out.println("\n\t\tPurchased Details.\n");
        System.out.println("\tID\tDescription\tCname");
        for (int i = 0; i < 3; i++) 
        {

            p[i].display();

        }
        sales_order s[] = new sales_order[3];
        for (int i = 0; i < 3; i++) 
        {
             s[i] = new sales_order();
             System.out.println("\nEnter "+(i+1)+" Vendor/Saller Data :");
             System.out.println("Enter ID :");
             int cid = sc.nextInt();
             sc.nextLine();
             System.out.println("Enter Description :");
             String desc = sc.nextLine();
             s[i].setData(cid, desc);
             s[i].accept();

        }
        System.out.println("\n\t\tSales Details.\n");
        System.out.println("\tID\tDescription\tVname");
        for (int i = 0; i < 3; i++) 
        {
           s[i].display();
        }

        sc.close();

    }

}