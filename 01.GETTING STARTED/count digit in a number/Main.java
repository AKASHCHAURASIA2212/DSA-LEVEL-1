import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    
      Scanner s  = new Scanner(System.in);
      int n=s.nextInt();
      s.close();
      int count=0;
      while(n!=0)
      {
          n=n/10;
          count++;
      }
      System.out.println(count);
   }
  }