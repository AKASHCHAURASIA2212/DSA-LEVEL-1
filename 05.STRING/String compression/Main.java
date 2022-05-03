import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String Ans = "";
		char temp = '0';
		char prevchar = '8';
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++ )
		{
		    temp = str.charAt(i);
		    
		    if(temp!=prevchar)
		    {
		      Ans = Ans+temp; 
		      count=1;
		      prevchar=temp;
		    }
		    else{
		        count++;
		    }
		}
		return Ans;

	}

	public static String compression2(String str){
		// write your code here
			String Ans = "";
		char temp = '0';
		char prevchar = '8';
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++ )
		{
		    temp = str.charAt(i);
		    
		    if(temp!=prevchar)
		    {
		        
		      if(count>1)
		      {
		          Ans=Ans+count;
		      }
		      Ans = Ans+temp; 
		      count=1;
		      prevchar=temp;
		    }
		    else{
		        count++;
		    }
		}
		if(count>1)
		{
		    Ans=Ans+count;
		}
		return Ans;
	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}