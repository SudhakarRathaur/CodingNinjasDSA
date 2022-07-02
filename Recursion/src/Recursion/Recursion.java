package Recursion;

public class Recursion {

	public static boolean checkSorted(int input[]) {
		
		if(input.length <= 1) {
			return true;
		}
		
		int smallInput[] = new int [input.length - 1];
		for(int i = 1; i < input.length; i++) {
			smallInput[i-1] = input[i];
		}
		
		boolean smallAns = checkSorted(smallInput);
		
		if(!smallAns) {
			return false;
		}
		
		if(input[0] <= input[1]) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static boolean checkSorted2(int input[]) {
			
			if(input.length <= 1) {
				return true;
			}
			
			int smallInput[] = new int [input.length - 1];
			for(int i = 1; i < input.length; i++) {
				smallInput[i-1] = input[i];
			}
			
			if(input[0] > input[1]) {
				return false;
			}
			boolean smallAns = checkSorted2(smallInput);
			return smallAns;
			
			
		}
	
	public static boolean checkSortedBetter(int input[] , int start) {
		if(start == input.length -1) {
			return true;
		}
		if(input[start]  > input[start + 1]) {
			return false;
		}
		
		boolean smallAns = checkSortedBetter(input , start +1);
		return smallAns;
	}
	public static boolean checkSortedBetter(int input[]) {
		return checkSortedBetter(input, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[]= {1,2,3};
		System.out.println(checkSorted(input));
		System.out.println(checkSorted2(input));
		System.out.println(checkSortedBetter(input));
		
	}

}
