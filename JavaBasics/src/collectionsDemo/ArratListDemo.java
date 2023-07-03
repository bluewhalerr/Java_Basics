package collectionsDemo;
import java.util.ArrayList;

public class ArratListDemo {
	public static void main(String[] args) {
		
	
	//Creating an object
	ArrayList<String> cities = new ArrayList<String>();
	
	//Storing values
	
	cities.add("London");
	cities.add("New York");
	cities.add("Paris");
	cities.add("Delhi");
	cities.add("Delhi"); // List allows duplicate items
	
	//for retrieving info we use modified for Loop
	for(String a : cities) {
		System.out.println(a);
	
	}
	System.out.println(cities.indexOf("Paris"));
	System.out.println(cities.get(2));
	System.out.println(cities.size());
}
}