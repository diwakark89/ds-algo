package com.data.structure.graph;

import java.util.LinkedList;

public class Graph {
    int V;
    LinkedList<Integer> adj[];
    public Graph(int v){
        V=v;
        adj=new LinkedList[V];
        for (int i=0;i<V;i++){
            adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int v,int w){
        adj[v].add(w);
    }
    public void bfs(int s){

        boolean[] visited =new boolean[V];
        LinkedList<Integer>queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            s=queue.poll();
            System.out.print(s+" ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public void dfs(int s){
        boolean [] visited= new boolean[V];
        dfsUtil(s,visited);
    }

    private void dfsUtil(int s, boolean[] visited) {
        visited[s]=true;
        System.out.print(s+" ");
        for(int n:adj[s]){
            if(!visited[n]){
                dfsUtil(n,visited);
            }
        }
    }
}
