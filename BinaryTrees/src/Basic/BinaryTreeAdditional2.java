package Basic;

public class BinaryTreeAdditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;		
		}
		if(root.left == null && root.right == null) {
			return null;
		}  
		
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int max = Math.max(leftHeight, rightHeight);
		
		return max+1;
		
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(rightHeight = leftHeight) > 1) {
			return false;
		}
		
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}
	
	public static Pair<Integer , Boolean> isBalancedBetter(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Integer , Boolean> p = new Pair<>();   
			p.first = 0;                            // Height
			p.second = true;                        // is Balanced Binary tree or not
			return p;
			}
		
		Pair <Integer, Boolean> leftAns = isBalancedBetter(root.left);
		Pair <Integer, Boolean> rightAns = isBalancedBetter(root.right);
		
		int height = 1 + Math.max(leftAns.first, rightAns.first);
		boolean isBalanceBT = true;
		
		if(Math.abs(rightAns.first - leftAns.first) > 1) {
			isBalanceBT = false;
		}
		
		if(!leftAns.second || !rightAns.second) {
			isBalanceBT = false;
		}
		
		Pair<Integer , Boolean> p = new Pair<>();   
		p.first = height;                            // Height
		p.second = isBalanceBT;                        // is Balanced Binary tree or not
		return p;
		
	}
}
