package DP2;

public class LCS {
	
	public static int lcs(String s, String t) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		
		if(s.charAt(0) == t.charAt(0)) {
			return 1 + lcs(s.substring(1), t.substring(1));
		}
		else {
			int op1 = lcs(s, t.substring(1));
			int op2 = lcs(s.substring(1), t);
			int op3 = lcs(s.substring(1), t.substring(1));   // By the way this will be considered in op1 and op2, Make tree to better understand
			
			return Math.max(op1, Math.max(op2, op3));
		}
		
		
	}
	
	public static int lcsM(String s, String t) {
		int dp[][] = new int [s.length() + 1][t.length() + 1];
		for(int i = 0; i <=s.length(); i++) {
			for(int j = 0; j <=t.length(); j++) {
				dp[i][j] = -1;
			}
		}
		return lscM(s, t, dp);
		
	}
	

	private static int lscM(String s, String t, int[][] dp) {
		
		int m = s.length();
		int n = t.length();
		
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		
		if(s.charAt(0) == t.charAt(0)) {
			dp[m][n] = 1 + lscM(s.substring(1), t.substring(1) , dp);
			return dp[m][n];
		}
		else {
			int op1 = lscM(s, t.substring(1), dp);
			int op2 = lscM(s.substring(1), t, dp);
			
			dp[m][n] = Math.max(op1, op2);
			return dp[m][n];
		}
		
	
	}

	public static int lcsDP(String s, String t) {
		int m = s.length();
		int n = t.length();
		
		int dp[][] = new int [m + 1][n + 1];
		for(int i = 0; i <= m; i++) {
			dp[i][0] = 0;
		}
		
		for(int j = 0; j <= n; j++) {
			dp[0][j] = 0;
		}
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(s.charAt(m - i) == t.charAt(n - j)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[m][n];
		 
	}

	public static void main(String[] args) {
		String s ="adgeegigeigeegegegeegigeigee";
		String t = "abeegegeegigeigeeeadafa";
		
		System.out.println(lcsDP(s,t));
		
		System.out.println(lcsM(s,t));
		
		System.out.println(lcs(s,t));
		
	}

}
