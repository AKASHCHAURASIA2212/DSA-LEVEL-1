import java.io.*;
import java.util.*;

public class Main {
    
    public static String reverse(String str)
    {
        String ans= "";
        for(int i=0;i<str.length();i++)
        {
            ans=str.charAt(i)+ans;
        }
        return ans;
    }
    
    public static boolean isPalindrome(String str)
    {
        String rev = reverse(str);
        return str.equals(rev);
        
    }

	public static void solution(String str){
		//write your code here
		int n = str.length();
		for(int i = 0;i<n;i++)
		{
		    String tstr = "";
		    for(int j=i;j<n;j++)
		    {
		        tstr+=str.charAt(j);
		        if(isPalindrome(tstr))
		        {
		            System.out.println(tstr);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}