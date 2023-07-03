package exceptionHandelingDemo;
import java.util.*;

public class ExceptionThrow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Day");
		String day = scanner.nextLine();
		if (day.equals("Monday")) {
			throw new ArithmeticException();
			
		}
		else 	{
		System.out.println("Day Entered by the USER = " + day);
		
	

		}
	}
	}