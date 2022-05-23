import java.util.ArrayList;
import java.util.*;
public class Main {

    public static class Node{
        int data ; 
        ArrayList<Node> child = new ArrayList<>();

        public Node(){};
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args)
    {
        int[] gt = {10,20,50,-1,60,-1,-1,30,70,-1,80,-1,90,110,-1,120,-1,-1,-1,40,100,-1,-1};
        int i = 0;

        Stack<Node> st = new Stack<>();

        Node newnode = new Node(gt[i]);
        st.push(newnode);
        i++;

        while(st.size()>0 && i<gt.length)
        {
            if(gt[i]==-1)
            {
                st.pop();
            }
            else {
                Node node = new Node(gt[i]);
                Node gtnode = st.peek();
                gtnode.child.add(node);
                st.push(node);
            }
            i++;
        }

        Display(newnode);
    }

    public static void Display(Node root)
    {
        System.out.println();
        
        System.out.print(root.data+"->");
        for(Node child : root.child)
        {
            System.out.print(child.data+" ");
        }

        for(Node child : root.child)
        {
            Display(child);
        }

    }
}
