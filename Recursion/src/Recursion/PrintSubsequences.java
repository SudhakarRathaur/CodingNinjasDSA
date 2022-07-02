package Recursion;

public class PrintSubsequences {
	
	 public static void seq(String str, String ans) {
		 if(str.length() == 0) {
			 System.out.println(ans);
			 return;
		 }
		 
		 seq(str.substring(1), ans);
		 seq(str.substring(1), ans + str.charAt(0));
	 }

	public static void main(String[] args) {
		seq("abc" , "");
	}
}
