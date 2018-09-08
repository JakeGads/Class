import java.util.Scanner;

public class SwitchBasics_JGadaleta {
	public static void main(String [] args) {
		Scanner
			input = new Scanner(System.in);
		
		System.out.print("Please Enter a command\t");
		
		String
			text = input.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("Machine Started!");
			break;
		case "stop":
			System.out.println("Machine Stopped!");
			break;
		default:
			System.out.println("Command not recognized");
			break;
		}
		input.close();
	}
}
