package Recursion;

public class Keypad {
	
	public static String[] keypad(int n){
		// Write your code here
        if(n == 0 || n ==1){
            String ans[] = {""};
            return ans;
        }
        
        String[] smallAns = keypad(n/10);
        int a = n % 10;
        
        char charArr []  = helper(a);
        
        String ans[] = new String[charArr.length*smallAns.length];
        int k = 0;
        
        for(int i = 0; i < charArr.length; i++){
            
            for(int j = 0; j< smallAns.length; j++){
                
                ans[k] = charArr[i] + smallAns[j];
                k++;
            }
            
        }
        
        return ans;
        

	}
	public static char[] helper(int a){
//		char ans[] = new char[4];
        switch(a){
        	
            case 0: 
                char ans1 [] = {};
                return ans1;
                
            
        	 case 1: 
              char ans2 [] = {};
                return ans2;
                
             case 2: 
                 char ans3 [] = {'a', 'b', 'c'};
                 return ans3;
                
               
             case 3: 
                char ans4[] = {'d', 'e', 'f'};
                return ans4;
                
             case 4: 
                char ans5[] = {'g', 'h', 'i'};
                return ans5;
                
             case 5: 
                char ans6[] = {'j', 'k', 'l'};
                return ans6;
                
             case 6: 
                char  ans7[] = {'m','n', 'o'};
                return ans7;
                
             case 7: 
                char ans8[] = {'p', 'q', 'r', 's'};
                return ans8;
                
             case 8: 
                char ans9[] = {'t', 'u', 'v'};
                return ans9;
                
             case 9: 
                char ans10[] = {'w', 'x', 'y', 'z'};
                return ans10;
                
            default:
                break;
                
            
        }
		return null;
    
    }

	public static void main(String[] args) {
		String s = "xyz";
		String[] a = keypad(234);
		
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
