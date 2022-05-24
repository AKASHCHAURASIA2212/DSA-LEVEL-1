
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int BT_level(TreeNode root)
    {
        if(root==null)
            return 0 ;
        
        int left = BT_level(root.left);
        int right = BT_level(root.right);
        int max = left>right?left:right;
        
        return max+1;
    }
    public int maxDepth(TreeNode root) {
        return BT_level(root);
    }
}

