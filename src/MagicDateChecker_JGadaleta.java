import javax.swing.JOptionPane;

public class MagicDateChecker_JGadaleta {
	public static void main(String [] args) {
			String monthStr = JOptionPane.showInputDialog("Enter the month as a number");
			int month = Integer.parseInt(monthStr);
			
			String dayStr = JOptionPane.showInputDialog("Enter a day as a num");
			int day = Integer.parseInt(dayStr);
			
			String yearStr = JOptionPane.showInputDialog("Enter a year (last 2 digits only)");
			int year = Integer.parseInt(yearStr);
			
			if((month * day) == year) {
				System.out.println("It's Magic!");
				System.out.println("Life is grand");
			}
			else {
				System.out.println("No Magic for you!");
				System.out.println("How Sad!");
			}
	}
}
