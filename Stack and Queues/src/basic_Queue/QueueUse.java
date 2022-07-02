package basic_Queue;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		QueueUsingArray queue = new QueueUsingArray(3);
//		for(int i = 1; i <= 5; i++) {
//			try {
//				queue.enqueue(i);
//			} catch (QueueFullException e) {
//				
//			}
//		}
//		
//		while( ! queue.isEmpty()) {
//			try {
//				System.out.println(queue.dequeue());
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
//		Queue Using LinkedList
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		for(int i = 1; i <= 10; i++) {
			queue.enqueue(i);
		}
		
		while( ! queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
