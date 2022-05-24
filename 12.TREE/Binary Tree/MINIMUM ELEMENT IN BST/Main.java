public class Main {
    class Tree {
        // Function to find the minimum element in the given BST.
        int minValue(Node node) {
          if(node==null){
              return -1;
          }
          int curr = node.data;
          while(node!=null)
          {
                  curr=node.data;
                  node=node.left;
          }
          
          return curr;
        }
    }
}
