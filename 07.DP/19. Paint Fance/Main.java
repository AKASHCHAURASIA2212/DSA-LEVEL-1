import java.io.*;
import java.util.*;

public class Main {

    public static int PaintFance(int f , int clr ) {
        int same  = clr ; 
        int diff = clr*(clr-1);
        int total = same+diff ;
        for(int i=2;i<f;i++){
            int nsame = diff ; 
            int ndiff = total*(clr-1) ;
            total = nsame+ndiff;
            same = nsame ; 
            diff = ndiff ;
        }
        
        return total ;
    }
    public static void main(String[] args) throws Exception {
          
        Scanner sc = new Scanner(System.in);
        int fance = sc.nextInt();
        int color = sc.nextInt();
        
    
        int ans = PaintFance( fance , color);
        System.out.print(ans);
    }
}