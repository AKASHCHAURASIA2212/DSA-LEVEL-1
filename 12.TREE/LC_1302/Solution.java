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
    //     public class pair{
    //        int height=0;
    //        int value=0;
    //         public pair(int height,int value)
    //         {
    //             this.height=height;
    //             this.value=value;
    //         }
    //     }
        
    //     public pair deepsum(TreeNode root,int height)
    //     {
    //         if(root==null)
    //         {
    //            return ; 
    //         }
            
    //         if(root.left==null && root.right==null)
    //         {
    //              return new pair(root.val,height);
    //         }
            
    //         pair left = deepsum(root.left,height+1);
    //         pair right = deepsum(root.right,height+1);
            
            
            
            
            
    //     }
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0 ;
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.max(left,right)+1;
    }
    
    public int leafsum(TreeNode node,int currht,int ht,int sum)
    {
       if(node==null)
           return 0;
        if(currht==ht-1)
        {
            sum+=node.val;
            return sum;
        }
        // System.out.println("height--> "+currht+" node data --> "+node.val);
        int lsum = leafsum(node.left,currht+1,ht,sum);
        int rsum = leafsum(node.right,currht+1,ht,sum);
        return (lsum+rsum);    
    }
        public int deepestLeavesSum(TreeNode root) {
            int hi = height(root);
            // System.out.println("height--> "+hi);
            int ans = leafsum(root,0,hi,0);
            // System.out.println(ans);
            return ans;
        }
    }
