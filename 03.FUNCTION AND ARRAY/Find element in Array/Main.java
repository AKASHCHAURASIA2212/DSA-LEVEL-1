import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
     Scanner S = new Scanner(System.in);
    int n = S.nextInt();
    int[] arr = new int[n];
    for(int i=0 ; i<n ; i++){
        arr[i]=S.nextInt();
    }
    int d = S.nextInt();
    int idx = -1;
     for(int i=0 ; i<n ; i++){
        if(d==arr[i])
        {
            idx=i;break;
        }
    }
    System.out.println(idx);
 }

}