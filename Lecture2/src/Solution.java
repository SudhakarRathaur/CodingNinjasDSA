import java.util.Scanner;

class Solution {
    
	public static boolean kaprekarNumber(int n){
        int n2 = n * n;
        int n2copy = n2;
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        int l = 0 , r = 0;
        int j = 0;
        while(count > 0){
            int rem = n2 % 10;
            rem = rem * (int)Math.pow(10 , j);
            j++;
            r = r + rem ;
            n2 = n2 / 10;
            count--;

        }
        l = n2;

        if(l + r == n2copy)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        boolean ans = kaprekarNumber(45);
        System.out.println(ans);
    }
}
