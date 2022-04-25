import java.io.*;
import java.util.*;

public class Main{

public static boolean status(int a[] , int d)
{
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==d)
        {
            return true;
        }
    }
    return false;
}

public static int CEIL(int a[] , int d)
{
       for(int i=0;i<a.length;i++)
    {
        if(a[i]>d)
        {
            return a[i];
        }
    }
    return -1;
}

public static int FLOOR(int a[] , int d)
{
       for(int i=0;i<a.length;i++)
    {
        if(a[i]>d)
        {
            return a[i-1];
        }
    }
    return -1;
}
public static void main(String[] args) throws Exception {
    // write your code here
     Scanner S = new Scanner(System.in);
    int n = S.nextInt();
    int[] a = new int[n];
    for(int i=0 ; i<n ; i++){
        a[i]=S.nextInt();
    }
    
        int d = S.nextInt();
      boolean check = status(a,d);
      if(!check){
          
      int ceil = CEIL(a,d);
      int floor= FLOOR(a,d);
            System.out.println(ceil+"\n"+floor);

      
      }
      else
      {
         System.out.println(d);
      }
      
    
 }

}