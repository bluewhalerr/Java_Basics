package exceptionHandelingDemo;
import java.util.Scanner;


public class ExceptionHandelingDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		try {
	
		
		System.out.println("Please Enter The Number");
		int num1 = scanner.nextInt();
		
		System.out.println("Please Enter an Another Nuber");
		int num2 = scanner.nextInt();
		
		System.out.println("Result =" + + (num1/num2));
		}
		
finally   {
	System.out.println("Please Enter The Valid Number");
					
		}

		
	
		}

}
