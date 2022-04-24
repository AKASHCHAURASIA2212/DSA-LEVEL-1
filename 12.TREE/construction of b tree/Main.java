import java.util.*;
public class Main {

    public static class Node{
        int val;
        Node left;
        Node right;
         Node(){};
         Node(int val){
             this.val=val;
         }
        //  Node(Node left,Node right,int val)
        //  {
        //      this.left=left;
        //      this.right=right;
        //      this.val=val;
        //  }
         
    }

    public static class pair{
        Node node;
        int state;
        pair(){};
        pair(Node node , int state)
        {
            this.node = node;
            this.state=state;
        }

        pair(Node node)
        {
            this.node=node;
        }

    }

    public static void Display(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left!=null)
        {
            System.out.print(root.left.val);
        }
        else{
            System.out.print(".");
        }
        System.out.print("<-"+root.val+"->");
        if(root.right!=null)
        {
            System.out.print(root.right.val);

        }
        else{
            System.out.print(".");

        }
        System.out.println();
        Display(root.left);
        Display(root.right);
        
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            // System.out.print(".->");

            return;
        }
        System.out.print(root.val+"->");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root)
    {
        if(root==null)
        {
            // System.out.print(".->");

            return;
        }
        inorder(root.left);
        System.out.print(root.val+"->");
        inorder(root.right);
    }

    public static void postorder(Node root)
    {
        if(root==null)
        {
            // System.out.print(".->");

            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+"->");
    }


    public static void main(String args[])
    {
        Integer arr[] = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,85,null,null};
        Node root  = new Node(arr[0]);
        pair rootpair = new pair(root,1);
        Stack<pair> st = new Stack<>();
        st.push(rootpair);
        int idx = 1 ;

        while(st.size()!=0)
        {
            pair peekpair = st.peek();
            if(peekpair.state==1)
            {
                peekpair.state++;
                if(arr[idx]!=null)
                {
                Node leftchild = new Node(arr[idx]);
                peekpair.node.left = leftchild;
                st.push(new pair(leftchild,1));
                
                }
                idx++;
            }
            else if(peekpair.state==2)
            {
               peekpair.state++;
               if(arr[idx]!=null)
               {
               Node rightchild = new Node(arr[idx]);
               peekpair.node.right = rightchild;
               st.push(new pair(rightchild,1));
               }
               idx++;
               
            }
            else
            {
                st.pop();
            }
        }

        Display(root);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
