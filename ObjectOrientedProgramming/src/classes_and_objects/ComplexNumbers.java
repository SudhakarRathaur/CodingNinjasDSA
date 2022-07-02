package classes_and_objects;

public class ComplexNumbers {
	private int real;
	private int imag;
	
	public ComplexNumbers(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public int getreal() {
		return real;
	}
	public int getimag() {
		return imag;
	}
	public void setreal(int real) {
		this.real = real;
	}
	public void setimag(int imag) {
		this.imag = imag;
	}
	
	public void print() {
		if(imag<0) {
			System.out.println(real + " - i" + imag*(-1) );
		}
		else {
		System.out.println(real + " + i" + imag );
		}
	}
	public void plus(ComplexNumbers c) {
		
		this.real  = this.real + c.real;
		this.imag = this.imag + c.imag;
	}
	
	public void multiply(ComplexNumbers c) {
		int a = (this.real * c.real) - (this.imag *c.imag);
        this.imag  = (this.real * c.imag) + (this.imag*c.real);
		this.real = a;
	}
	
	public ComplexNumbers conjugate() {
		this.imag = this.imag * (-1);
		ComplexNumbers c = new ComplexNumbers(real, imag);
		return c;
	}
	
	public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
		int a = (c1.real * c2.real) - (c1.imag *c2.imag);
        int b  = (c1.real * c2.imag) + (c1.imag * c2.real);
        ComplexNumbers c = new ComplexNumbers(a,b);
        return c;
	}
}
