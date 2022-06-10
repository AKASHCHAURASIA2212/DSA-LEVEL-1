import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char chr = str.charAt(i);

            if(hm.containsKey(chr))
            {
                int val = hm.get(chr);
                hm.put(chr,val+1);
            }
            else{
                hm.put(chr,1);
            }
        }

        int max=0;
        char maxkey ='\0';
        for(char shr : hm.keySet())
        {
            int temp = hm.get(shr);
            if(temp>max)
            {
                max=temp;
                maxkey=shr;
            }
        }

        System.out.println(maxkey);

    }

}