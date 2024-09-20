import java.util.Scanner;

interface Department {
    String DEPT_NAME = "Computer Science";
    String DEPT_HEAD = "Dr. Patil Sir";

    void printData();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int roomNumber;

    Hostel(String hostelName, String hostelLocation, int roomNumber) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.roomNumber = roomNumber;
    }

    void printData() {
        System.out.print(hostelName + "\t\t" + hostelLocation + "\t\t\t" + roomNumber + "\n");
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regNo;
    String electiveSubject;
    double avgMarks;

    Student(int regNo, String studentName, String electiveSubject, double avgMarks, String hostelName,
            String hostelLocation, int roomNumber) {
        super(hostelName, hostelLocation, roomNumber);
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    public void printData() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------");
        System.out.print("RegNo\tStud Name\tElective Sub\tAvgMarks\tHostelName\tHostelLocation\t\tRoomNumber");
        System.out.println("\n----------------------------------------------------------------------------------------------------------");
        System.out.print(regNo + "\t" + studentName + "\t\t" +
                electiveSubject + "\t\t" + avgMarks + "\t\t");
        super.printData();
    }
}

public class A3C1HostelProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, choice, i, flag;
        Student[] students = new Student[20];

        do {
            System.out.println("\n1. Admit new Student");
            System.out.println("2. Migrate a student by Hostel");
            System.out.println("3. Display details of a student");
            System.out.println("0. Exit");
            System.out.println("\nEnter your Choice");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (n < students.length) {
                        System.out.print("Enter Reg number : ");
                        int regNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name : ");
                        String studentName = sc.nextLine();

                        System.out.print("Enter Subject : ");
                        String electiveSubject = sc.nextLine();

                        System.out.print("Enter AvgMarks : ");
                        double avgMarks = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter Hostel Name : ");
                        String hostelName = sc.nextLine();

                        System.out.print("Enter Hostel Location: ");
                        String hostelLocation = sc.nextLine();

                        System.out.print("Enter Room Number : ");
                        int roomNumber = sc.nextInt();

                        students[n] = new Student(regNo, studentName, electiveSubject, avgMarks, hostelName, hostelLocation, roomNumber);
                        n++;
                        System.out.println("Successfully Record Added");
                    } else {
                        System.out.println("Hostel capacity reached.");
                    }
                    break;

                case 2:
                    if (n > 0) {
                        flag = 0;
                        System.out.println("Migrate Student by Hostel Name");
                        System.out.print("Enter Reg Number : ");
                        int rno = sc.nextInt();
                        sc.nextLine();

                        for (i = 0; i < n; i++) {
                            if (students[i].regNo == rno) {
                                System.out.print("Enter New Hostel Name : ");
                                String hname = sc.nextLine();

                                System.out.print("Enter New Hostel Location : ");
                                String lname = sc.nextLine();

                                System.out.print("Enter New Room Number : ");
                                int rnumber = sc.nextInt();
                                sc.nextLine();

                                students[i].hostelName = hname;
                                students[i].hostelLocation = lname;
                                students[i].roomNumber = rnumber;
                                flag = 1;
                                break;
                            }
                        }

                        if (flag == 0) {
                            System.out.println("Invalid Reg Number");
                        }
                    } else {
                        System.out.println("No student records found.");
                    }
                    break;

                case 3:
                    if (n > 0) {
                        flag = 0;
                        System.out.print("Enter Reg Number : ");
                        int rno = sc.nextInt();
                        sc.nextLine();

                        for (i = 0; i < n; i++) {
                            if (students[i].regNo == rno) {
                                students[i].printData();
                                flag = 1;
                                break;
                            }
                        }

                        if (flag == 0) {
                            System.out.println("Invalid Reg Number");
                        }
                    } else {
                        System.out.println("No student records found.");
                    }
                    break;

                case 0:
                    System.out.println("Thank You !!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
