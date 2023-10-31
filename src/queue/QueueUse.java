package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		
		QueueUsingArray queue = new QueueUsingArray();
//		System.out.println(queue.front());
		queue.enqueue(11);
		queue.enqueue(22);
		queue.enqueue(33);
		queue.enqueue(44);
		queue.enqueue(55);
		queue.enqueue(66);
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.size());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
		System.out.println(queue.front());
//		System.out.println(queue.size());
		
	
	}

}
