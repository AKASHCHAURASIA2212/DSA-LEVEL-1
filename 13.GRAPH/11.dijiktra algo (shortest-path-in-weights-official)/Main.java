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
       String psf;
       int wsf;
       
       public Pair(int v,String psf,int wsf)
       {
           this.v=v;
           this.psf=psf;
           this.wsf=wsf;
       }
       
       public int compareTo(Pair o){
           return this.wsf-o.wsf;
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

      int src = Integer.parseInt(br.readLine());
      // write your code here
        boolean[] vis = new boolean[graph.length];
      PriorityQueue<Pair> qu = new PriorityQueue<>();
      
      Pair root = new Pair(src,""+src,0);
      qu.add(root);
      while(qu.size()>0)
      {
          Pair rem = qu.remove();
          
          if(vis[rem.v])
          {
              continue;
          }
          vis[rem.v]=true;
          
          System.out.println(rem.v+" via "+rem.psf+" @ "+rem.wsf);
          
          for(Edge e : graph[rem.v]){
              int nbr = e.nbr;
              
              if(vis[nbr]==false)
              {
                  qu.add(new Pair(nbr,rem.psf+nbr,rem.wsf+e.wt));
              }
          }
      }
      
   }
}