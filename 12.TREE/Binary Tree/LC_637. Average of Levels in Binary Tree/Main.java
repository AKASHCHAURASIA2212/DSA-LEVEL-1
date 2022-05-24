public class Main {
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        
        qu.add(root);
        
        while(qu.size()>0)
        {   int size = qu.size();
            int temp = size;
           Double sum = 0d;
             while(size-->0)
             {
                TreeNode curr = qu.remove();
                 
                 if(curr!=null)
                 {
                     // System.out.print(curr.val+" ");
                     sum+=curr.val;
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
         Double avg = sum/temp;
         list.add(avg);
            
        }
        
        return list;
     
    }
}
}
