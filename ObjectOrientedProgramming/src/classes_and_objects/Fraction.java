package classes_and_objects;

public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int num , int den) {
		this.num = num;
		if( den == 0) {
			
			// TODO error out
		}
		this.den = den;
		simplify();
		
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public void setNum(int n) {
		this.num = n;
		simplify();
	}
	
	public void setDen(int d) throws ZeroDenominatorException {
		if(d == 0) {
			ZeroDenominatorException e = new ZeroDenominatorException();
			throw e;
		}
		this.den = d;
		simplify();
	}
	
	public void print() {
//		if(den == 0) {
//			return;
//		}
		
		if(den == 1) {
			System.out.println(num);
			}
		else {
			System.out.println(num + "/" + den);
		}
	}
	
	private void simplify() {
		int gcd = 1;
		int small = Math.min(num, den);
		for(int i = 2; i<=small;i++) {
			
			if(num % i == 0 && den % i == 0) {
				gcd = i;
			}
			
		}
		num = num /gcd;
		den = den /gcd;
	}
	
	public void add(Fraction f2) {
		
		this.num = this.num*f2.den + this.den*f2.num;
		this.den = this.den * f2.den;
		simplify();
	}
	
	public void multiply(Fraction f2) {
		this.num = this.num * f2.num;
		this.den = this.den * f2.den;
		
		simplify();
		
	}
	
	public static Fraction add(Fraction f1 , Fraction f2) {
		int newNum = f1.num*f2.den + f1.den*f2.num;
		int newDen = f1.den * f2.den;
		Fraction f3 = new Fraction(newNum, newDen);
		
		return f3;
	}
}
