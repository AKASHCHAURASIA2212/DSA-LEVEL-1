public class Main {


public static void levelOrder(Node root) {
  // write your code here
   Queue<Node> qu = new LinkedList<>();
      qu.add(root);
      qu.add(null);
      while(qu.size()>0)
      {
        if(qu.size()==1 && qu.peek()==null)
        {
          break;
        }
          Node temp = qu.remove();
          if(temp!=null)
          {
          System.out.print(temp.data+" ");

          }

          if(temp==null)
          {
              System.out.println();
              qu.add(null);
              continue;
          }
         
          if(temp.left!=null)
          {
              qu.add(temp.left);
          }

          if(temp.right!=null)
          {
              qu.add(temp.right);
          }

      }
}

  public static void levelOrder(Node root) {
   Queue<Node> qu = new LinkedList<>();
      qu.add(root);
      while(qu.size()>0)
      {
      int size = qu.size();
          while(size-->0)
          {
            Node temp = qu.remove();

            System.out.print(temp.data+" ");
  
             if(temp.left!=null)
                {
                    qu.add(temp.left);
               }
  
             if(temp.right!=null)
              {
                qu.add(temp.right);
              }
          }

          System.out.println();
      }
}
}
