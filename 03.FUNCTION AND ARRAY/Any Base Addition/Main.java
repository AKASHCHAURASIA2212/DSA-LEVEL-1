import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int carry = 0 ;
       int Ans = 0 ;
       int pow = 1;
       
       while(n1!=0 || n2!=0 || carry !=0)
       {
           int rem1 = n1%10;
           int rem2 = n2%10;
           int rem =rem1+rem2+carry;
           
           if(rem >= b){
               carry = 1;
               rem = rem%b;
           }
           else{
               carry=0;
           }
           
           Ans+=rem*pow;
           pow*= 10;
           
           n1/=10;
           n2/=10;
       }
       return Ans;
   }
  }