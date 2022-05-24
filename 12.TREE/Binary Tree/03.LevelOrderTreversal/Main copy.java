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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        
        while(qu.size()>0)
        {   int size = qu.size();
         
           List<Integer> li = new ArrayList<>();
             while(size-->0)
             {
                TreeNode curr = qu.remove();
                 
                 if(curr!=null)
                 {
                     System.out.print(curr.val);
                     li.add(curr.val);
                 }
                 else
                 {
                   continue;
                 }               
                 if(curr.left!=null)
                     qu.add(curr.left);
                 
                 if(curr.right!=null)
                     qu.add(curr.right);           
             }     
         list.add(li);
            
        }
        
        return list;
     
    }
}
