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
    
    public static List<Integer> preorder(TreeNode root,List<Integer> ans)
    {
        if(root==null)
        {
          return ans;
        }
        ans.add(root.val);
        if(root.left!=null)
        {
            preorder(root.left,ans);        
        }
        if(root.right!=null)
        {
            preorder(root.right,ans);        
        }
        return ans;
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> myans = preorder(root,ans);
        return myans;
    }
}