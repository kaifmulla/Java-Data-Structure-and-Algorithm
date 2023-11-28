package bst;

import java.util.ArrayList;

import binaryTree.BinaryTreeNode;

public class BST {
	
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
	
	
	public static boolean checkisBst(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return true;
		}
		
		int leftmax = largest(root.left);
		int rightmin = minimum(root.right);
		
		if(root.data <= leftmax) {
			return false;
		}
		if(root.data >  rightmin) {
			return false;
		}
		boolean isleft = checkisBst(root.left);
		boolean isright = checkisBst(root.right);
		return isright && isleft;
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int left = minimum(root.left);
		int right = minimum(root.right);
		
		int small = Math.min(root.data, Math.min(left, right));
		return small;
	}


	private static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int left = largest(root.left);
		int right = largest(root.right);
		
		int large = Math.max(root.data, Math.max(left, right));
		return large;
	}
	
	public static IsBstPair checkisBstBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			IsBstPair ans = new IsBstPair(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
			return ans;
		}
		
		IsBstPair left = checkisBstBetter(root.left);
		IsBstPair right = checkisBstBetter(root.right);
		
		IsBstPair ans = new IsBstPair();
		ans.isBst = false;
		if(left.isBst && left.max < root.data && right.min >= root.data && right.isBst) {
			ans.isBst = true;
		}
		ans.max = Math.max(root.data, Math.max(left.max, right.max));
		ans.min = Math.min(root.data, Math.min(left.min, right.min));
		return ans;
		
	}
	
	public static boolean checkisBstbest(BinaryTreeNode<Integer> root, int min, int max) {
		if(root == null) {
			return true;
		}
		
		if(root.data < min || root.data > max) {
//			System.out.println(root.data);
			return false;
		}
		
		boolean left = checkisBstbest(root.left, min, root.data-1);
		boolean right = checkisBstbest(root.right, root.data, max);
		return left&&right;
	}
	
	public static ArrayList<Integer> pathtoroot(BinaryTreeNode<Integer> root, int find){

		if(root == null) {
			return null;
		}
		if(root.data == find) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(root.data);
			return arr;
		}
		
		ArrayList<Integer> left = pathtoroot(root.left,find);
		if(left != null) {
			left.add(root.data);
			return left;
		}
		
		ArrayList<Integer> right = pathtoroot(root.right, find);
		if(right != null) {
			right.add(root.data);
			return right;
		}
		
		return null;
		
		
		
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<>(2);
		root.left = rootleft;
		BinaryTreeNode<Integer> rootright = new BinaryTreeNode<>(6);
		root.right = rootright;
		BinaryTreeNode<Integer> twoleft = new BinaryTreeNode<>(1);
		rootleft.left = twoleft;
		BinaryTreeNode<Integer> tworight = new BinaryTreeNode<>(3);
		rootleft.right = tworight;
		BinaryTreeNode<Integer> sixleft = new BinaryTreeNode<>(5);
		rootright.left = sixleft;
		BinaryTreeNode<Integer> sixright = new BinaryTreeNode<>(7);
		rootright.right = sixright;
		
//		printSpecific(root);
		
//		boolean isBst = checkisBst(root);
//		System.out.println(isBst);
		
//		IsBstPair ans = checkisBstBetter(root);
//		System.out.println(ans.isBst);
		
		boolean ans1 = checkisBstbest(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(ans1);
		
		ArrayList<Integer> arr = pathtoroot(root,8);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
