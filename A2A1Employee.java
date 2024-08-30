import java.util.*;
class A2A1Employee {
    int id;
    String name;
    String deptname;
    double salary;
    static int cnt = 0;
    A2A1Employee() 
    {

    }//default counstructor
   void setdata(int id, String name, String deptname, double salary) 
   {
     this.id = id;
     this.name = name;
     this.deptname = deptname;
     this.salary = salary;
      cnt++;
     System.out.println("Count of object : " + cnt);
    }//setdata

    void display() 
    {
    System.out.println(this.id + "\t\t" + this.name + "\t\t" + this.deptname + "\t\t" + this.salary);
    }//displat
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of employee:");
       int n = sc.nextInt();
       A2A1Employee e[] = new A2A1Employee[n];
       for (int i = 0; i < n; i++) 
        {
            e[i] = new A2A1Employee();
            System.out.println("Enter " + (i + 1) + " employee data");
            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee Name:");
            String en = sc.nextLine();
            System.out.println("Enter DeptName:");
            String dn = sc.nextLine();
            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();
            e[i].setdata(id, en, dn, salary);
        }
        System.out.println("Employee Records Are:");
        System.out.println("Id\tEmployee Name\t\tDept Name\tSalary");
        for (int i = 0; i < n; i++) 
        {
          e[i].display();
        }
        sc.close();
    }
}