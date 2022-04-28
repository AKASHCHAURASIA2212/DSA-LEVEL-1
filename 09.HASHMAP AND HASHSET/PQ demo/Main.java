import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

import java.util.PriorityQueue;
public class Main {
    
    public static void main(String[] args){
        int[] arr = {22,1,45,76,34,8,23,45,98,67,44,65};

        // minimum priority queue
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int ele : arr)
        {
            pq.add(ele);
        }

        while(pq.size()>0)
        {
            System.out.println(pq.peek());
            pq.remove();
        }

        // max priority queue
        PriorityQueue<Integer> pq2= new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr)
        {
            pq2.add(ele);
        }

        while(pq2.size()>0)
        {
            System.out.println(pq2.peek());
            pq2.remove();
        }
    }

}
