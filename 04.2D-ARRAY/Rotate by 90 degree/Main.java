import java.io.*;
import java.util.*;

public class Main {
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    // int m = s.nextInt();
    
    int arr[][]=new int[n][n];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
        
              
           for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                
                  int temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                
            }
           }
            
            
            //  System.out.println("transpose-->");
            //  display(arr);
        
            int j1= 0;
            int j2 = n-1;
             int li =j1;
                int ri =j2;
            while(li<ri)
            {
    
               
                int k=0;
                // System.out.println("li-->"+li+"\tri-->"+ri);
                while(k<n)
                {
                        int temp = arr[k][li];
                    arr[k][li]=arr[k][ri];
                    // System.out.println("left-->"+temp+"\trigth-->"+arr[k][li]);
                    arr[k][ri]=temp;
                    k++;
                }
                li++;
                ri--;
            }
            
        //   System.out.println("swap-->");

            display(arr);
            
        }
    }

    
    

