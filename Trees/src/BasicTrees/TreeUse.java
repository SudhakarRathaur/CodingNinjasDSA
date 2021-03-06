package BasicTrees;
import java.util.Scanner;

import BasicTrees.Other_Necessity.QueueEmptyException;
import BasicTrees.Other_Necessity.QueueUsingLL;

public class TreeUse {

	public static void main(String[] args) {

//		TreeNode<Integer> root = new TreeNode<>(4); 
//		TreeNode<Integer> node1 = new TreeNode<>(5); 
//		TreeNode<Integer> node2 = new TreeNode<>(6); 
//		TreeNode<Integer> node3 = new TreeNode<>(7); 
//		TreeNode<Integer> node4 = new TreeNode<>(8); 
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//
//		System.out.println(root);
		
////		*****Taking Input
//		Scanner sc = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(sc);
		
		
////		*****Printing Tree	
//		print(root);
		
//		*****Taking Input LevelWise
		TreeNode<Integer> root1 = takeInputLevelWise();
		print(root1);
		
		
	}

	public static TreeNode<Integer> takeInput(Scanner sc) {

		System.out.println("Enter the next Node data");
		int data = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data); 
		System.out.println("Enter the no. of children "+ data);
		int childCount = sc.nextInt();
		
		for(int i = 0; i< childCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":" ;
		for(int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + "," ;
		}
		System.out.println(s);
		for(int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(rootData); 
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter the no. of children of " + frontNode.data);
				int numOfChildren = sc.nextInt();
				for(int i = 0; i < numOfChildren; i++) {
					System.out.println("Enter the " + (i +1) + " th child of " + frontNode.data);
					int child = sc.nextInt();
					TreeNode<Integer> childNode = new TreeNode<>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
//				will not throw exception
				return null;
				
			}
		}
		return root;
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 1;
		for(int i = 0; i < root.children.size(); i++) {
			count+= numNodes(root.children.get(i));
		}
		
		return count;
		
	}
	
	public static int largest(TreeNode<Integer> root) {
		  if(root == null) {
			  return Integer.MIN_VALUE;
		  }
		  int max = root.data;
		  for(int i = 0; i < root.children.size(); i++) {
			  int childLargest = largest(root.children.get(i));
			  if(childLargest > max) {
				  max = childLargest;
			  }
		  }
		  return max;
	}
	
	public static void printAtK(TreeNode<Integer> root, int k) {
		if(k < 0) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
		}
		for(int i = 0; i < root.children.size(); i++) {
			printAtK(root.children.get(i), k-1);
		}
	}
}
