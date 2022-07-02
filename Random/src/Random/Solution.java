package Random;

import java.util.*;

public class Solution
{
	 public static boolean isBalanced(String expression) {
	        //Your code goes here
	        Stack<Character> s = new Stack<>();
	        int i = 0;
	        int count1 = 0, count2 = 0;
	        while(i < expression.length()){
	            if(expression.charAt(i) == '(' || expression.charAt(i) == '{' ||expression.charAt(i) == '[' ){
	                count1++;
	                s.push(expression.charAt(i));
	            }
	            if(expression.charAt(i) == ')' || expression.charAt(i) == '}' ||expression.charAt(i) == ']' ){
	                count2++;
	                char a = '\u0000';
	                if(!s.isEmpty())
	                	a = s.pop();
	                if(a != expression.charAt(i) ){
	                    return false;
	                }
	            }
	            
	            i++;
	        }
	        if(count1 != count2){
	            return false;
	        }
	        if(s.isEmpty()){
	            return true;
	        }
	        
	        return false;
	        
	   
	        
	    }
 public static void main(String[] args) 
 {

	 System.out.println(isBalanced("(()))"));
 }
}