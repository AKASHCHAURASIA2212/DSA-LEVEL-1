import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        String psf = "";
        printMazePaths(0,0,n-1,m-1,psf);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
           if(sr==dr && sc==dc)
	        {
	            System.out.println(psf);
	        }
	        // horizontal move
	        if(sr<=dr && sc+1<=dc)
	        {
	            for(int jump=1;jump+sc<=dc;jump++)
	            {
	            String mypsf = psf+"h"+jump;
	            printMazePaths(sr,sc+jump,dr,dc,mypsf);
	            }
	            
	        }
	        
	        // vertical move
	           if(sr+1<=dr && sc<=dc)
	        {
	           for(int jump=1;jump+sr<=dr;jump++)
	            {
	            String mypsf = psf+"v"+jump;
	            printMazePaths(sr+jump,sc,dr,dc,mypsf);
	            }
	        }
	        
	        // daigonal move
	            if(sr+1<=dr && sc+1<=dc)
	        {
	           for(int jump=1;jump+sr<=dr && jump+sc<=dc;jump++)
	            {
	            String mypsf = psf+"d"+jump;
	            printMazePaths(sr+jump,sc+jump,dr,dc,mypsf);
	            }
	        }
    }

}