package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse2 {
	
	public static void printSpecific(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" : ");
		if(root.left != null) {
			System.out.print("L"+ root.left.data+ ", ");
		}
		if(root.right != null) {
			System.out.print("R"+ root.right.data);
		}
		System.out.println();
		printSpecific(root.left);
		printSpecific(root.right);
	}
	
	
	
	public static BinaryTreeNode<Integer> takeInputLevelwise(){
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data :- ");
		
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> elem = queue.poll();
			System.out.println("Enter the left of :- "+elem.data);
			int left = s.nextInt();
			if(left == -1) {
				elem.left = null;
			}
			else {
				BinaryTreeNode<Integer> leftnode = new BinaryTreeNode<Integer>(left);
				elem.left = leftnode;
				queue.add(leftnode);
			}
			
			
			System.out.println("Enter the right of :- "+elem.data);
			int right = s.nextInt();
			if(right == -1) {
				elem.right = null;
			}
			else {
				BinaryTreeNode<Integer> rightnode = new BinaryTreeNode<Integer>(right);
				elem.right = rightnode;
				queue.add(rightnode);
			}
			
			
		}
		
		
		
		return root;
	}

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInputLevelwise();
		printSpecific(root);

	}

}
