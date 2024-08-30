import java.util.*;

public class A2A2studentsort {
    int roll_no;
    String name;
    double per;

    A2A2studentsort() 
    {

    }// default counstructor

    void setdata(int roll_no, String name, double per) 
    {
        this.roll_no = roll_no;
        this.name = name;
        this.per = per;

    }// setdata

    void display() {
        System.out.println(this.roll_no + "\t\t" + this.name + "\t\t" + this.per);
    }// display

    static void sort(A2A2studentsort a[], int n) 
    {
        A2A2studentsort temp = new A2A2studentsort();
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i].per > a[j].per) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student:");
        int n = sc.nextInt();
        A2A2studentsort s[] = new A2A2studentsort[n];

        for (int i = 0; i < n; i++) 
        {
            s[i] = new A2A2studentsort();

            System.out.println("Enter " + (i + 1) + " student data");

            System.out.println("Enter Roll no:");
            int rn = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student Name:");
            String name = sc.nextLine();

            System.out.println("Enter Percentage:");
            double per = sc.nextDouble();

            s[i].setdata(rn, name, per);
        } // for

        System.out.println("\nStudent Records Are:\n");
        System.out.println("R.No\t\tStud Name\tPercentage");
        for (int i = 0; i < n; i++) 
        {
            s[i].display();
        }

        A2A2studentsort.sort(s, n);
        System.out.println("\nSorted Student Details:\n");
        System.out.println("R.No\t\tStud Name\tPercentage");
        for (int i = 0; i < n; i++) 
        {
            s[i].display();
        }
        sc.close();
    }// main
}// class
