package Basic;

import java.util.Scanner;

public class InsertRecursive {
	
	 public static Node<Integer> insert(Node<Integer> head, int pos, int ele){
		 if(pos == 0) {
			 Node<Integer> newnode = new Node<>(ele);
			 newnode.next = head;
			 return newnode;
		 }
		 
		 if(head == null) {
			 return head;
		 }
		 
		head.next = insert(head.next , pos-1, ele);
		return head;
		 
	 }
	 public static Node<Integer> takeInput(){
			
			Node<Integer> head = null;
			
			Scanner sc = new Scanner(System.in);
			int data = sc.nextInt();
			
			while(data != -1) {
				Node<Integer> newnode = new Node<Integer>(data);
				
				if(head == null) {
					head = newnode;
				}
				else {
					Node<Integer> temp = head;
					
					while(temp.next != null) {
						temp = temp.next;
					}
					
					temp.next = newnode;
				}
				
				data = sc.nextInt();
			}
			return head;
				
		}
	 public static void print(Node<Integer> head) {
			Node<Integer> temp = head;
			while( temp!= null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			
			System.out.println();
		}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insert(head , 2 , 10);
		print(head);
		
		
	}

}
