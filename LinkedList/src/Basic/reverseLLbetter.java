package Basic;

import java.util.Scanner;

 class DoubleNode {
	Node<Integer> head;
	Node<Integer> tail;
}


public class reverseLLbetter {

	public static DoubleNode reversebetter(Node<Integer> head) {     // This we are doing to do reverse LL in O(n).
		if(head == null || head.next == null) {
			DoubleNode newnode = new DoubleNode();
			newnode.head = head;
			newnode.tail = head;
			return newnode;
		}
		
		DoubleNode smallAns = reversebetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	
	public static Node<Integer> ReverseLL3(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> tailReversed = head.next;
		Node<Integer> smallAns = ReverseLL3(head.next);
		tailReversed.next = head;
		head.next = null;
		
		return smallAns;
		
		
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
		Node ans = ReverseLL3(head);
		print(ans);
	}

}
