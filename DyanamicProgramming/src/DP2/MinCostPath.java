package DP2;

public class MinCostPath {
	
	public static int minCostPath(int arr[][]) {
		return minCostPath(arr, 0 , 0);
	}
	// Min Cost path from cell (i, j) to cell (m- 1, n-1) 
	private static int minCostPath(int[][] arr, int i, int j) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		if(i == m-1 && j== n-1) {
			return arr[i][j];
		}
		
		if(i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		int op1 = minCostPath(arr, i, j+1);
		int op2 = minCostPath(arr, i+1, j+1);
		int op3 = minCostPath(arr, i+1, j);
		
		return arr[i][j] + Math.min(Math.min(op2, op1), op3);
		
	}
	
	public static int minCostPathM(int arr[][]) {
		int dp[][] = new int[arr.length][arr[0].length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		return minCostPathM(arr, 0 , 0, dp);
	}
	
	private static int minCostPathM(int[][] arr, int i, int j, int [][]dp) {
		
		int m = arr.length;
		int n = arr[0].length;
		if(i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		if(i == m-1 && j== n-1) {
			dp[i][j] = arr[i][j];
			return dp[i][j];
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		int op1 = minCostPathM(arr, i, j+1, dp);
		int op2 = minCostPathM(arr, i+1, j+1, dp);
		int op3 = minCostPathM(arr, i+1, j, dp);
		
		dp[i][j] = arr[i][j] + Math.min(Math.min(op2, op1), op3);
		return dp[i][j];
		
	}
	
	public static int minCostPathDP(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		int dp[][] = new int[m][n];
		dp[0][0] = arr[0][0];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) { 
				if(i > 0 && j > 0 ) {
					dp[i][j] = arr[i][j] + Math.min(Math.min(dp[i][j-1], dp[i-1][j-1]), dp[i-1][j]);
				}
				
				if(j == 0) {
					dp[i][j] = arr[i][j] + dp[i-1][j];
				}
				if(i == 0) {
					dp[i][j] = arr[i][j] + dp[i][j-1];
				}
			}
		}
		return dp[m-1][n-1];
	}

	public static void main(String[] args) {
		
		
	}

}
