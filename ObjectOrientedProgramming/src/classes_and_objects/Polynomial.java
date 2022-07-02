package classes_and_objects;

public class Polynomial {
	
	DyanamicArray coefficient;
	
	public Polynomial() {
		
		coefficient = new DyanamicArray();
	}
	
	public void setCoefficient(int degree, int coeff) {
		
		if(degree >= coefficient.size()) {
			for(int i = coefficient.size() - 1; i < degree; i++) {
				coefficient.add(0);
			}
		}
		coefficient.set(degree, coeff);
	}
	
	public int getCoefficient(int degree) {
		return coefficient.get(degree);
	}
	
	public void print() {
		for(int i =0; i<= coefficient.size(); i++) {
			if(coefficient.get(i) != 0) {
				System.out.print(coefficient.get(i) + "x" + i + " ");
			}
		}
		System.out.println();
	}
	
	public int degree() {
		return coefficient.size();
	}
	
	public Polynomial add(Polynomial p) {
		for(int i = 0; i<p.degree();i++) {
			this.setCoefficient(i, this.getCoefficient(i) + p.getCoefficient(i));
		}
		return this;
	}
	
	public Polynomial subtract(Polynomial p) {
		for(int i = 0; i<p.degree();i++) {
			this.setCoefficient(i, this.getCoefficient(i) - p.getCoefficient(i));
		}
		return this;
	}
	
	public Polynomial multiply(Polynomial p) {
		Polynomial p3 = new Polynomial();
		p3.setCoefficient(this.degree() + p.degree() + 1, 0);
		
		for(int i = 0; i < p.degree(); i++) {
			
			for(int j = 0; j< this.degree(); j++) {
				if(i+j <= p3.degree()) {
					p3.setCoefficient(i + j, p3.getCoefficient(i+j) + this.getCoefficient(j)*p.getCoefficient(i));
				}
				else
					p3.setCoefficient(i + j , this.getCoefficient(j)*p.getCoefficient(i));
			}
		}
		return p3;
	}
}
