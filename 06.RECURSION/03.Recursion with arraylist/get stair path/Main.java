import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s  = new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        // n = = 0 
        if(n==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        // n==1
        if(n-1>=0)
        {
            ArrayList<String> recAns = getStairPaths(n-1);
            for(String s :recAns)
            {
                myAns.add("1"+s);
            }
        }
        
        // n==2
        if(n-2>=0)
        {
            ArrayList<String> recAns = getStairPaths(n-2);
            for(String s :recAns)
            {
                myAns.add("2"+s);
            }
        }
        //n==3
        if(n-3>=0)
        {
            ArrayList<String> recAns = getStairPaths(n-3);
            for(String s :recAns)
            {
                myAns.add("3"+s);
            }
        }
        
        return myAns;
        
    }

}
