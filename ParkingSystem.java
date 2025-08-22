import java.util.Scanner;

public class ParkingSystem{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    while (true){ 

	System.out.println("Parking System Menu:);
	System.out.println("1. park a car");
	System.out.println("2. Rmove a car ");
	System.out.println("3. Display parking status ");
	System.out.println("4. Exit");
	System.out.println("Enter your choice:"); 
	
	int choice = input.nextInt();
	input.nextLine();
   
	if (choice == 1) {
                System.out.print("Park a car: ");
                String slots = input.nextLine();
                ParkingSystem.lot(slots);

            else if (choice == 2) {
                System.out.print(" Remove a car: ");
                String slots = input.nextLine();
                if (parkingSystem.remove(slots)) {
                    System.out.println(slots + " removed.");
                } else {
                    System.out.println("slots not found.");
                }
            } 
            else if (choice == 3) {
                if (Parkingslots.isOccupied()) {
                    System.out.println(" is occupied.");
                } else {
                    System.out.println("Display your parking status:");
                    for (String slots : Parkingslots) {
                        System.out.println("- " + slot);
                    }
                }
            } 
            else if (choice == 4) {
                System.out.println(" Exit ");
                
                break;
            } 
            else {
                System.out.println("");
            }
        }
    }

  
}
}
}   







 