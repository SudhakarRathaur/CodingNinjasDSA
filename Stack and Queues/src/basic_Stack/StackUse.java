package basic_Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException {
	
//		StackUsingArrays stack = new StackUsingArrays();
//		
//		for(int i = 0; i <35 ; i++) {
//			stack.push(i);
//		}
//		
//		while(! stack.isEmpty()) {
//			try {
//				System.out.print(stack.pop() + " ");
//			} catch (StackEmptyException e) {
//				// TODO Auto-generated catch block
////				never executes
//			}
//		}

		
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		for(int i = 0; i <5 ; i++) {
			stack.push(i);
		}
		
		while(! stack.isEmpty()) {
			try {
				System.out.print(stack.pop() + " ");
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
//				never executes
			}
		}
	}

}
