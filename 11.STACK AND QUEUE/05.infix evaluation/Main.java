import java.io.*;
import java.util.*;

public class Main{
    
    // this method return the precedance of operaters
    
    public static int precedance(char ch)
    {
        if(ch=='/' || ch=='*')
        {
            return 2;
        }
        
        return 1;
    }
  
  // this method perforn operation on val1 and val2 according to operater passed 
  public static int multiply(char ch ,int val1 ,int val2)
  {
      if(ch=='+')
      {
          return val1+val2;
      }
      else if(ch=='-')
      {
          return val1-val2;
      }
      else if(ch=='*')
      {
          return val1*val2;
      }
      else if(ch=='/')
      {
          return val1/val2;
      }
      return 0;
  }
  
  // this method retrun true if given ch is operater else false
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
    String exp = br.readLine();

    // code start here
    // System.out.println("exp-->"+exp);
    // System.out.println("explen-->"+exp.length());

    Stack<Integer> operands = new Stack<>();
    Stack<Character> operater = new Stack<>();
    
    for(int i = 0 ; i<exp.length() ; i++)
    {
        // System.out.println("count-->"+i);
        
        char ch = exp.charAt(i);
         
         // if ch is '('
         
        if(ch=='(')
        {
            operater.push(ch);
        }
        
        // if ch is between 0 - 9 
        
        else if(ch>='0' && ch<='9')
        {
            operands.push(ch-'0');
        }
        
        // if ch is ')'
        
        else if(ch==')')
        {
            while(operater.peek()!='(')
            {
                int val2=operands.pop();
                int val1=operands.pop();
                // System.out.println("val1-->"+val1+" va;2-->"+val2);
                char optr = operater.pop();
                int newans = multiply(optr,val1,val2);
                operands.push(newans);
                // System.out.println("oprend-->"+numst.peek()); 
            }
            operater.pop();
        }
        
        else if(isoptr(ch)){
            // this while loop execute until
            //1. peek of operater not equal to '('
            //2. the precedance of ch is less the or equal to precedance of operater statck peek
            while(operater.size()!=0 && operater.peek()!='(' && precedance(ch)<=precedance(operater.peek()))
            {
                int val2=operands.pop();
                int val1=operands.pop();
                // System.out.println("val1-->"+val1+" va;2-->"+val2);
                char optr = operater.pop();
                int newans = multiply(optr,val1,val2);
                operands.push(newans);
                // System.out.println("oprend-->"+numst.peek());
            }
            operater.push(ch);
        }
    }
    
    // this portion is executed when all symbol are scanned and now only operartion is need to perform
    
    while(operater.size()!=0)
    {
       int val2=operands.pop();
       int val1=operands.pop();
    // System.out.println("val1-->"+val1+" va;2-->"+val2);
       char optr = operater.pop();
       int newans = multiply(optr,val1,val2);
       operands.push(newans);
       
    }
    
    System.out.println(operands.peek());


 }
}
