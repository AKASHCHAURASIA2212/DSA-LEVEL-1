import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean BalBrac(String str)
    {
        Stack<Character> st = new Stack<>();
        // System.out.println("str-->"+str);
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            //  System.out.println("count-->"+i);
            // System.out.println("ch-->"+ch);
            if(ch=='{' || ch=='(' || ch=='[')
            {
                st.push(ch);
            }
            else if(ch==')' || ch==']'|| ch=='}'){
                if(st.size()==0)
                {
                    return false;
                }
                
                if(ch=='}' && st.peek()!='{')
                {
                    return false;
                }
                else if(ch==')'&&st.peek()!='(')
                {
                    return false;
                }
                else if(ch==']'&&st.peek()!='[')
                {
                    return false;
                }
                else
                {
                    // System.out.println("after pop peek -->"+st.peek());
                    st.pop();
                }
            }
            else
            {
                // o nothing
                // System.out.println("in nothing block");
                
            }
            
         
            
        }
        
          if(st.size()==0)
            {
                return true;
            }
            return false;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        boolean ans = BalBrac(str);
        System.out.println(ans);
    }

}