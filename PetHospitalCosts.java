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
    double medCharges = calcMedicationCharges();
    double labServCharges = calcLabServiceCharges();
    double totalCharge = 0;
    String anotherPatient = "";
    
    do {
      if (checkIfOvernight() == true) {
        // Ask for how many nights & add in overnight charges to calc
        System.out.println("Type number of overnight stays required: ");
        Scanner in = new Scanner(System.in);
        int numNights = in.nextInt();
        
        if (numNights > 0) { 
          double overnightCharges = calcOvernightCharges(numNights);
          totalCharge = overnightCharges + medCharges + labServCharges;
        }
      }
      else {
        totalCharge = medCharges + labServCharges;
      }
      
      // %5.2f - at least 5 spaces total
      System.out.printf("Total charge: $%5.2f", totalCharge);
      System.out.println();
      System.out.println();
      
      System.out.println("Is there another patient? (y/n)");
      Scanner in2 = new Scanner(System.in);
      anotherPatient = in2.next();
      
      if (!( (anotherPatient.equals("y")) || (anotherPatient.equals("n")) )) {
        System.out.println("Is there another patient? (y/n)");
        Scanner in3 = new Scanner(System.in);
        anotherPatient = in3.next();
      }
      
    } while (anotherPatient.equalsIgnoreCase("y")); // Use instead of .toLowerCase()
     
  } // End of: main()
  
  public static boolean checkIfOvernight() {
    System.out.println("Is this an overnight stay? (y/n) ");
    Scanner in1 = new Scanner(System.in);
    String isOvernight = in1.next();
    isOvernight = isOvernight.toLowerCase();
    
    if (!( (isOvernight.equals("y")) || (isOvernight.equals("n")) )) {
      System.out.println("Is this an overnight stay? (y/n) ");
      Scanner in2 = new Scanner(System.in);
      isOvernight = in1.next();
      isOvernight = isOvernight.toLowerCase();
    }
    
    if (isOvernight.equals("y")) { // Strings require .equals
      return true;
    }
    else {
      return false;
    }
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
