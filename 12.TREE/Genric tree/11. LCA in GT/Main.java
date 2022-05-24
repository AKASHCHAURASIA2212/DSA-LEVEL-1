public class Main {
    
  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    for (Node child : node.children) {
      ArrayList<Integer> ptc = nodeToRootPath(child, data);
      if (ptc.size() > 0) {
        ptc.add(node.data);
        return ptc;
      }
    }

    return new ArrayList<>();
  }

  public static int lca(Node node, int d1, int d2) {
    // write your code here
    ArrayList<Integer> P = nodeToRootPath(node,d1);
    ArrayList<Integer> Q = nodeToRootPath(node,d2);
    
    int commen = -1;
    
    int i = P.size()-1;
    int j = Q.size()-1;
    
    while(i>=0 && j>=0)
    {
       if(P.get(i)==Q.get(j))
       {
           commen=P.get(i);
       }
       else
       {
           return commen;
       }
       i--;
       j--;
    }
    
    return commen;
    
  }
}
