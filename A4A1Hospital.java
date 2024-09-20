import java.util.*;

// Custom exception
class HealthException extends Exception {
    String msg = "I'm sorry! You're Covid Positive(+)\nNeed to be Hospitalized\n";

    // Override the toString() method
    public String toString() {
        return msg;
    }
}

// Class representing the Patient
class Patient {  // Capitalize class name
    String pname;
    byte page;
    int p_oxy_level;
    int p_HRTC_report;

    // Constructor for Patient
    Patient(String p, byte a, int ol, int pr) {
        pname = p;
        page = a;
        p_oxy_level = ol;
        p_HRTC_report = pr;
    }

    // Display method to show patient details
    public void display() {
        System.out.println("\n\t\tPatient Details\n");
        System.out.println("\tPatient Name\tPatient Age\tOxygen_level\tHRTC_Report");
        System.out.println("\t" + pname + "\t\t" + page + "\t\t" + p_oxy_level + "\t\t" + p_HRTC_report);
    }
}

// Main class for hospital application
public class A4A1Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input details
            System.out.println("Enter Patient Name: ");
            String pn = sc.nextLine();

            System.out.println("Enter Patient Age: ");
            byte pa = sc.nextByte();  // Use 'byte' instead of 'Byte'

            System.out.println("Enter Oxygen Level: ");
            int ol = sc.nextInt();

            System.out.println("Enter HRTC Report: ");
            int pr = sc.nextInt();

            // Create a new patient
            Patient p = new Patient(pn, pa, ol, pr);

            // Check oxygen level and HRTC report
            if (p.p_oxy_level < 95 && p.p_HRTC_report > 10) {
                throw new HealthException();  // Throw the custom exception
            }

            // Display patient details
            p.display();

        } catch (HealthException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Close the scanner
        sc.close();
    }
}
