import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int ans= factorial(n);
       sc.close();
       System.out.println(ans);
    }

    public static int factorial(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        // int recAns = factorial(n-1);
        // int myAns = n*recAns;
        // return myAns;
        return n*factorial(n-1);
    }

}