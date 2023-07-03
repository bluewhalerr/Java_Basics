package collectionsDemo;

import java.util.*;
public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<String>();
		
		cities.add("London");
		cities.add("New York");
		cities.add("Paris");
		cities.add("Delhi");
		cities.add("Delhi");
		
		//for retrieving info we use modified for Loop
		for(String a : cities) {
			System.out.println(a);
		
		}

		System.out.println(cities.size());
	}
	}


