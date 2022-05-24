public class Main {
      
  public static ArrayList<Node> nodeToRootPath(Node node, int data){
    // write your code here
    if(node==null)
    {
       ArrayList<Node> base = new ArrayList<>();
       return base;
    }
 
    ArrayList<Node> left = nodeToRootPath(node.left,data);
    if(left.size()!=0)
    {
        left.add(node);
        return left;
    }
    
    ArrayList<Node> right = nodeToRootPath(node.right,data);
    if(right.size()!=0)
    {
        right.add(node);
        return right;
    }
    
    if(node.data == data)
    {
        ArrayList<Node> base = new ArrayList<>();
        base.add(node);
        return base;
    }
    
    return left.size()>right.size()?left:right;
    
  }
  
  public static void kdown(Node root,int k,Node blocker)
  {
      if(root==null || k<0 || root==blocker)
      {
          return;
      }
      
      if(k==0)
      {
          System.out.println(root.data);
      }
      
      kdown(root.left,k-1,blocker);
      kdown(root.right,k-1,blocker);

  }
  
   public static void display(ArrayList<Node> list)
   {
       for(Node ele : list)
       {
         System.out.println(ele.data);
       }
   }
   
  public static void printKNodesFar(Node node, int data, int k) {
    // write your code here
    ArrayList<Node> n2r = nodeToRootPath(node,data);
    // display(n2r);
    Node blocker=null;
    for(int i = 0;i<n2r.size();i++)
    {
        Node n = n2r.get(i);
        kdown(n,k--,blocker);
        blocker=n;
    }
    // kdown(node,1,k);
    
  }

}
