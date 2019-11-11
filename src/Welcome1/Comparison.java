/**
 * 
 */
package Welcome1;
import java.util.Scanner;

/**
 * @author codeeking
 *
 */
public class Comparison {
	// main method begins execution of Java application
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter Second integer: ");
		int number2 = input.nextInt();
		
		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		if (number1 != number2) {
			System.out.printf("%d is not equal to %d%n", number1, number2);
		}
		
		if (number1 < number2) {
			System.out.printf("%d is less than %d%n", number1, number2);
		}
		
		if (number1 > number2) {
			System.out.printf("%d is greater than %d%n", number1, number2);
		}
		
		if (number1 <= number2) {
			System.out.printf("%d is less than or equal to %d%n", number1, number2);
		}
		
		if (number1 >= number2) {
			System.out.printf("%d is greater than or equal to %d%n", number1, number2);
		}
		

	} // end method main

} //end class Comparison