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
    
    
    public static ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data){
      // write your code here
      if(node==null)
      {
         ArrayList<TreeNode> base = new ArrayList<>();
         return base;
      }
   
      ArrayList<TreeNode> left = nodeToRootPath(node.left,data);
      if(left.size()!=0)
      {
          left.add(node);
          return left;
      }
      
      ArrayList<TreeNode> right = nodeToRootPath(node.right,data);
      if(right.size()!=0)
      {
          right.add(node);
          return right;
      }
      
      if(node.val == data)
      {
          ArrayList<TreeNode> base = new ArrayList<>();
          base.add(node);
          return base;
      }
      
      return left.size()>right.size()?left:right;
      
    }
      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          
          ArrayList<TreeNode> P = nodeToRootPath(root,p.val);
          ArrayList<TreeNode> Q = nodeToRootPath(root,q.val);
          
          int i = P.size()-1;
          int j = Q.size()-1;
          
          TreeNode commen = null;
          while(i>=0 && j>=0)
          {
              if(P.get(i).val==Q.get(j).val)
              {
                  commen = P.get(i);
              }
              else{
                  return commen;
              }   
              i--;
              j--;
          }
          
          return commen;
          
      }
  }
