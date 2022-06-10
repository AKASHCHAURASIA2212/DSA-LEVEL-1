import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
       String str = s.next();
       String asf = "";
       printKPC(str,asf);
    }
    
    public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
        }
        
        if(str.length()>=2)
        {
            int num = str.charAt(0)-'0';
            String rstr = str.substring(1);
            String code = codes[num];
            for(int i=0;i<code.length();i++)
            {
                char myans = code.charAt(i);
                printKPC(rstr,asf+myans);
                
            }
        }
        else if(str.length()==1)
        {
            int num = str.charAt(0)-'0';
            String rstr = "";
            String code = codes[num];
            for(int i=0;i<code.length();i++)
            {
                char myans = code.charAt(i);
                printKPC(rstr,asf+myans);
                
            }
        }
        
        
    }

}