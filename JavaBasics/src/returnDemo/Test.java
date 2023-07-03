package returnDemo;

public class Test {
	
	public String fullName(String firstName) {
		String fullName = firstName + " Jackson";
		return fullName;
	}
	public static void main(String[] args) {
		Test test = new Test();
		String completeName = test.fullName("Michael");
		System.out.println(completeName);
		
	}
}
