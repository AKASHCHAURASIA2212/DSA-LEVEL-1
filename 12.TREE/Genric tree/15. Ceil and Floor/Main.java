public class Main {
    static int ceil=Integer.MAX_VALUE;
    static int floor=Integer.MIN_VALUE;
    public static void ceilAndFloor(Node node, int data) {
      
      // floor
      if(node.data < data)
      {
          if(node.data>floor)
          {
              floor = node.data;
          }
      }
      // ceil
          if(node.data > data)
      {
          
              ceil = Math.min(node.data,ceil);
          
      }
      
      for(Node c : node.children)
      {
          ceilAndFloor(c,data);
      }
      
    }
}
