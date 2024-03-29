import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
      public static class Pair implements Comparable<Pair>
   {
       int v ;
       int av;
       int wt;
       
       public Pair(int v,int av,int wt)
       {
           this.v=v;
           this.av=av;
           this.wt=wt;
       }
       
       public int compareTo(Pair o){
           return this.wt-o.wt;
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      boolean[] vis = new boolean[vtces];
      
      pq.add(new Pair(0,-1,0));
      while(pq.size()>0)
      {
          Pair rem = pq.remove();
          
          if(vis[rem.v])
          {
              continue;
          }
          vis[rem.v]=true;
          
          if(rem.av!=-1)
          {
             System.out.println("["+rem.v+"-"+rem.av+"@"+rem.wt+"]");  
          }
         
          
          for(Edge e : graph[rem.v])
          {
              if(vis[rem.v])
              {
                  int nbr = e.nbr;
                  pq.add(new Pair(nbr,rem.v,e.wt));
              }
          }
      }
   }

}