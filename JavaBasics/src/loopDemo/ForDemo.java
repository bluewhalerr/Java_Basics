package loopDemo;

import java.util.Scanner;

public class ForDemo {
	/*public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Enter you age");
		int age = scanner.nextInt();
		System.out.println(name + age);
		scanner.close();
	}*/
	
/*
	public static void main(String[] args) {
		for (int i=0; i<5 ; i++) {
	System.out.println("Blue");
		}
	}
*/
		public static void main(String[] args) {
			int pinInDB = 1234;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please Enter The PIN Number");
		int enteredPin = scanner.nextInt();
		 while (enteredPin != pinInDB) {
			
				System.out.println("Please Enter The Valid Pin Number");
						enteredPin = scanner.nextInt();
			
			}
			}
}


