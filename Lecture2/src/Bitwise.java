import java.util.Arrays;

public class Bitwise {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        
        int n = matrix.length;
        if(n==0)
            return;
        int m = matrix[0].length;
        
        
       
        int count = 0;
        int rs = 0 , cs = 0;
        int re = n -1, ce = m-1;
        
        while(count <= n*m){
            
            for(int j = cs; j<= ce; j++){
				
                System.out.print(matrix[rs][j] + " ");
                count++;
            }
            rs++;
            
             for(int j = rs; j<= re; j++){
				
                System.out.print(matrix[j][ce] + " ");
                count++;
            }
            ce--;
            
             for(int j = ce; j>= cs; j--){
				
                System.out.print(matrix[re][j] + " ");
                count++;
            }
            re--;
            
             for(int j = re; j>= rs; j--){
				
                System.out.print(matrix[j][cs] + " ");
                count++;
            }
            cs++;
        }
      
	}
	
	public static void main(String[] args) {
		int arr[][] = {{1,2, 3}, {0, 9, 4}, {18, 18, 2}, {4, 5, 6} };
		spiralPrint(arr);
		
		//System.out.println(Arrays.toString(arr));
	
	}
}
