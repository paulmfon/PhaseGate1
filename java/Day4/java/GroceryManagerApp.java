import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        while (true) {
            System.out.println("Grocery List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Show list");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter item: ");
                String item = input.nextLine();
                groceryList.add(item);
                System.out.println(item + " added.");
            } 
            else if (choice == 2) {
                System.out.print("Enter item to remove: ");
                String item = input.nextLine();
                if (groceryList.remove(item)) {
                    System.out.println(item + " removed.");
                } else {
                    System.out.println("Item not found.");
                }
            } 
            else if (choice == 3) {
                if (groceryList.isEmpty()) {
                    System.out.println("List is empty.");
                } else {
                    System.out.println("Your Grocery List:");
                    for (String item : groceryList) {
                        System.out.println("- " + item);
                    }
                }
            } 
            else if (choice == 0) {
                System.out.println("Goodbye!");
                
                break;
            } 
            else {
                System.out.println("Invalid option. Try 0-3.");
            }
        }
    }
}