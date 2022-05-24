public class Main {
    
  public static boolean isLeaf(Node node)
  {
      if(node.children.size()==0)
      {
          return true;
      }
      return false;
  }

  public static void removeLeaves(Node node) {
    
      for(int i = node.children.size()-1;i>=0;i--)
      {
          if(isLeaf(node.children.get(i)))
          {
              node.children.remove(i);
          }
      }
      
       for(int i = node.children.size()-1;i>=0;i--)
      {
         removeLeaves(node.children.get(i));
      }

  }
}
