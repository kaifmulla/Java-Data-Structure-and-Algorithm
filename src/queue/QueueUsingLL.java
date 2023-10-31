package queue;

import linkedlist.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public void enqueue(T elem) {
		Node<T> newNode = new Node<>(elem);
		if(size == 0) {		
			front = newNode;
			rear = newNode;
			size++;
			return;
		}
		rear.next = newNode;
		rear = newNode;
		size++;
		return;
		
	}
	public T front() {
		if(size == 0) {
			return null;
		}
		return front.data;
		
	}
	public T dequeue() {
		if(size == 0) return null;
		
		T ans = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return ans;
		
	}
	
}
