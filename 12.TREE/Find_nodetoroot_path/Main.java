import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static boolean find(Node node, int data){
    // write your code here
    if(node==null)
    {
        return false;
    }
    
    if(node.data==data)
    {
        return true;
    }
    
    boolean left  = find(node.left,data);
    if(left)
    {
        return true;
    }
    
    boolean right = find(node.right,data);
    if(right)
    {
        return true;
    }
    return false;
    
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node==null)
    {
       ArrayList<Integer> base = new ArrayList<>();
       return base;
    }
 
    ArrayList<Integer> left = nodeToRootPath(node.left,data);
    if(left.size()!=0)
    {
        left.add(node.data);
        return left;
    }
    
    ArrayList<Integer> right = nodeToRootPath(node.right,data);
    if(right.size()!=0)
    {
        right.add(node.data);
        return right;
    }
    
    if(node.data == data)
    {
        ArrayList<Integer> base = new ArrayList<>();
        base.add(data);
        return base;
    }
    
    return left.size()>right.size()?left:right;
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    boolean found = find(root, data);
    System.out.println(found);

    ArrayList<Integer> path = nodeToRootPath(root, data);
    System.out.println(path);
  }

}