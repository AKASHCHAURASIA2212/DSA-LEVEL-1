import java.util.*;
   
   public class Main{
       
       public static void Display(int num){
           while(num!=0)
           {
               int rem = num%10;
               num/=10;
               System.out.println(rem);
           }
       }
   
   public static void main(String[] args) {
     // write your code here 
     Scanner s = new Scanner(System.in);
     int num = s.nextInt();
     s.close();
    //  int rev = Reverse(num);
     Display(num);
    }
   }