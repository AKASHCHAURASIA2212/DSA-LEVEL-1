import java.util.*;
  
  public class Main{
  
  public static int DecToAny(int num , int base)
  {
      int pow = 1,Ans=0;
      while(num!=0)
      {
          int rem = num%base;
          Ans=Ans+rem*pow;
          pow*=10;
          num/=base;
      }
      return Ans;
  }
  
    public static int AnyToDec(int num , int base)
  {
      int pow = 1,Ans=0;
      while(num!=0)
      {
          int rem = num%10;
          Ans=Ans+rem*pow;
          pow*=base;
          num/=10;
      }
      return Ans;
  }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int decnum = AnyToDec(n,sourceBase);
     int destnum = DecToAny(decnum,destBase);
     System.out.println(destnum);
   }   
  }
