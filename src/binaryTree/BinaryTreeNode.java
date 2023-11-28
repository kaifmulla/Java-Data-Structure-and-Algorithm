package binaryTree;

public class BinaryTreeNode<T> {
	
	public T data;
	public BinaryTreeNode<T> left;						// why we are using generic here also? --> If root node is integer then all node should be integer 
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
		
	}

}
