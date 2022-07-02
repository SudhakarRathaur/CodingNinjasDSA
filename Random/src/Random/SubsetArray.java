package Random;
import java.util.*;

public class SubsetArray {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
		return subsets(input, 0);
	}
    
    public static int[][] subsets(int input[], int si){
        
        if(si == input.length){
            int ans [][] = new int [1][0];
            return ans;
        }
        
        int smallans[][] = subsets(input, si+1);
        
        int ans[][] = new int[smallans.length *2][];
        
        int k = 0;
        
        for(int i = 0; i< smallans.length; i++){
            ans[i] = new int[smallans[i].length];
            
            for(int j =0; j< smallans[i].length; j++){
                ans[i][j] = smallans[i][j];
            }
            k++;
        }
        
        for(int i = 0; i< smallans.length; i++){
		    ans[k+i] = new int[smallans[i].length +1];
            
            ans[k+i][0] = input[si];
            
            for(int j = 1; j <= smallans[i].length; j++){
                ans[k+i][j] = smallans[i][j-1];
                
            }
            
        }
        
        return ans;
        
    }


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i< arr.length;i++) {
			arr[i] = sc.nextInt()	;	
			}
		
		int arr1 [] [] = subsets(arr , 0);
		
		for(int i = 0; i< arr1.length; i++)
		{
			for(int j = 0; j< arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		}
		
}
