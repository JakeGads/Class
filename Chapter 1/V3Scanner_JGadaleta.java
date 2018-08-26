import java.util.Scanner;

public class V3Scanner_JGadaleta {
	public static void main(String [] args) {
		Scanner //creates the scanner object 
			input = new Scanner(System.in);
		
		System.out.println("Enter a floating point value:\t"); //output promt
		double
			val = input.nextDouble(); //wait for user
		
		System.out.println("You entered " + val); //show the line
		
		input.close();
	}
}
