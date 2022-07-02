package basic_Stack;

public class StackUsingArrays {
	private int data [];
	private int top;
	
	public StackUsingArrays() {
		data = new int[10];
		top = -1;
	}
	public StackUsingArrays(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		if(this.top == -1) {
			return true;
		}
		else {
			return false;
		}
		
//		return (top == -1);  
	}
	
	public int size() {
		return top + 1;
	}
	
	public int top() throws StackEmptyException {
		if(size() == 0) {
//			will be throwing Stack Empty Exception
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException {
		if(size() == data.length) {
			resize();
		}
		top++;
		data[top] = elem;
	}
	
	public int pop() throws StackEmptyException {
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}

	public void resize() {
		int temp [] = new int[2*data.length];
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
}


