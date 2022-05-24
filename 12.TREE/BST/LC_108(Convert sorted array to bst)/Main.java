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
    
    public TreeNode CreateBst(int i ,int j , int[] nums){
     
        if(i>j)
        {
          return null;
        }
    int mid = (i+j)/2;
        
        TreeNode myroot = new TreeNode(nums[mid]);
        
        TreeNode left = CreateBst(i,mid-1,nums);
        
        TreeNode right = CreateBst(mid+1,j,nums);
        
        myroot.left=left;
        myroot.right=right;
        
        return myroot;
    
    
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int i = 0 ;
        int j = nums.length-1;
        int mid = (i+j)/2;
        
        TreeNode ans = CreateBst(i,j,nums);
        
        return ans;
    }
}
