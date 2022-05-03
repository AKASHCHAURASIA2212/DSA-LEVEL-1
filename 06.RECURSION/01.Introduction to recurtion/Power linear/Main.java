import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        int n = sc.nextInt();

        sc.close();

        int ans= power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }
        int recAns=power(x,n-1);
        int myAns = x*recAns;
        return myAns;
    }

}