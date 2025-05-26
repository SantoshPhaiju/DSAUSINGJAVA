package Graphs;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // for undirected graph
    }

    // ✅ DFS Traversal
    void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal: ");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]) {
            if (!visited[n])
                dfsUtil(n, visited);
        }
    }

    // ✅ BFS Traversal
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int n : adj[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        g.DFS(0); // Output: DFS Traversal: 0 1 3 4 2 5
        g.BFS(0); // Output: BFS Traversal: 0 1 2 3 4 5
    }
}
