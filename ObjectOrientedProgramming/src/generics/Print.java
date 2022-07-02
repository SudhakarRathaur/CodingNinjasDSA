package generics;

import vehicle.Vehicle;

public class Print {
	
	public static<T> void print(T a[]){
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		
	   Integer a[] = new Integer[10];
	   
	   for(int i = 0; i<a.length; i++) {
		   a[i] = i+1;
	   }
	   
	   print(a);
	   
	   Vehicle v[] = new Vehicle[10]; 
	   
	   for(int  i = 0; i< 10; i++) {
		   v[i] = new Vehicle(10);
	   }
	   
	   print(v);
	}

}
