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
	            String mypsf = psf+"h";
	            printMazePaths(sr,sc+1,dr,dc,mypsf);
	        }
	        
	        // vertical move
	           if(sr+1<=dr && sc<=dc)
	        {
	            String mypsf = psf+"v";
	            printMazePaths(sr+1,sc,dr,dc,mypsf);
	        }
	    }

	}