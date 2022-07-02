package DP2;

public class Knapsack01 {
	
	public static int knapsackDP(int weights[], int values[], int maxWeight) {
		int n = weights.length;
		int dp[][] = new int[n + 1][maxWeight + 1];
		for(int j = 0; j <= maxWeight; j++) {
			dp[n][j] = 0;
		}
		
		for(int i = n-1; i >= 0; i--) {
			for(int j = 0; j <= maxWeight; j++) {
				int ans;
				if(weights[i] > j) {
					ans = dp[i+1][j];
				}
				else {
					int op1 = values[i] + dp[i+1][j - weights[i]];
					int op2 = dp[i+1][j];
					ans = Math.max(op1, op2);
				}
				
				dp[i][j] = ans;
			}
		}
		
		return dp[0][maxWeight];
	}

	public static int knapsackM(int[] weights, int values[], int maxWeight) {
//		
		int m = weights.length;
		int n = maxWeight;
		int dp[][] = new int[m+1][n+1];
		
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				dp[i][j] = -1;
			}
		}
		return knapsackM(weights, values, maxWeight, 0, dp);
		
	}
	public static int knapsackM(int[] weights, int[] values, int maxWeight, int i, int dp[][]) {
		
		if(dp[i][maxWeight] != -1) {
			return dp[i][maxWeight];
		}
		
		if(i == weights.length || maxWeight == 0) {
			dp[i][maxWeight] = 0;
			return dp[i][maxWeight];
		}
		
		if(weights[i] > maxWeight) {
			dp[i][maxWeight] = knapsackM(weights, values, maxWeight, i+1, dp);
			return dp[i][maxWeight];
		}
		else {
			// include this ith item
			int op1 = values[i] + knapsackM(weights, values, maxWeight - weights[i], i+1, dp);
			// don't include ith item
			int op2 = knapsackM(weights, values, maxWeight, i+1, dp);
			
			dp[i][maxWeight] = Math.max(op1, op2);
			return dp[i][maxWeight];
		}
	}
	
	public static int knapsack(int[] weights, int[] values, int maxWeight) {
		return knapsack(weights, values, maxWeight, 0);
	}
	public static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
		
		if(i == weights.length || maxWeight == 0) {
			return 0;
		}
		
		if(weights[i] > maxWeight) {
			return knapsack(weights, values, maxWeight, i+1);
		}
		else {
			// include this ith item
			int op1 = values[i] + knapsack(weights, values, maxWeight - weights[i], i+1);
			// don't include ith item
			int op2 = knapsack(weights, values, maxWeight, i+1);
			
			return Math.max(op1, op2);
		}
	}
	
	public static void main(String[] args) {
		
	}

	

}
