import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       String str = s.next();
       String ans = "";
       printSS(str,ans);
       
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
        }
        if(str.length()>=2)
        {
        String myAns = ans+str.charAt(0);
        String rstr = str.substring(1);
        printSS(rstr,myAns);
        printSS(rstr,ans);
        }
        else if(str.length()==1){
        String myAns = ans+str.charAt(0);
        String rstr = "";
        printSS(rstr,myAns);
        printSS(rstr,ans);
        }
        
    }

}