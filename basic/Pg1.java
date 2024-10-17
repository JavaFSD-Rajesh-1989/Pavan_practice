package basic;



import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Pg1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.offer(20);
		queue.offer(1000);
		queue.offer(20000);
		queue.offer(19);
		queue.offer(200);
		
		System.out.println(queue);
		
		 while (!queue.isEmpty()) {
	            System.out.println(queue.poll()); // Outputs 5, 3, 1
	        }
		
	}

}
