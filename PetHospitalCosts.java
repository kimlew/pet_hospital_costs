/* Pet patient hospital stay calculation
Program that computes & displays total charges for pet patient hospital stay

Overnight stay, have:
- hospital overnight charges
- medication charges
- lab service charges

Not an overnight stay, have:
- medication charges 
- lab service charges

Calculate the charges
Print the final total
Ask user if they want to calculate the charges for another patient
 */
import java.util.Scanner;


public class PetHospitalCosts {

    public static void main(String[] args) {
        System.out.println("Type number of overnight stays required: ");
    }

    
    public static double calcOvernightCharges() {
      double cleanBedding = 10.50;
      double cleanRoom = 50.00;
    
    }
    
    public static double calcMedicationCharges() {
      double antiseptic = 10;
      double genAnaesthetic = 75;
    }
    
    public static double calcLabServiceCharges() {
      double bloodTest = 125;
      double urineTest = 120;
    }
    
} // End of: class

