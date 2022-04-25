import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int pow = 1 ;
       int Ans = 0 ;
       int carry = 0;
       while(n1!=0 || n2!=0 || carry!=0)
       {
          int rem1 = n1%10;
          int rem2 = n2%10;
        //   System.out.println("carry-->"+carry);
          rem2+=carry;
          if(rem2<rem1 || rem2<0){
              rem2+=b;
              carry=-1;
          }
          else{
              carry=0;
          }
        //   System.out.println("rem2-->"+rem2);
          Ans+= (rem2-rem1)*pow;
        //   System.out.println("Ans-->"+Ans);
          pow*=10;
          n1/=10;
          n2/=10;
          

       }
       return Ans;
   }
  
  }