import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int zo = 0;
    int on = 1;
    
    for(int i=0;i<n;i++)
    {
        int zero = on ;
        int one  = on+zo;
        
        on = one;
        zo = zero;
    }
    
    System.out.println(on+zo);
 }

}















// import java.io.*;
// import java.util.*;

// public class Main{
    
//     public static int CountBinaryString(int n)
//     {
//         int endbyzero = 1;
//         int endbyone = 1;
//         for(int i=1;i<=n;i++)
//         {
//             int newendbyzero = endbyzero+endbyone;
//             int newendbyone = endbyzero;
//             endbyone = newendbyone;
//             endbyzero = newendbyzero;
//         }
//         return endbyzero;
//     }

// public static void main(String[] args) throws Exception {
//     // write your code here
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int ans = CountBinaryString(n);
//     System.out.println(ans);
//  }

// }