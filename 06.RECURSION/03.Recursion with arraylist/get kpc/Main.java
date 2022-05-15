import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
          Scanner s = new Scanner(System.in);
          String str = s.next();
          ArrayList<String> ans = getKPC(str);
          System.out.println(ans);
    }
    
    public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char num = str.charAt(0);
        
        String rstr = str.substring(1);
        
        ArrayList<String> recAns = getKPC(rstr);
        
        int no = num-'0';
        
        String code = codes[no];
        
         ArrayList<String> myAns= new ArrayList<>();

        
        for(int i = 0 ; i < code.length() ; i++ )
        {
            char key = code.charAt(i);
            for(String s : recAns)
            {
                myAns.add(key+s);
            }
        }
        
        return myAns ; 
    }

}