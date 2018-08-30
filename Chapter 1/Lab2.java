//creates the tools that we use
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2 {
	public static void main(String [] args) {
		Scanner
			kb = new Scanner(System.in); //keyboard entries
		String //declares all the strings to be used later
			firstName,
			midName,
			lastName,
			fullName,
			initials,
			position;
			
		int //creates the age
			age;
		
		/*
		 * This is one comment
		 */
		
		/** This is another */
		
		//this is a third
		
		System.out.print("Enter your First Name\t");
		firstName = kb.nextLine(); //asks for the name
		System.out.print("Enter your Middle Name\t");
		midName = kb.nextLine(); //asks for the middle name
		System.out.print("Enter your Last Name\t");
		lastName = kb.nextLine();//asks for lastname
		fullName = firstName + " " + lastName; //concatinates first and last with a space
		initials = "" + firstName.toUpperCase().charAt(0) + midName.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0);
		System.out.print("Enter your age\t");
		age = kb.nextInt();
		System.out.print("Enter the postion you are applying for\t");
		kb.nextLine();
		position = kb.nextLine();
		
		for(int i = 0; i < 120; i++) {
			System.out.print("*");
		}
		System.out.print("\nThe Application Information is Below\n" + 
		"\tFull Name:\t\t" + fullName.toUpperCase() + "\n\tInitials:\t\t" + initials +
		"\n\tAge:\t\t\t" + age + "\n\tDesired Postion:\t" + position);
		
		String
			cityOfBirth = JOptionPane.showInputDialog("Enter the City where you were born"),
			stateOfBirth = JOptionPane.showInputDialog("Enter the state where you were born"),
			birthInfo = "Applicant was born in: " + cityOfBirth + ", " + stateOfBirth.toUpperCase();
		JOptionPane.showMessageDialog(null, birthInfo);
		
		double
			raduis = Double.parseDouble(JOptionPane.showInputDialog("Enter the raduis of the sphere")),
			volume = ((4.0/3) * Math.PI * Math.pow(raduis, 3.0));
		JOptionPane.showMessageDialog(null, "The area of the sphere is " + volume, "Volume", 1);
		
		kb.close();
		System.exit(0);
	}
}
