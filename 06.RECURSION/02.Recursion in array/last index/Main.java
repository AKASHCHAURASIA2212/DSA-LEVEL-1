import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
       int idx =  LastIndex(arr,0,x);
       System.out.println(idx);
    }

    public static int LastIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
        {
            return -1;
        }
        
        int recAns = LastIndex(arr,idx+1,x);

        if(recAns==-1)
        {
            if(arr[idx]==x)
            {
            return idx;
            }
            else{
                return recAns;
            }
        }
        
        return recAns;
    }

}
