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
   
      public static void allpath(int src , int count , ArrayList<Edge>[] graph , boolean[] vis,String asf)
    {
        vis[src]=true;
        if(count==graph.length)
        {
            boolean temp = false;
            int org = asf.charAt(0)-'0';

            for(Edge e : graph[src])
            {
               int nbr = e.nbr;
               if(nbr==org)
                {
                    temp=true;
                    break;
                }
            }
            
            if(temp)
            {
                System.out.println(asf+"*");
                return;
            }
            System.out.println(asf+".");
         
        }

        ArrayList<Edge> curr = graph[src];

        for(Edge e : curr)
        {
            int nbr = e.nbr;
            if(!vis[nbr])
            {
                vis[nbr]=true;
                count++;
                allpath(nbr,count,graph,vis,asf+nbr);
                count--;
                vis[nbr]=false;
            }
        }
        
      }
   
   public static void hpath(ArrayList<Edge>[] graph ,int src)
   {
       boolean[] vis = new boolean[graph.length];
       allpath(src,1,graph,vis,""+src);
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

      // write all your codes here
      hpath(graph,src);
    //   hcycle(graph,src);
      
   }


}