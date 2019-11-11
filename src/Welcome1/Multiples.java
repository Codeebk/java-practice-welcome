/**
 * 
 */
package Welcome1;
import java.util.Scanner;

/**
 * @author codeeking
 *
 */
public class Multiples {
	// main method begins execution of Java application
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter Second integer: ");
		int number2 = input.nextInt();
		
		int remainder = number2 % number1;
		
		if (remainder == 0) {
			System.out.printf("%d is a multiple of %d%n", number1, number2);
		}
		
		else {
			System.out.printf("%d is not a multiple of %d%n", number1, number2);
		}


	} // end method main

} //end class Multiple