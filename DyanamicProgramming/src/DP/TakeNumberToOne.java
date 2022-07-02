package DP;

public class TakeNumberToOne {

	public static void main(String[] args) {

		System.out.println(countStepsDP(10));
		System.out.println(countMinStepsToOne(10));
		System.out.println(countStepsM(10));
		
	}

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        if(n == 1){
            return 0;
        }
        
        int option1 = countMinStepsToOne(n-1);
        
        int minSteps = option1;
        
        if(n % 2 == 0){
            int option2 = countMinStepsToOne(n/2);
            if(option2 < minSteps){
                minSteps = option2;
            }
        }
        
        if(n % 3 == 0){
            int option3 = countMinStepsToOne(n/3);
            if(option3 < minSteps){
                minSteps = option3;
            }
        }
        
        return minSteps + 1;
	}
	
	public static int countStepsM(int n) {
		int storage[] = new int[n+1];
		return countStepsM(n, storage);
	}
	public static int countStepsM(int n, int storage[]) {
		if(n == 1) {
			storage[n] = 0;
			return storage[n];
		}
		
		if(storage[n] != 0) {
			return storage[n];
		}
		
		int option1 = countStepsM(n-1, storage);
        
        int minSteps = option1;
        
        if(n % 2 == 0){
            int option2 = countStepsM(n/2, storage);
            if(option2 < minSteps){
                minSteps = option2;
            }
        }
        
        if(n % 3 == 0){
            int option3 = countStepsM(n/3 , storage);
            if(option3 < minSteps){
                minSteps = option3;
            }
        }
        storage[n] = minSteps + 1;
        return storage[n];
	}
	
	public static int countStepsDP(int n) {
		int storage[] = new int[n+1];
		storage[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			int minSteps = storage[i -1]; 
			
			if(i % 3 == 0) {
				if(storage[i/3] < minSteps) {
					minSteps = storage[i/3];
				}
			}
			
			if(i % 2 == 0) {
				if(storage[i/2] < minSteps) {
					minSteps = storage[i/2];
				}
			}
			
			storage[i] = minSteps + 1;
		}
		return storage[n];
	}
}
