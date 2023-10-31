package queue;

public class QueueUse2 {

	public static void main(String[] args) {
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		queue.enqueue(10);
		queue.enqueue(20);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.enqueue(10);
		queue.enqueue(20);
		System.out.println(queue.size());
		System.out.println(queue.front());

	}

}
