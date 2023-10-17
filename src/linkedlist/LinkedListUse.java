package linkedlist;

public class LinkedListUse {
	
	public static void increment(Node<Integer> head) {
		
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	
	public static void printLL(Node<Integer> head) {
		
		while(head != null) {
			System.out.print(head.data+" -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> n1 = new Node<>(10);
		System.out.println(n1);
		System.out.println(n1.data);
		System.out.println(n1.next);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Node<Integer> head = n1;
		printLL(head);
		increment(head);
		printLL(head);
		
		

	}

}
