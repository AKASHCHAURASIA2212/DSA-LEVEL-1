import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
       Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    
    int arr[][]=new int[n][m];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
    
    
    
    for(int j=0;j<m;j++)
    {
        if(j%2!=0)
        {
                for(int i=n-1;i>=0;i--)
                 {
                  System.out.println(arr[i][j]+" ");
                  }
        }
        else
        {
             for(int i=0;i<n;i++)
            {
            System.out.println(arr[i][j]+" ");
            }
            
        }
        
       
        //  System.out.println();

    }
 }

}