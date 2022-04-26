import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int arr[][]= new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int i=-1;
            for(int j=0;j<n;j++)
        {
            int temp=j;
            i=0;
            while(j<n)
            {
                System.out.println(arr[i][j]);
                i=i+1;
                j=j+1;
            }
            j=temp;
        }

    }

}