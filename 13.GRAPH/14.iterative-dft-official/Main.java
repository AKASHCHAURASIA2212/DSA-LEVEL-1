import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   public static class Pair{
       int v ;
       String psf;
       public Pair(int v,String psf){
           this.v=v;
           this.psf=psf;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
    boolean[] vis = new boolean[graph.length];
      Stack<Pair> st = new Stack<>();
      
      Pair root = new Pair(src,""+src);
      st.add(root);
      while(st.size()>0)
      {
          Pair rem = st.pop();
          
          if(vis[rem.v])
          {
              continue;
          }
          vis[rem.v]=true;
          
          System.out.println(rem.v+"@"+rem.psf);
          
          for(Edge e : graph[rem.v]){
              int nbr = e.nbr;
              
              if(vis[nbr]==false)
              {
                  st.push(new Pair(nbr,rem.psf+nbr));
              }
          }
      }
   }
}