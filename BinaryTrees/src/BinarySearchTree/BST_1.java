package BinarySearchTree;

import Basic.BinaryTreeNode;

public class BST_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int Maximum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data, Math.max(Maximum(root.left), Maximum(root.right)));
		
		
	}
	public static int Minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data, Math.min(Minimum(root.left), Minimum(root.right)));
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftMax = Maximum(root.left);
		int rightMin = Minimum(root.right);
		
		if(root.data <= leftMax) {
			return false;
		}
		if(root.data > rightMin) {
			return false;
		}
		
		boolean leftAns = isBST(root.left);
		boolean rightAns = isBST(root.right);
		
		if(leftAns && rightAns) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Pair<Boolean, Pair<Integer , Integer>> isBSTBetter1(BinaryTreeNode<Integer> root){ // (boolean = isBST , (first = min, second = max))
		  if(root == null) {
			  Pair<Boolean, Pair<Integer , Integer>> output = new Pair<>();
			  output.first = true;
			  output.second = new Pair<Integer, Integer>();
			  output.second.first = Integer.MAX_VALUE;
			  output.second.second = Integer.MIN_VALUE;
			  
			  return output;
		  }
		  
		  Pair<Boolean, Pair<Integer , Integer>> leftOutput = isBSTBetter1(root.left);
		  Pair<Boolean, Pair<Integer , Integer>> rightOutput = isBSTBetter1(root.right);
		  
		  
		  boolean isBST = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first)
				  				&& leftOutput.first && rightOutput.first ;
		  
		  int max = Math.max(root.data , Math.max(leftOutput.second.second, rightOutput.second.second));
		  int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		  
		  
		  Pair<Boolean, Pair<Integer , Integer>> output = new Pair<>();
		  output.first = isBST;
		  output.second = new Pair<Integer, Integer>();
		  output.second.first = min;
		  output.second.second = max;
		  
		  return output;	
	}
	
	 public static boolean isBSTBetter2(BinaryTreeNode<Integer> root , int min , int max) { // for very first root node min = -infinite and max = +infinite
		 if(root == null) {
			 return true;
		 }
		 
		 if(root.data < min || root.data > max) {
			 return false;
		 }
		 
		 boolean isleftOk = isBSTBetter2(root.left , min , root.data - 1);
		 boolean isrightOk = isBSTBetter2(root.right , root.data , max);
		 
		 return isleftOk && isrightOk ;
	 }
	 
	 
	 
}
