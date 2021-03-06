package Basic;
import java.util.Scanner;

import BasicTreeNecessity.QueueEmptyException;
import BasicTreeNecessity.QueueUsingLL;


public class BinaryTreeUse {

	public static void main(String[] args) {

//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//		root.left = node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//		root.right = node2;
//		System.out.println();

		
////		/******* taking input and printing
//		Scanner sc = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = takeInput(sc);
//		printTree(root);
//		sc.close();
		
////		/******* taking input and printing levelwise
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		printTree(root);
//		
////		/******* finding Diameter
//		
//		Scanner sc = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		printTree(root);
//		System.out.println("diameter " +  diameter(root));
//		
//		/******* finding Diameter Better
		
		Scanner sc = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
		System.out.println("diameter " +  heightDiameter(root).first);
		System.out.println("diameter " +  heightDiameter(root).second);

		
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner sc){
		int rootData;
		System.out.println("Enter the root data");
		rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(sc);
		root.right = takeInput(sc);
		
		return root;
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		String toBePrinted = root.data + "";
		if(root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		if(root.right != null) {
			toBePrinted += "R:" + root.right.data + ",";
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner (System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Eneter the root data");
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter the left child of " + front.data);
			int leftChild = sc.nextInt();
			
			
			if(leftChild != -1) {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftChild);
				front.left = left;
				pendingNodes.enqueue(left);
			}
			
			System.out.println("Enter the right child of " + front.data);
			int rightChild = sc.nextInt();
			
			if(rightChild != -1) {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightChild);
				front.right = right;
				pendingNodes.enqueue(right);
			}
			
		}
		return root;
	}
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		return ans;
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
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int option1 = height(root.left) + height(root.right) + 1;  // adding the height of root as +1
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		int ans = Math.max(Math.max(option1, option2), option3);
		return ans;
		
	}
	
	public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Integer, Integer> output = new Pair<>();
			output.first = 0;
			output.second = 0;     // first is height and second is diameter
			return output;
		}
		
		Pair<Integer, Integer> leftOutput = heightDiameter(root.left);
		Pair<Integer, Integer> rightOutput = heightDiameter(root.right);
		
		int height  = 1 + Math.max(leftOutput.first, rightOutput.first);
		int option1 = leftOutput.first + rightOutput.first;
		int option2 = leftOutput.second;
		int option3 = rightOutput.second;
		int diameter = Math.max(Math.max(option1, option2), option3);
		
		Pair<Integer, Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;     // first is height and second is diameter
		return output;
		
	}
	public static void inorder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	
}
