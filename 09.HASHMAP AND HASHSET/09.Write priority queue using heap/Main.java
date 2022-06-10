import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapify(data.size()-1);
    }
    
    public void upheapify(int idx)
    {
        if(idx==0)
        {
            return;
        }
         int pi = (idx-1)/2;
         if(data.get(pi)>data.get(idx)){
          swap(pi,idx);
          upheapify(pi);
      }
    }
    public void swap(int i,int j)
    {
        int val1 = data.get(i);
        int val2 = data.get(j);
        data.set(i,val2);
        data.set(j,val1);
    }
    public int remove() {
      // write your code here
      if(data.size()==0)
      {
        System.out.println("Underflow");
         return -1;
      }
      int lastidx = data.size()-1;
      swap(0,lastidx);
      int val = data.remove(lastidx);
      downheapify(0);
      return val;
    }

    public void downheapify(int idx)
    {
      int minidx = idx;
        int lci = 2 * idx + 1;
        int rci = 2 * idx + 2;
        
        if(lci<data.size() && data.get(lci)<data.get(minidx)){
            minidx=lci;
        }
        
        if(rci<data.size() && data.get(rci)<data.get(minidx)){
            minidx=rci;
        }
        
        if(minidx!=idx)
        {
            swap(minidx,idx);
            downheapify(minidx);
        }
        
    }
    public int peek() {
      // write your code here
      if(data.size()==0)
      {
          System.out.println("Underflow");
          return -1;
      }
      return data.get(0);
    }

    public int size() {
      // write your code here
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}