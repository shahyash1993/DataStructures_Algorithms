package vivekananda.tree;

public class TreeNode<T> {
	public TreeNode left; 
	public TreeNode right;
	public T val;
	
	public TreeNode() {
	}//end constructor
	
	public TreeNode(T val) {
		this.val = val;
	}//end constructor
}//end class
