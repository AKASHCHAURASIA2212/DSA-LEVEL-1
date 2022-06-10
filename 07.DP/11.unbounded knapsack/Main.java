import java.io.*;
	import java.util.*;

	public class Main {
	    
	    public static int unknap(int[] val,int[] wt,int cap)
	    {
	        int n = val.length;
	        int m = cap+1;
	        int[][]dp = new int[n][m];
	        
	        for(int j=0;j<m;j++)
	        {
	            for(int i=0;i<n;i++)
	            {
	                if(j==0)
	                {
	                    dp[i][j]=0;
	                }
	                else
	                {
	                    if(wt[i]<=j)
	                    {
	                       // System.out.println("j-->"+j+"	"+"wt-->"+wt[i]+"	i-->"+i);
	                        int temp = wt[i];
	                        int rem = j % temp;
	                       //int rem=0;
	                        int qt = j/temp;
	                       //int qt=2;
	                        int ans1 = val[i]*qt;
	                        int max = 0;
	                        if(rem!=0)
	                        {
	                            for(int k=0;k<n;k++)
	                            {
	                                if(dp[k][rem]>max)
	                                {
	                                    max=dp[k][rem];
	                                }
	                            }
	                        }
	                        int ans2=max;
	                        dp[i][j]=ans1+ans2;
	                    }
	                }
	            }
	        }
	        int myans = -1;
	          for(int i=0;i<n;i++)
	              {
	                  if(dp[i][m-1]>myans)
	                    {
	                    myans=dp[i][m-1];
	                    }
	             }
	             
	           //for(int i=0;i<n;i++)
	           //{
	           //    for(int j=0;j<m;j++)
	           //    {
	           //        System.out.print(dp[i][j]+"	");
	           //    }
	           //    System.out.println();
	           //}
	        return myans;
	    }


	    public static void main(String[] args) throws Exception {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] value = new int[n];
           for(int i=0;i<n;i++)
           {
               value[i]=sc.nextInt();
           }
           
           int[] wt = new int[n];
           
            for(int i=0;i<n;i++)
           {
               wt[i]=sc.nextInt();
           }
           int cap = sc.nextInt();
           int ans = unknap(value,wt,cap);
           System.out.println(ans);
	    }
	}
    