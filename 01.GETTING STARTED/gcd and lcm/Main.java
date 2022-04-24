import java.util.*;
    
    public class Main{
        
        public static int GCD(int n1,int n2){
            int ub = (int)Math.min(n1,n2);
            for(int i=ub;i>=1;i--)
            {
                if(n1%i==0 && n2%i==0)
                {
                     return i;
                }
            }
            return -1;
        }
        
        public static int GCD2(int n1,int n2)
        {
            int rem = -1;
            int divedent = n1;
            int diviser = n2 ;
            while(rem!=0)
            {
                rem = divedent%diviser;
                
                if(rem==0)
                {
                    return diviser;
                }
                divedent = diviser;
                diviser = rem;
            }
            return 1;
        }
        
    
    public static void main(String[] args) {
      // write your code here  
      Scanner s = new Scanner(System.in);
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      s.close();
      
    //   int gcd = GCD(num1,num2);
    
      int gcd = GCD2(num1,num2);
      
      int lcm = (num1*num2)/gcd;
      
      System.out.println(gcd);
      System.out.println(lcm);
      
     }
    }