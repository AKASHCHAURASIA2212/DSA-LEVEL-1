public class Main {
    public static void printSingleChildNodes(Node node, Node parent){
    // write your code here
    if(node==null)
      return;
    
    if( node.right==null&&node.left!=null )
    {
        System.out.println(node.left.data);
    
    }
    
     if(node.left==null&&node.right!=null)
    {
        System.out.println(node.right.data);
    }
    
    printSingleChildNodes(node.left,parent);
    printSingleChildNodes(node.right,parent);
    
  }
}
