import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    
    int arr[][]=new int[n1][n2];
    
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
    
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
         System.out.println();

    }
 }

}