import java.util.Scanner;

/**
 * Create a program that translates English to Morse Code. Use periods and hyphens as dots and dashes.
 * 
 * Your program will accept user input and convert it to Morse Code.
 * 
 * See Page 603 of the textbook for a Morse Code to Letter Conversion Table (or Google it)
 * 
 * You can treat upper/lowercase letters equally.
 * 
 * Put one space between each grouping of dots/dashes. See example output below.
 * 
 * @author Josh Alcoba
 * 
 */

public class MorseCodeTranslator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", ",", "?"};
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",  "-.--", "--..", " ", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--.."};    

		
		System.out.print("Please enter a statement to translate: ");
		String statement = keyboard.nextLine().toLowerCase();

		System.out.print("Morse Code: ");

		for (int i = 0; i < statement.length(); i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (statement.substring(i, (i + 1)).equals(alpha[j])) {
					System.out.print(morse[j] + " ");
				}
			}
		}
		
		keyboard.close();
		  
		  
		/*** SAMPLE INPUT/OUTPUT
		 * 
		 * Please enter some text: Hello World
		 * Morse Code: .... . .-.. .-.. --- .-- --- .-. .-.. -..
		 * 
		 */

      
	}

}
