package com.data.structure.graph;

public class GraphDriver {
        public static void main(String[]args){
            Graph graph=new Graph(6);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(1, 5);
            graph.addEdge(2, 0);
            graph.addEdge(2, 3);
            graph.addEdge(3, 3);
            graph.addEdge(3, 4);
            graph.bfs(2);
            System.out.println();
            graph.dfs(2);
        }
}
