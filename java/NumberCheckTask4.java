import java.util.Scanner;

public class NumberCheckTask4 {
 public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
 
 
	System.out.print("Enter a number:");
	double number = scanner.nextDouble();

	if(number > 0){
	System.out.print(number + " is a positive number");

	} else if(number < 0){
	System.out.print(number + " is a negative number");

	} else {
	System.out.print(number + " is zero");
	}
	




}

}

























