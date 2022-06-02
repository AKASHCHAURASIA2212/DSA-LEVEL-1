import java.io.*;
import java.util.*;

public class Main {
    
    public static class Edge{
        int src ;
        int nbr;
        
        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;
        }
    }
   
   public static void addEdge(ArrayList<Edge>[] graph ,int src,int nbr)
   {
       graph[src].add(new Edge(src,nbr));
       graph[nbr].add(new Edge(nbr,src));
    
   }
   
   public static void getSingleComp(ArrayList<Edge>[] graph ,int src , ArrayList<Integer> single,boolean[] vis)
   {
       vis[src]=true;
       single.add(src);
       
       for(Edge e : graph[src])
       {
           int nbr = e.nbr;
           
           if(!vis[nbr])
           {
               getSingleComp(graph,nbr,single,vis);
           }
       }
   }
   
   public static void gcc(ArrayList<Edge>[] graph, ArrayList<ArrayList<Integer>> comps)
   {
       boolean[] vis = new boolean[graph.length];
       
       for(int i = 0 ;i < graph.length ; i++)
       {
           if(!vis[i])
           {
              ArrayList<Integer> single  = new ArrayList<>();
           getSingleComp(graph,i,single,vis);
           comps.add(single);  
           }
          
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
     
      ArrayList<Edge>[] graph  = new ArrayList[n];
    
      for (int i = 0; i < n; i++) {
         graph[i] = new ArrayList<>();
      }
      
       for (int i = 0; i < k; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }
    
      
      
      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      
      gcc(graph,comps);
    //   System.out.println(comps);
      
      int len = comps.size();
      int ans = 0;
      for(int i = 0 ; i<len;i++)
      {
          for(int j =i+1 ; j<len;j++)
          {
              ans+= comps.get(i).size()*comps.get(j).size();
          }
      }
      
      System.out.println(ans);
   }

}