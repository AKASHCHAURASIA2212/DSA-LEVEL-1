import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
        Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    int max = 0;
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    
    for(int i = 1 ; i <=max ; i++)
    {
        for(int j = 0 ; j < arr.length ; j++)
        {
            if(arr[j]>=i)
            {
                System.out.print("*\t");
            }
            else{
                System.out.print("\t"); 
            }
        }
         System.out.println();
    }
    
  }

}