import java.util.Scanner;

public class SquaredNumberTask1{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

	int number = 5;
	int Square = 1;

	System.out.print("Enter first integers: ");
	int number1 = scanner.nextInt(); 

	System.out.print("Enter second integer: ");
	int number2 = scanner.nextInt();

	int square1 = number1 * number1;
        int square2 = number2 * number2;

	System.out.println("The square of " + number1 + " is: " + square1);
        System.out.println("The square of " + number2 + " is: " + square2);


   }



 }