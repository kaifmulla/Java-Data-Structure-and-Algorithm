package linkedlist;

import java.util.Scanner;




public class LinkedList2Use {
	
	
public static void printLL(Node<Integer> head) {
		int c = 0;
		
		while(head != null) {
			System.out.print(head.data+" -> ");
			c++;
			head = head.next;
		}
		System.out.println();
	}
	
	
	
	public static Node<Integer> takeInput(){
		
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> temp = head;
		
		while(data != -1) {
			
			if(head == null) {
				head = new Node<Integer>(data);
				temp = head;
				data = s.nextInt();
				
				continue;
			}
				temp.next= new Node<Integer>(data);
				temp = temp.next;	
				data = s.nextInt();
			
		
			
		}
		
		
		return head;
	}
	
	
	public static Node<Integer> insertRecursive(Node<Integer> head, int pos, int data){
		
		if(head == null && pos > 0) {
//			if(pos == 1) {
//				Node<Integer> newNode = new Node<>(data);
//				head.next = newNode;
//				return head;
//			}
//			if(pos == 0) {
//				Node<Integer> newNode = new Node<>(data);
//				newNode.next = head;
//				return newNode;
//			}
			return head;
		}
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;
		}else {
			
			head.next = insertRecursive(head.next, pos-1, data);
			return head;
		}
	}
	
	
	
	public static DoublePair reverseBetter(Node<Integer> head) {
		DoublePair ans;
		if(head == null || head.next == null) {
			ans = new DoublePair();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		
		
		
		
		DoublePair newnode = reverseBetter(head.next);
		newnode.tail.next = head;
		head.next = null;
		ans = new DoublePair();
		ans.head = newnode.head;
		ans.tail = head;
		return ans;
		
		
	}
	
	
	public static Node<Integer> reverseBetter1(Node<Integer> head){
		DoublePair ans = reverseBetter(head);
		return ans.head;
	}
	
	public static Node<Integer> reverseBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> lastnode = reverseBest(head.next);
		Node<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
				
		return lastnode;
	}
	

	public static void main(String[] args) {
		
		Node<Integer> head =  takeInput();
		
		printLL(head);
		
//		head  = reverseBetter1(head);
		head = reverseBest(head);
		printLL(head);
		
//		Node<Integer> ans = insertRecursive(head,10,35);
//		printLL(ans);
		

	}

}
