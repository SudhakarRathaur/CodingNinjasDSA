package if_else;
import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        
        System.out.println("*");
        int i = 1;
         
        while(i<=n){
            
            System.out.print("*");
            int j =1;
            while(j<=i){
               System.out.print(j);
                j++;
            }
            
            j = j-2;
            while(j>=1){
                System.out.print(j);
            	j--;
            }
            System.out.println("*");
         i++;   
        }
        int k = n-1;
        while(k>=1){
            
            System.out.print("*");
            int j =1;
            while(j<=k){
               System.out.print(j);
                j++;
            }
            
            j = j-2;
            while(j>=1){
                System.out.print(j);
            	j--;
            }
            System.out.println("*");
         k--;   
        }
        System.out.println("*");
        
        
	}

}