package basic_Stack;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		this.head = null;
		size = 0;
	}
	
	public int size() {
		
		return size;
	}
	
	public T top() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public boolean isEmpty() {
		
		return size == 0;
	}
	
	public void push(T element) {
		Node<T> newnode  = new Node<T>(element);
		newnode.next = head;
		head = newnode;
		size++;
		
	}
	
	public T pop() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		
	
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	
}
