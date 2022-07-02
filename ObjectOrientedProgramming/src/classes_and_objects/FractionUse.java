package classes_and_objects;

public class FractionUse {
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(20,30);
		f1.print();
		
		f1.setNum(12);
		int d = f1.getDen();
		System.out.println(d);
		f1.print(); 
		
		 f1.setNum(10);
		 f1.print();
		 
		 try {
			 f1.setDen(15);} 
////		 } catch(ZeroDenominatorException e){
////			 System.out.println("please do not input 0 as Denominator");
		  finally {
			 // f.close()  this will always execute
		 }
		 
	
		 f1.print();
		 
		 Fraction f2 = new Fraction(3,4);
		 f1.add(f2); 
		 f1.print();
		 f2.print();
		 
		 Fraction f3 = new Fraction(4,5);
		 f3.multiply(f2); 
		 f3.print();
		 f2.print();
		 
		 Fraction f4 = Fraction.add(f1 , f3);
		 f1.print();
		 f3.print();
		 f4.print();
	}
	
}