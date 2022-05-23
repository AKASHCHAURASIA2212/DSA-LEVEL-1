public class Main {
    public static void levelOrder(Node node){
        // write your code here
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        
        while(qu.size()>0)
        {
            Node peek = qu.remove();
            System.out.print(peek.data+" ");
            
            for(Node c : peek.children)
            {
                qu.add(c);
            }
            
        }
        System.out.print(".");
      }
}
