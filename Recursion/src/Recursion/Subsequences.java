package Recursion;

public class Subsequences {
	
	public static String[] findSubSeq(String str) {
		if(str.length() == 0) {
			String ans[] = {""};
			return ans;
		}
		
		String[] smallAns = findSubSeq(str.substring(1));
		
		String[] ans = new String[2*smallAns.length];
		
		for(int i = 0; i< smallAns.length; i++) {
			ans[i] = smallAns[i];
		}
		for(int i = 0; i<smallAns.length; i++) {
			ans[smallAns.length + i] = str.charAt(0) + smallAns[i];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		String s = "xyz";
		String[] a = findSubSeq(s);
		
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
