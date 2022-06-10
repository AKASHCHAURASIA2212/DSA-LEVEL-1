import java.io.*;
import java.util.*;

public class Main{
    
    public static int precedance(char ch)
    {
        if(ch=='/' || ch=='*')
        {
            return 2;
        }
        return 1;
    }
    
    public static boolean isoptr(char ch)
    {
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            return true;
        }
        return false;
    }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    
    Stack<String> post = new Stack<>();
    Stack<String> pre = new Stack<>();
    Stack<Character> optr = new Stack<>();
    
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        
        if(ch=='(')
        {
            optr.push(ch);
        }
        
        else if( ch>='a' && ch<='z' || ch>='0' && ch<='9' || ch>='A' && ch<='Z')
        {
            post.push(ch+"");
            pre.push(ch+"");
            
        }
        else if(isoptr(ch))
        {
           while(optr.size()!=0 && optr.peek()!='(' && precedance(ch)<=precedance(optr.peek()))
           {
            char operter = optr.pop();
             
            String postv2 = post.pop();
            String postv1 = post.pop();
            String ans1 = postv1+postv2+operter;
            post.push(ans1);
            
            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String ans2 = operter+prev1+prev2;
            pre.push(ans2);
           }
           optr.push(ch);
    
        }
        else if(ch==')')
        {
            while(optr.peek()!='(')
            {
                char operter = optr.pop();
                 
                String postv2 = post.pop();
                String postv1 = post.pop();
                String ans1 = postv1+postv2+operter;
                post.push(ans1);
                
                String prev2 = pre.pop();
                String prev1 = pre.pop();
                String ans2 = operter+prev1+prev2;
                pre.push(ans2); 
            }
            optr.pop();
        }
    }
    
    while(optr.size()!=0)
    {
        char operter = optr.pop();
                 
        String postv2 = post.pop();
        String postv1 = post.pop();
        String ans1 = postv1+postv2+operter;
        post.push(ans1);
                
        String prev2 = pre.pop();
        String prev1 = pre.pop();
        String ans2 =operter+prev1+prev2;
        pre.push(ans2);  
    }
    
    System.out.println(post.peek());
    System.out.println(pre.peek());
 }
}