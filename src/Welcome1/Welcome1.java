/**
 * 
 */
package Welcome1;
import java.util.Scanner;

/**
 * @author codeeking
 *
 */
public class Welcome1 {
	// main method begins execution of Java application
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter Second integer: ");
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		
		System.out.printf("sum is %d%n", sum);


	} // end method main

} //end class Welcome1
