package stack;

import linkedlist.Node;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public void push(T elem) {
		Node<T> node = new Node<>(elem);
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
		size++;
	}
	
	public T pop() {
		if(size == 0) {
			return null;
		}
		Node<T> temp = head;
		head = head.next;
		size--;
		temp.next = null;
		return temp.data;
		
		
		
	}
	
	public T top() {
		if(size == 0) {
			return null;
		}
		return head.data;
	}
	
}
