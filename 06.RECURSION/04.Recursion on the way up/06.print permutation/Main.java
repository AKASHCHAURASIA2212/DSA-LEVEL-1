import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
           Scanner sc = new Scanner(System.in);
           String str= sc.next();
           String asf = "";
           printPermutations(str,asf);
    }

    public static void printPermutations(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
        }
        
        for(int i=0;i<str.length();i++)
        {
            char myans = str.charAt(i);
            String rstr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(rstr,asf+myans);
        }
    }

}