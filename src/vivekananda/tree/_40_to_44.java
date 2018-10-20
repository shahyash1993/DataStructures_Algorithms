package vivekananda.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _40_to_44 extends _30_to_39 {

	/* 40. */
	public static <T> String printNodesFromK(TreeNode<T> root,  int k) {
		String res = printNodesFromK_helper(root, new StringBuilder(), k);
		return res.toString();
	}// end printNodesFromK

	public static <T> String printNodesFromK_helper(TreeNode<T> root, StringBuilder builder, int k) {
		
		//if(root==null) return builder.toString();
		if(root!=null) {
			if(k==0) {
				builder.append(root.val);
				return builder.toString();
			}
			
			printNodesFromK_helper(root.left, builder, k-1);
			printNodesFromK_helper(root.right, builder, k-1);
		}
		
		return builder.toString();
		
	}// end printNodesFromK

	/* 41. */
	public static <T> boolean isMirror(TreeNode<T> t1, TreeNode<T> t2) {

		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;

		if (t1.val == t2.val) {

			boolean t1_left__t2_right = isMirror(t1.left, t2.right);
			boolean t1_right__t2_left = isMirror(t1.right, t2.left);

			return t1_left__t2_right && t1_right__t2_left;
		}

		return false;
	}// end isMirror
	
	/* 42. BFS DFS*/
	public static String dfs(TreeNode<Character> root) {
		
		Stack<TreeNode<Character>> stack = new Stack<TreeNode<Character>>();
		ArrayList<Character> res = new ArrayList<Character>();

		TreeNode<Character> temp = root;
		
		while(temp!= null || !stack.isEmpty()) {
			
			while(temp!=null) {
				stack.push(temp);
				res.add(temp.val);
				temp = temp.left;
			}//end loop
			
			temp = stack.pop();
			temp = temp.right;
		}//end loop
		
		return res.toString();
	}//end dfs
	
	public static String bfs(TreeNode<Character> root) {
		
		Queue<TreeNode<Character>> queue = new LinkedList<TreeNode<Character>>();
		queue.add(root);
		ArrayList<Character> res = new ArrayList<Character>();
		
		TreeNode<Character> temp;
		while(!queue.isEmpty()) {
			temp = queue.poll();
			res.add(temp.val);
			
			if(temp.left != null)	queue.add(temp.left);
			if(temp.right != null)	queue.add(temp.right);
		}//end loop

		return res.toString();
	}//end bfs
	
	/* 43. Traversal Methods*/
	public static <T> void inorder(TreeNode<T> node) {
		if(node == null) return;
	
		inorder(node.left);
		System.out.print(node.val+" ");
		inorder(node.right);
	}//end inorder
	
	public static <T> void preorder(TreeNode<T> node) {
		if(node == null) return;
	
		System.out.print(node.val+" ");
		preorder(node.left);
		preorder(node.right);
	}//end preorder

	public static <T> void postorder(TreeNode<T> node) {
		if(node == null) return;
	
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.val+" ");
	}//end preorder

	/* 44. Create BST*/
	public static TreeNode<Integer> createBST(int[] arr) {
		if(arr.length == 0) return null;
		
		TreeNode<Integer> root = new TreeNode<Integer>(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			TreeNode<Integer> p = root;
			TreeNode<Integer> q = new TreeNode<Integer>(arr[i]);
			
			while(true) {
				if(q.val > p.val) {
					if(p.right == null) {
						p.right = q;
						break;
					}
					else p = p.right;
				}
				else {
					if(p.left == null) {
						p.left = q;
						break;
					}
					else p = p.left;
				}
			}//end tree placement trav
		}//end trav loop
		
		return root;
	}//end createBST
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end class
