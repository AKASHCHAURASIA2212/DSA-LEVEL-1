public class Main {
    public static void levelOrderLinewise(Node node){

        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        
        
           while(qu.size()>0)
        {
            int size = qu.size();
            while(size-->0)
             {
             
              Node peek = qu.remove();
              System.out.print(peek.data+" ");
              for(Node c : peek.children)
              {
                qu.add(c);
              }
            
             }
            System.out.println();
        }
      }
}
