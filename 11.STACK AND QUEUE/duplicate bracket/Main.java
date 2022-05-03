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
            if(ch!=')')
            {
                st.push(ch);
            }
            else if(ch==')' ){
          
                 if(ch==')')
                {
                    if(st.peek()=='(')
                    {
                        return true;
                    }
                    else{
                        while(st.peek()!='(')
                        {
                            st.pop();
                        }
                        st.pop();
                    }
                }
            }
        }
            return false;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = BalBrac(str);
        System.out.println(ans);
    }

}