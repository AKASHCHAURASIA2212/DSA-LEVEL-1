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
        //  System.out.println("before n->"+n);
        int recAns =power(x,n/2);
        //  System.out.println("recAns->"+recAns);
        int myAns = recAns*recAns;
        if(n%2==1)
        {
            myAns=myAns*x;
        }
        return myAns;
    }
    


}