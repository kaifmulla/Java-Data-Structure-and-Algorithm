package queue;

public class QueueUsingArray {
	
	private int data[];
	private int rear;
	private int front;
	private int size;
	
	public QueueUsingArray() {
		
		data = new int[3];
		
//		this.head = -1;
		this.rear = -1;
		this.front = -1;
		this.size = 0;
	}
	public QueueUsingArray(int capacity) {
		
		data = new int[5];
		this.rear = -1;
		this.front = -1;
		this.size = 0;
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int front() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enqueue(int elem) {
		if(size == data.length) {
			doubleCapacity();
		}
		if(size == 0) {
			front = 0;
			rear = 0;
			data[front] = elem;
			size++;
			return;
		}
		
		
//		rear++;
		rear = (rear+1) % data.length;
		data[rear] = elem;
		size++;
		
	}
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i = front ; i < temp.length ; i++) {
			data[index++] = temp[i];
		}
		for(int i = 0; i <= rear ; i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length - 1;
		
	}
	public int dequeue() {
		if(size == 0) {
			return -1;
		}
		int ans = data[front];
//		front++;
		front = (front+1) % data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1; 
		}
		return ans;
	}
	
	
	

}
