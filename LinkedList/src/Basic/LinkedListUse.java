package Basic;
import java.util.*;
public class LinkedListUse {
	
	
	
	public static Node<Integer> takeInput1(){
		
		Node<Integer> head = null, tail = null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newnode = new Node<Integer>(data);
			
			if(head == null) {
				head = newnode;
				tail = newnode;
			}
			else {
				tail.next = newnode;
				tail = newnode;
			}
			
			data = sc.nextInt();
		}
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
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		
	
		Node<Integer> newnode = new Node<Integer>(data);
		
		if(pos == 0) {
			newnode.next = head;
			head = newnode;
			return newnode;
		}
		Node<Integer> temp = head;
		int i = 0;
		
		while(i < pos -1) {
			temp = temp.next;
			i++;
		}
		
		newnode.next = temp.next;
		temp.next = newnode;
		
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput1();
		head = insert(head, 80, 0);
		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		
//		Node<Integer> node2 = new Node<Integer>(20);
//		node1.next = node2;
//		
//		Node<Integer> node3 = new Node<Integer>(30);
//		node2.next = node3;
//		
//		Node<Integer> head = node1; 
		
	}

}
