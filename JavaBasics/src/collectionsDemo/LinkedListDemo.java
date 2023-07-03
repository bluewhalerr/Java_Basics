package collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {
	
	

		public static void main(String[] args) {
			
		
		//Creating an object
		LinkedList<String> cities = new LinkedList<String>();
		
		//Storing values
		
		cities.add("London");
		cities.add("New York");
		cities.add("Paris");
		cities.add("Delhi");
		
		//for retrieving info we use modified for Loop
		for(String a : cities) {
			System.out.println(a);
		
		}
		System.out.println(cities.indexOf("Paris"));
		System.out.println(cities.get(2));
		System.out.println(cities.size());
	}
	}


