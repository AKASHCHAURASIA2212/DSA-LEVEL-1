import java.util.*;

public class Main{

public static void main(String[] args) { 
  Scanner s = new Scanner(System.in);
  int n= s.nextInt();
  s.close();
  int invnum=0,count=1;
  while(n!=0)
  {
      int rem=n%10;
      n/=10;
      invnum+=count*(int)Math.pow(10,rem-1);
      count++;
      
  }
  System.out.println(invnum);
 }
}