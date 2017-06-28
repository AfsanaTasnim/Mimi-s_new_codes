
package tasnim;
import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = scr.nextInt();
		System.out.println("Enter another number: ");
		int b = scr.nextInt();
		
		int result = a+b;
		System.out.println("The result is: " + result);
	}

}
