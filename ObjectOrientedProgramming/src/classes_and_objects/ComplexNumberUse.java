package classes_and_objects;

public class ComplexNumberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexNumbers c1 = new ComplexNumbers(3,4);
		ComplexNumbers c2 = new ComplexNumbers(4,5);
		
//		c1.conjugate();
		ComplexNumbers c3 = ComplexNumbers.add(c1,c2);
		c1.print();
		c2.print();
		c3.print();
		
		
	}

}
