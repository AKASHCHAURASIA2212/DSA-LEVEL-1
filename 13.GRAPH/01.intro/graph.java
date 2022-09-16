// import java.util.ArrayList;
// import java.util.Scanner;

// class graph{

//     public class Edge{
//         int src;
//         int nbr;
//         int wt;
//         public Edge(int src,int nbr,int wt){
//             this.src=src;
//             this.nbr=nbr;
//             this.wt=wt;
//         }
//     }

//     public static void main(String[] argss){
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Edge>[] graph = new ArrayList[n];
      
//         for(int i=0;i<n;i++){
//             graph[i] =  new ArrayList<Edge>();
//         }
//         for(int i=0;i<n;i++){
//             int src = sc.nextInt();
//             int nbr = sc.nextInt();
//             int wt = sc.nextInt();
//          graph[src].add(new Edge(src, nbr, wt));
//          graph[nbr].add(new Edge(nbr, src, wt));
         
//         }

//         for(int i=0;i<n;i++) {
//             ArrayList<Edge> al = graph[i];
//             for(Edge edge : al){
//                 System.out.println(edge.src+" - "+edge.nbr+" @ "+edge.wt);
//             }
//         }


        
//     }
// }