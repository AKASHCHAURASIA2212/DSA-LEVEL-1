import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> Ans =  getMazePaths(0,0,n-1,m-1);
        System.out.println(Ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc)
        {
         ArrayList<String> base= new ArrayList<>();
         base.add("");
         return base;

        }
        
        ArrayList<String> myAns = new ArrayList<>();
        // horizontal move
        if(sr<=dr && sc+1<=dc)
        {
            ArrayList<String> recAns =  getMazePaths(sr,sc+1,dr,dc);
            for(String str : recAns)
            {
                myAns.add("h"+str);
            }
        }
        
        // vertical move
        if(sr+1<=dr && sc<=dc)
        {
              ArrayList<String> recAns =  getMazePaths(sr+1,sc,dr,dc);
            for(String str : recAns)
            {
                myAns.add("v"+str);
            }
        }
        
        return myAns;
    }

}
