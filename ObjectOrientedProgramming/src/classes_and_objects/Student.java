package classes_and_objects;

public class Student {
	String name;
	private int rollNumber;
	
	private static int numStudent ;
	
	public void print() {
		System.out.println(name + " : " + rollNumber);
	}
	
	public static int getnumStudent() {
		return numStudent;
	}
	
	public Student(String n, int rn) {
		name = n;
		rollNumber = rn;
		
		numStudent++;
	}
	
	public void setrollNumber(int rn) {
		
		if(rn <= 0) {
			return;
		}
		rollNumber = rn;
	}
	
	public int getrollNumber() {
		return rollNumber;

	}
	
	
	
}
