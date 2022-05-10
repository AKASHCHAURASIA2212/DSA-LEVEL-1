public class Main {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public ArrayList<TreeNode> roottonode(TreeNode node,int data)
    {
        if(node==null)
        {
            ArrayList<TreeNode> base = new ArrayList<>();
            return base;
        }
        if(node.val==data)
        {
            ArrayList<TreeNode> base = new ArrayList<>();
            base.add(node);
            return base;
        }
        
        ArrayList<TreeNode> left = roottonode(node.left,data);
        if(left.size()>0)
        {
            left.add(node);
            return left;
        }
        
            ArrayList<TreeNode> right = roottonode(node.right,data);
        if(right.size()>0)
        {
            right.add(node);
            return right;
        }
        
        return left.size()>right.size()?left:right;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> P = roottonode(root,p.val);
        ArrayList<TreeNode> Q = roottonode(root,q.val);  
        
        int i = P.size()-1;
        int j = Q.size()-1;
        TreeNode ans = null;
         while(i>=0 && j>=0)
         {
             if(P.get(i).val!=Q.get(j).val){
                 break;
             }
              ans = P.get(i);
             i--;
             j--;
         }
        
        return ans;

        
        
    }
}
}
