package classes_and_objects;

public class StudentUse {
	
	public static void main(String[] args) {
	 
	Student s1 = new Student("Sudhakar" , 123);
	Student s2 = new Student("Shikha", 121);
	
//	s1.name = "Sudhakar";
//	s1.setrollNumber(-123);
//	
//	s2.name = "Shikha";
//	s2.setrollNumber(121);
	
	System.out.println(Student.getnumStudent());
	
//	System.out.println(s1.numStudent);
//	System.out.println(s2.numStudent);
//	System.out.println(Student.numStudent);
	 s1.print();
	 s2.print();
	
	
	}
	
}
