package Priority_Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPQComparator maxComparator = new MaxPQComparator();
		
		PriorityQueue<Integer> pq1 = new PriorityQueue(maxComparator);                 // for max PQ
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());   // for max PQ
		
		PriorityQueue<Integer> pq = new PriorityQueue();                         // for MIN PQ
	}

	class MaxPQComparator implements Comparator<Integer>{           // can be done for Strings
		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1 < o2) {
				return 1;
			}
			else if(o1 > o2){
				return -1;
			}
		    return 0;
		    
		}
		
		
	}
}
