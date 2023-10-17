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
		System.out.println(c);
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

	public static void main(String[] args) {
		
		Node<Integer> head =  takeInput();
		
		printLL(head);
		

	}

}
