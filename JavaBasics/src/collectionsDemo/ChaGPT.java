package collectionsDemo;
import java.util.*;

public class ChaGPT {
	// Ex : 1
	public static void main(String[] args) {
//        String sentence = "Hello, how are you doing today?";
//        String[] words = sentence.split(" ");
//        int wordCount = words.length;
//        System.out.println("Number of words: " + wordCount);
//        

		// Ex : 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.nextLine();
		String enteredWord = input.replaceAll("\\s", "").toLowerCase().toString();
		String reverseWord = new StringBuilder(enteredWord).reverse().toString();
		boolean isPalindrome = enteredWord.equals(reverseWord);
		if (isPalindrome) {
			System.out.println("Entered Word is Palindrome");
		} else {
			System.out.println("Enterd Word is not Palindrome");
		}
		scanner.close();
		
	}

}