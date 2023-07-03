package constructorDemo;

public class Car {
	
	
	//Name of the constructor should be same as the Class Name
	private String color;
	private String engineType;
	
	//Creating a constructor with the parameters
	public Car(String colorOfCar , String typeOfEngine ) {//parametrized constructor
		 color = colorOfCar ;
		 engineType = typeOfEngine ;
	}
	
	//No Argument Constructor
	
	public Car() {
		color = "White";
		engineType = "H2O";
	}
	
	//Creating a method to implement 
	
	public void outPut() {
		System.out.println("Color of the CAR:" + color);
		System.out.println("Engine Type:" + engineType);
	}
	
	public static void main(String[] args) {
		//To invoke the constructor we need to write the parameters as well in the object
		Car mercedes = new Car("Sliver" , "Disel");
		Car audi = new Car("Black" , "Petrol");
		Car bmw = new Car();
		mercedes.outPut();
		audi.outPut();
		bmw.outPut();
	}

}
