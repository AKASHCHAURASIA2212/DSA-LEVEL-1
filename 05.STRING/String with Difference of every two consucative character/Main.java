import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		String Ans="";
		for(int i=0;i<str.length();i++)
		{
		    if(i<str.length()-1){
		    char temp = str.charAt(i);
		    int c1 = str.charAt(i);
		    int c2 = str.charAt(i+1);
		    int count= c2-c1;
		    Ans = Ans + temp + count;
		    }
		}
         Ans=Ans+str.charAt(str.length()-1);
		return Ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}