package Recursion;

public class Solution {
	
	public static boolean checkAB(String input, int si) {
		// Write your code here
      
		if(input.charAt(0) != 'a'){
            return false;
        }
        
        if(si == input.length()){
            return true;
        }
        
        boolean a = checkAB(input , si + 1);
        
        if(input.charAt(si) == 'b'){
         	return a;
        }
        
        if(input.charAt(si) == 'b' && input.charAt(si+1) == 'b'){
            if(si == input.length() -2){
                return a;
            }
            if(si <= input.length() -3){
                if(input.charAt(si + 2) == 'a'){
                    return a;
                }
            }
        }
        
        
        
        
        
        if(input.charAt(si) == 'a'){
            if(si == input.length() -1){
               return a; 
            }
            else if(si <= input.length() - 2 && input.charAt(si +1) == 'b' 
                    && input.charAt(si + 2) == 'b'){
               return a; 
            }
            else if(input.charAt(si +1) == 'a'){
                return a;
            }
        }
        
        return false;
    }
        

    
    public static boolean checkAB(String input){
        return checkAB(input, 0);
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = checkAB("abbaabb");
		System.out.println(a);
	}

}
