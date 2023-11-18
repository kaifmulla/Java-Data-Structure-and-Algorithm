package binaryTree;

import java.util.Scanner;

public class BinaryTreeNodeUse {
	
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
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInput(){
		
		
		System.out.println("Enter the rootdata");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(rootData);
		node.left = takeInput();
		node.right = takeInput();
		return node;
		
	}
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parent, boolean isLeft){
		
		
		
		if(isRoot) {
			System.out.println("Enter the root of tree: ");
			
		}
		else {
			if(isLeft) {
				System.out.println("Enter the left child of "+parent);
			}
			else {
				System.out.println("Enter the right child of "+parent);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(rootData);
		
		node.left = takeInputBetter(false,node.data,true);
		node.right = takeInputBetter(false, node.data, false);
		
		
		return node;
	}
	
	public static int noofnodes(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
//		int count = 1;
//		
//		count += noofnodes(root.left);
//		count += noofnodes(root.right);
//		return count;
		
		int leftc  = noofnodes(root.left);
		int rightc = noofnodes(root.right);
		return 1 + leftc+rightc;
		
	}
	
	public static int largestnode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		
		int data = root.data;
		int left = largestnode(root.left);
		int right = largestnode(root.right);
		data = Math.max(data, Math.max(left, right));
		return data;
		
	}
	
	

	public static void main(String[] args) {
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
//		BinaryTreeNode<Integer> root = takeInput();
		BinaryTreeNode<Integer> root2 = takeInputBetter(true,0, true);
		
		
//		System.out.println(root.data);
//		System.out.println(root.left.data);
//		System.out.println(root.right.data);
//		System.out.println(root.left.right.data);
//		System.out.println(root.right.left.data);
		printSpecific(root2);
		System.out.println(noofnodes(root2));
		System.out.println(largestnode(root2));
		
		
	}

}
