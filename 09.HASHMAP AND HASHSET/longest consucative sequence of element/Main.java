import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
        Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int arr[] = new int[n1];
    for(int i=0;i<n1;i++)
    {
        arr[i]=sc.nextInt();
    }
    // code start here
    // step-1 create hashmap
    HashMap<Integer,Boolean> hm = new HashMap<>();
    
    for(int ele : arr)
    {
        hm.put(ele,true);
    }
    
    //step-2
    //mark potential starting point
    for(int ele :arr)
    {
        if(hm.containsKey(ele - 1))
        {
            hm.put(ele, false);
        }
    }
    
    // step-3
    // checking for longest key
    int maxlen = 0;
    int maxkey = 0;
    for(int keys : arr)
    {
        if(hm.get(keys)==true)
        {
            int templen=0;
            int tempkey=keys;
            while(hm.containsKey(keys))
            {
                templen++;
                keys=keys+1;
            }
            if(templen>maxlen)
            {
                maxlen=templen;
                maxkey=tempkey;
            }
        }
    }
    
    for(int key = maxkey;key<maxkey+maxlen;key++)
    {
        System.out.println(key);
    }
    
    
    
    
 }

}