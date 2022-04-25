import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

//   public static void rotate(int[] a, int k){
//     // write your code here
//     int n = a.length;
//                 // System.out.println("k-->"+k);

//     k= (k+n)%n;
//     if(k<0)
//     {
//         k=k*(-1);
//     }
//             // System.out.println("k-->"+k);

//     while(k>0)
//     {
//         int temp = a[n-1];
//         // System.out.println("temp-->"+temp);
//         for(int i = n-1;i >=1 ;i--)
//         {
//             a[i]=a[i-1];
//         }
//         a[0]=temp;
//         k--;
//     }
//   }

      public static void rotate(int[] a, int k){
          int n = a.length;
          k = (k+n)%n;
          if(k<0)
          {
              k=k+n;
          }
          
          int rvpt = n-k;
          reverse(a,0,rvpt-1);
          reverse(a,rvpt,n-1);
          reverse(a,0,n-1);
      }
      

  public static void reverse(int[] a,int li,int ri){

    while(li<=ri)
    {
    int temp = a[li];
      a[li]=a[ri];
      a[ri]=temp;
        li++;
        ri--;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}