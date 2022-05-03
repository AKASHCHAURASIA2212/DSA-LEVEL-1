import java.io.*;
import java.util.*;

public class Main{
    
    public static boolean isoptr(char ch)
    {
        if(ch=='+' || ch=='-' || ch=='/' || ch=='*')
        {
            return true;
        }
        return false;
    }
    
    public static int calval(char ch,int v1,int v2)
    {
        if(ch=='+')
        {
            return v1+v2;
        }
        else if(ch=='-')
        {
            return v1-v2;
        }
        else if(ch=='*')
        {
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    
    Stack<Integer> value = new Stack<>(); 
    Stack<String> in = new Stack<>();
    Stack<String> pre = new Stack<>();
    
    for(int i=exp.length()-1;i>=0;i--)
    {
        char ch = exp.charAt(i);
        if(ch>='0' && ch<='9')
        {
            value.push(ch-'0');
            in.push(ch+"");
            pre.push(ch+"");
        }
        else if(isoptr(ch))
        {

            // value
            int v2 = value.pop();
            int v1 = value.pop();
            int ans1 = calval(ch,v2,v1);

            value.push(ans1);
            
            // infix
            
            String in2 = in.pop();
            String in1 = in.pop();
            String ans2 = "("+in2+ch+in1+")";
            in.push(ans2);
            
            // postfix
            String pre2 = pre.pop();
            String pre1 = pre.pop();
            String ans3 = pre2+pre1+ch;
            pre.push(ans3);

            
            
        }
    }
    
    System.out.println(value.peek());
    System.out.println(in.peek());
    System.out.println(pre.peek());
    
    
    
    }
}