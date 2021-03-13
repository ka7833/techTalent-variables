/**
 * @author Kaleab A 
 * Homework: Types, Variables and Operators 
 * Description: A small program created to become familiarized with 
 *             the different compiler errors 
 *  For the purpose of code to work, most of the things are commented out
 */
public class Variables {

// region Class Variables
	static String s1;
	static int num1;
	static float num2;

	public static void main(String[] args) {

		/*Some illegal field names created to see compiler errors 
		String 123someString = "Invalid field 1";
		char int = 'A';
		float some Value = 5.5f;
		int .num3 = 5;
		*/
		
        String s2;
		boolean isInitalized;

		System.out.println("s1: " + s1);
		//System.out.println("s2: " + s2);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		//System.out.println("isInitalized: " + isInitalized);
	}
}
