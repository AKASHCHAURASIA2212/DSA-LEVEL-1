import java.io.*;
import java.util.*;

public class Main {
    
    public static int maxSumNAE(int[] arr,int idx,int sum){
        
        if(idx>=arr.length){
            return sum ;
        }
        
        // no call
        int a1 = maxSumNAE(arr,idx+1,sum);
        // yes call
        int a2=0;
        if(arr[idx]>0){
        a2 = maxSumNAE(arr,idx+2,sum+arr[idx]);
        }
        
        return Math.max(a1,a2);
    }
    
    public static int maxSum(int[] arr){
        int n = arr.length;
        int[]dpin = new int[n];
        int[]dpex = new int[n];
        
        dpin[0] = arr[0];
        dpex[0] = 0 ;
        for(int i=1;i<n;i++){
            
          // include 
          dpin[i] = arr[i]+dpex[i-1] ;
          
          // exclude
          dpex[i]= Math.max(dpin[i-1],dpex[i-1]);
        }
        return Math.max(dpin[n-1],dpex[n-1]);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        // int ans = maxSumNAE(arr,0,0);
        int ans = maxSum(arr);
        
        System.out.print(ans);
    }
}