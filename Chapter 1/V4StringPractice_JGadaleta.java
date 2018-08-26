
public class V4StringPractice_JGadaleta {

	public static void main(String[] args) {
		//print vs println
		
		//first block
		System.out.print("Line 1\n");
		System.out.println("Line 2");
		System.out.print("Line 3\n\n");
		//second block
		System.out.print("Line 4");
		System.out.println();
		System.out.println();
		System.out.println("Line 5");
		System.out.println("Line 6\n");
		
		//escape sequences slide
		
		//Example Escape Seq 1
		System.out.print("These are our top sellers:\n\tComputer Gamer\n\tCoffe\n\tAsprin\n" + 
		"With these escape sequenses, complex output text can be achieved\n");
		System.out.println();
		//Example Escape Seq 2
		System.out.print("The cop shouted, \"Hands up or I\'ll shoot\"\n");
		//Example Escape Seq 3
		System.out.println("Please Open the Following file: ");
		System.out.print("C:\\Program Files\\Java\\README.txt");
		//Understanding String Methods
		String s = "Lots of Text";
		char c = 'K';
		System.out.println("\n" + c); //printed out c so my project wouldn't have any warnings
		int length_of_s = s.length();
		System.out.println("The Length of s is " + length_of_s);
		System.out.println("The character in spot 0 is " + s.charAt(0));
		System.out.println("The character in spot 3 is " + s.charAt(3));
		System.out.println("The character in spot 8 is " + s.charAt(8));
		System.out.println("The last letter in s is " + s.charAt(11));
		System.out.println("The last letter in s is " + s.charAt(length_of_s - 1));
		String s2 = "I love JAVA Programming! Yay!*#&";
		int length_of_s2 = s2.length();
		System.out.println("The last letter in s2 is " + s2.charAt(length_of_s2 - 1));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
	}

}
