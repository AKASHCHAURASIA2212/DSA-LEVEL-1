import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s  =new Scanner(System.in);
        int n= s.nextInt();
        s.close();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==1)
        {
            System.out.print(n+" ");
            System.out.print(n+" ");
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");


    }

}