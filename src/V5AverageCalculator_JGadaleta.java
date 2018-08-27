import java.util.Scanner;

public class V5AverageCalculator_JGadaleta {

	public static void main(String[] args) {
		Scanner
			kb = new Scanner(System.in);
		
		//get and store first name
		System.out.print("Enter first name:\t");
		String firstName = kb.nextLine();
		//get and store last name
		System.out.print("Enter last name:\t");
		String lastName = kb.nextLine();
		//get and store 1-3
		System.out.print("Enter test 1:\t\t");
		double test1 = kb.nextDouble();
		System.out.print("Enter test 2:\t\t");
		double test2 = kb.nextDouble();
		System.out.print("Enter test 3:\t\t");
		double test3 = kb.nextDouble();
		//calculate average test grade
		double avg = (test1 + test2 + test3) / 3;
		//Print out the average to the user using the user's initals
		String initials = " " + firstName.charAt(0) +  lastName.charAt(0) + " ";
		System.out.println("\n\nThe average test score for" + initials + "is " + avg + ".");
		kb.close();
	}

}
