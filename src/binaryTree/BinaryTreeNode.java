package binaryTree;

public class BinaryTreeNode<T> {
	
	T data;
	BinaryTreeNode<T> left;						// why we are using generic here also? --> If root node is integer then all node should be integer 
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
		
	}

}
