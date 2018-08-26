
public class V2StringBasics_JGadaleta {
	public static void main(String [] args) {
		int 
			myInt= 7;
		double
			myDouble = 7.8;
		String 
			text = "Hello",
			blank = " ",
			name = "Bob",
			greeting = text + blank + name;
		
		System.out.println(greeting);
		System.out.println("Hello" + " " + "Bob");
		System.out.println("My Integer is:\t" + myInt);
		
		System.out.println("my number is:\t" + myDouble + ".");
	}
}