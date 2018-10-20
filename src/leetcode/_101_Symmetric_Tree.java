package leetcode;

import vivekananda.tree.TreeNode;

public class _101_Symmetric_Tree {
	public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }//end method
    
    public static boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;
        
        if(node1.val == node2.val){
            return isSymmetric(node1.left, node2.right) &&  isSymmetric(node1.right, node2.left); 
        }   
        return false;
    }//end helper
}
