import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
           Scanner s  = new Scanner(System.in);
           String str = s.next();
           ArrayList<String> ans = gss(str);
           System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char Ans = str.charAt(0);
        
        String rstr = str.substring(1);
        
        ArrayList<String> recAns = gss(rstr);
        
        ArrayList<String> myAns = new ArrayList<>();
        
        for(String s : recAns)
        {
            myAns.add(s);
        }
        
        for(String s : recAns)
        {
            myAns.add(Ans+s);
        }
        
        return myAns ; 
        
        

    }

}