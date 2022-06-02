import java.util.ArrayList;
import java.util.*;
@SuppressWarnings("-Xlint:unchecked")
public class Main {

    public static  class Edge{
        int src;
        int nbr;
        int wt;
        Edge(){};
        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
   
    public static void constructer(){
        Scanner sc=new Scanner(System.in);
        int N=7;
        ArrayList<Edge>[] graph =new ArrayList[N];
        for(int i = 0 ; i<N ; i++){
            graph[i]=new ArrayList<Edge>();
        }
        // for(int i = 0 ; i<N ; i++){
        //     int v1 = sc.nextInt();
        //     int v2 = sc.nextInt();
        //     int v3 = sc.nextInt();
        //     graph[i].add(new Edge(v1,v2,v3));
        //     graph[i].add(new Edge(v2,v1,v3));
        // }
        addEdge(graph, 0 , 1, 10);
        addEdge(graph, 0 , 3, 10);
        addEdge(graph, 1 , 2, 10);
        addEdge(graph, 2 , 3, 40);
        addEdge(graph, 3 , 4, 2);
        addEdge(graph, 4 , 5, 2);
        addEdge(graph, 5 , 6, 3);
        addEdge(graph, 4 , 6, 8);

        display(graph,N);
    
    }

    public static void display(ArrayList<Edge>[] graph ,int N)
    {
        for(int i=0;i<N;i++)
        {
            ArrayList<Edge> curList = graph[i];
            for(int j=0;j<curList.size();j++)
            {
                 Edge curedge = curList.get(j);
                 int u=curedge.src;
                 int v=curedge.nbr;
                 int w=curedge.wt;

                 System.out.print(u+" - "+v+" @"+w);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        constructer();
    }

}
