
import java.util.Scanner;

public class firstweekexercise {
	//This program asks the user for two numbers and then averages them
	
	public static void main(String[] args) {
	
		//Declare variables for the program
		Scanner in = new Scanner(System.in);
		double number1 = 0;
		double number2 = 0;
		double numAverage = 0;
		
		//Gets input from user
		System.out.print("Enter the first number:");
		number1 = in.nextDouble();
		System.out.print("Enter the second number: ");
		number2 = in.nextDouble();
	
		//Calculates the average of the two numbers and displays the results
		numAverage = ((number1 + number2)/2);
		System.out.println("The average of the two numbers is: " + numAverage);
				

	}

}