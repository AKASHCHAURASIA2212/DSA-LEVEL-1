import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		String ans = "";
		
		for(int i = 0 ; i < str.length() ;i++)
		{
		    int temp = str.charAt(i);
		    if(temp>=65 && temp<=90)
		    {
		        ans=ans+(char)(temp+32);
		    }
		    else if(temp>=97 && temp<=122)
		    {
		         ans=ans+(char)(temp-32);
		    }
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
        scn.close();
		System.out.println(toggleCase(str));
	}

}