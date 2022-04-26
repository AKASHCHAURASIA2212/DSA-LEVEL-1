import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();
    
    int a[][]=new int[m][n];
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=s.nextInt();
        }
    }
    
    int d = 0;
    int i=0;
    int j=0;
    while( i>=0 && j>=0 && i<n && j<m)
    {
        // System.out.println("dir->"+d);
        // System.out.println("i-->"+i+"\tj-->"+j);

        d=d%4;
        if(d==0)
        {
            if(a[i][j]!=1)
            {
                j++;
            }
            else
            {
                i++;
                d++;;
            }
        }
        else if(d==1)
        {
            if(a[i][j]!=1)
            {
                i++;
            }
            else{
                j--;
                d++;
            }
        }
        else if(d==2)
        {
               if(a[i][j]!=1)
            {
                j--;
            }
            else{
                i--;
                d++;
            }
        }
        else if(d==3)
        {
               if(a[i][j]!=1)
            {
                i--;
            }
            else{
                j++;
                d++;
            }
        }
    }
    
    // System.out.println("i-->"+i+"\tj-->"+j);
    
    if(d==0)
    {
    // System.out.println("dir->"+d);

      System.out.println(i+"\n"+(j-1));
    }
    else if(d==1)
    {
        // System.out.println("dir->"+d);
        System.out.println((i-1)+"\n"+j);
    }
    else if(d==2)
    {
        // System.out.println("dir->"+d);
        System.out.println(i+"\n"+(j+1));
    }
    else if(d==3){
        // System.out.println("dir->"+d);
        System.out.println((i+1)+"\n"+j);
    }
    
    }

}