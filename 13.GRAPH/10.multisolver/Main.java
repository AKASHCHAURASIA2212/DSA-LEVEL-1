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

   static class Pair implements Comparable<Pair> {
      int wsf;
      String psf;

      Pair(int wsf, String psf){
         this.wsf = wsf;
         this.psf = psf;
      }

      public int compareTo(Pair o){
         return this.wsf - o.wsf;
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
      int dest = Integer.parseInt(br.readLine());

      int criteria = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      boolean[] visited = new boolean[vtces];
      multisolver(graph, src, dest, visited, criteria, k, src + "", 0);
      
    //   System.out.println("Smallest Path = " + spath + "@" + spathwt);
    //   System.out.println("Largest Path = " + lpath + "@" + lpathwt);
    //   System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
    //   System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
    //   System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
   }



   static String spath;
   static Integer spathwt = Integer.MAX_VALUE;
   static String lpath;
   static Integer lpathwt = Integer.MIN_VALUE;
   static String cpath;
   static Integer cpathwt = Integer.MAX_VALUE;
   static String fpath;
   static Integer fpathwt = Integer.MIN_VALUE;
   static PriorityQueue<Pair> pq = new PriorityQueue<>();
      public static void allPath( ArrayList<Edge>[] graph,int src,int dest,boolean[] vis,String sb,int wt)
   {
       if(src==dest)
       {
           sb=sb+""+src;
           pq.add(new Pair(wt,sb));
        //   String
        //   sb.append(src);
        // sb=sb+src;
        //   System.out.println(sb);
        // //   sb.delete(src);
       }
       
       vis[src]=true;
       
       for(Edge e : graph[src])
       {
           int nbr = e.nbr;
           if(vis[nbr]==false)
           {
               allPath(graph,nbr,dest,vis,sb+src,wt+e.wt);
           }
       }
         vis[src]=false;
       
   
   }
   public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
       allPath(graph,src,dest,visited,"",0);
       Pair Sp =null;
       Pair Lp =null; 
       Pair Jlp=null;
       Pair Jsp=null;
       Pair Klp=null;
       boolean temp1=true;
       boolean temp3=true;
       boolean temp2=true;
       boolean temp4=true;
       while(pq.size()>0)
       {
           Pair temp = pq.remove();
           
           // Smaller path
            if(temp3)
           {
              Sp=temp;
              temp3=false;
           }
           
           // larger path
            if(pq.size()==0)
           {
              Lp=temp;
           }
           // just larger path
           if(temp1)
           {
               if(temp.wsf>criteria )
               {
                   Jlp=temp;
                   temp1=false;
               }
           }
           
           // just smaller path
            if(temp2)
           {
               if(temp.wsf<criteria)
               {
                   Jsp=temp;
                   temp2=false;
               }
           }
           
           // k th largest path
            if(pq.size()==k-1)
           {
                   Klp=temp;
           }
       }
       
      System.out.println("Smallest Path = " + Sp.psf + "@" + Sp.wsf);
      System.out.println("Largest Path = " + Lp.psf + "@" + Lp.wsf);
      System.out.println("Just Larger Path than " + criteria + " = " + Jlp.psf + "@" + Jlp.wsf);
      System.out.println("Just Smaller Path than " + criteria + " = " + Jsp.psf + "@" + Jsp.wsf);
      System.out.println(k + "th largest path = " + Klp.psf + "@" + Klp.wsf);
       
      
   }
}