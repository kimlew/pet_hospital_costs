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
  //int numNights = 0;

  public static void main(String[] args) {
    System.out.println("Is this an overnight stay? (y/n) ";
    
    System.out.println("Type number of overnight stays required: ");
    Scanner in = new Scanner(System.in);
    int numNights = in.nextInt();
    
    double overnightCharges = calcOvernightCharges(numNights);
    double medCharges = calcMedicationCharges();
    double labServCharges = calcLabServiceCharges();
    double totalCharge = overnightCharges + medCharges + labServCharges;
    
    // %5.2f - at least 5 spaces total
    System.out.printf("Total charge: $%5.2f", totalCharge);
    System.out.println();
  }
  
  public static double calcOvernightCharges(int numNights) {
    double cleanBedding = 10.50;
    double cleanRoom = 50.00;
    
    double totalOvernightCosts = numNights * (cleanBedding + cleanRoom);
    return totalOvernightCosts;
  }
  
  public static double calcMedicationCharges() {
    double antiseptic = 10;
    double genAnaesthetic = 75;
    
    double totalMedicCharges = antiseptic + genAnaesthetic;
    return totalMedicCharges;
  }
  
  public static double calcLabServiceCharges() {
    double bloodTest = 125;
    double urineTest = 120;
    
    double totalMedicCharges = bloodTest + urineTest;
    return totalMedicCharges;
  }
  
} // End of: class

