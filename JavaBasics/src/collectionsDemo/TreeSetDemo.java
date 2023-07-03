package collectionsDemo;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		
	
	//Creating an object
	TreeSet<String> cities = new TreeSet<String>();
	
	//Storing values
	
	cities.add("London");
	cities.add("New York");
	cities.add("Paris");
	cities.add("Delhi");
	
	//for retrieving info we use modified for Loop--Retrieve the info by ALPHABETICAL ORDER & for numbers is Ascending order
	for(String a : cities) {
		System.out.println(a);
	
	}
	
	System.out.println(cities.size());
}



}


