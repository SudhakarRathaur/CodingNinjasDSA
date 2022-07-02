package Recursion;

public class TowerOfHanoi___REVISE {
	
	
	public static void towerOfHanoi(int disks, String source, String destination, String helper) {
		if(disks == 1) {
			System.out.println("move "+ disks + " from " + source + " to " + destination);
			return;
		}
		
		towerOfHanoi(disks - 1, source, helper, destination);
		System.out.println("move "+ disks + " from " + source + " "+ "to " + destination);
		towerOfHanoi(disks - 1, helper, destination, source);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3,"source", "destination", "helper");
	}

}
