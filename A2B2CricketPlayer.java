import java.util.*;
public class A2B2CricketPlayer
{
    String name;
    int no_of_innings;
    int no_of_times_notout;
    double totatruns;
    double bat_avg;
    void setdata(String pn, int ni, int no, Double tr) 
    {
        name = pn;
        no_of_innings = ni;
        no_of_times_notout = no;
        totatruns = tr;
    }
    static void avg(A2B2CricketPlayer a[], int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            a[i].bat_avg = (a[i].totatruns / (a[i].no_of_innings - a[i].no_of_times_notout));
        }
    }
    void display() 
    {
        System.out.println(name + "\t\t\t" + no_of_innings + "\t\t" + no_of_times_notout + "\t\t" + totatruns + "\t\t" + bat_avg);
    }

    static void sort(A2B2CricketPlayer a[], int n) 
    {
        A2B2CricketPlayer temp = new A2B2CricketPlayer();
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i].bat_avg < a[j].bat_avg) 
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
        System.out.println("Enter no of Player:");
        int n = sc.nextInt();
        A2B2CricketPlayer cp[] = new A2B2CricketPlayer[n];
        for (int i = 0; i < n; i++) {
            cp[i] = new A2B2CricketPlayer();
            System.out.println("Enter " + (i + 1) + " Player data");
            System.out.println("Enter Player Name : ");
            sc.nextLine();
            String pn = sc.nextLine();
            System.out.println("Enter no of Innings:");
            int ni = sc.nextInt();
            System.out.println("Enter no of times NotOut :");
            int no = sc.nextInt();
            System.out.println("Enter Total Runs :");
            Double tr = sc.nextDouble();
           cp[i].setdata(pn, ni, no, tr);
        }
       System.out.println("\n\t\t\t\t**Player Records**\n");
      System.out.println("Player Name \tNo_Of_Innings \tNo_Of_Times_NotOut \tTotal Runs \tBat Avg");

        A2B2CricketPlayer.avg(cp, n);
        for (int i = 0; i < n; i++) 
        {
            cp[i].display();
        }
    System.out.println("\n\t\t\t\t**Sorted Player Records**\n");
    A2B2CricketPlayer.sort(cp, n);
        System.out.println("Player Name \tNo_Of_Innings \tNo_Of_Times_NotOut \tTotal Runs \tBat Avg");
        for (int i = 0; i < n; i++) 
        {
              cp[i].display();
        }
 sc.close();
    }
}

