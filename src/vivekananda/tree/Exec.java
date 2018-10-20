package vivekananda.tree;

public class Exec extends _40_to_44{
	static TreeNode<Integer> root;
	static TreeNode<Integer> node2;
	static TreeNode<Integer> node3;
	static TreeNode<Integer> node4;
	static TreeNode<Integer> node5;
	static TreeNode<Integer> node6;
	static TreeNode<Integer> node7;
	static TreeNode<Integer> node8;
	
	static TreeNode<Integer> _root;
	static TreeNode<Integer> node_2;
	static TreeNode<Integer> node_3;
	static TreeNode<Integer> node_4;
	static TreeNode<Integer> node_5;
	static TreeNode<Integer> node_6;
	static TreeNode<Integer> node_7;
	static TreeNode<Integer> node_8;
	
	static TreeNode<Character> root_a;
	static TreeNode<Character> node_b;
	static TreeNode<Character> node_c;
	static TreeNode<Character> node_d;
	static TreeNode<Character> node_e;
	static TreeNode<Character> node_f;
	static TreeNode<Character> node_g;
	static TreeNode<Character> node_h;
	
	public static void main(String[] args) {
			
		init();
		
		System.out.println("\n\n40. isMirror: "+isMirror(root, _root));
		System.out.println("41. printNodesFromK: "+printNodesFromK(root,2));

		System.out.println("42. BFS/DFS");
		System.out.println("BFS: "+bfs(root_a));
		System.out.println("DFS: "+dfs(root_a));
		
		System.out.println("43. Traversals:");
		traversal_methods();
		
		System.out.print("\n44. Creating BST: ");
		preorder(createBST(new int[] {3,7,5,2,1}));
		
		
		
	}//end main()

	
	
	private static void traversal_methods() {
		//Tree Traversal
				System.out.print("Inorder: ");
				inorder(root);
				
				System.out.print("\nPreorder: ");
				preorder(root);
				
				System.out.print("\nPostorder: ");
				postorder(root);		
	}



	private static void init() {
		/* 
		 *		 tree initialization
		 * */
		
				root = new TreeNode<Integer>(1);
				
				node2=new TreeNode<Integer>(2);
				node3=new TreeNode<Integer>(3);
				
				node4=new TreeNode<Integer>(4);
				node5=new TreeNode<Integer>(5);
				
				node6=new TreeNode<Integer>(6);
				node7=new TreeNode<Integer>(7);

				//node8=new TreeNode<Integer>(8);

				root.left = node2;
				root.right = node3;
				
				node2.left=node4;
				node2.right=node5;
				
				node3.left=node6;
				node3.right=node7;

				//node4.left=node8;	
				
				/* 
				 *		 "_" tree initialization
				 * */
				
				_root = new TreeNode<Integer>(1);
				
				node_2=new TreeNode<Integer>(2);
				node_3=new TreeNode<Integer>(3);
				
				node_4=new TreeNode<Integer>(4);
				node_5=new TreeNode<Integer>(5);
				
				node_6=new TreeNode<Integer>(6);
				node_7=new TreeNode<Integer>(7);

				node_8=new TreeNode<Integer>(8);

				_root.left = node_3;
				_root.right = node_2;
				
				node_2.left=node_5;
				node_2.right=node_4;
				
				node_3.left=node_7;
				node_3.right=node_6;
				

				/* 
				 *		 "abc" tree initialization
				 * */
				
				root_a = new TreeNode<Character>('a');
				
				node_b=new TreeNode<Character>('b');
				node_c=new TreeNode<Character>('c');
				
				node_d=new TreeNode<Character>('d');
				node_e=new TreeNode<Character>('e');
				
				node_f=new TreeNode<Character>('f');
				node_g=new TreeNode<Character>('g');

				node_h=new TreeNode<Character>('h');

				root_a.left = node_b;
				root_a.right = node_c;
				
				node_b.left=node_d;
				node_b.right=node_e;
				
				node_c.left=node_f;
				node_c.right=node_g;
				
	}//end init
}//end class
