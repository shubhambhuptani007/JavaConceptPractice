package org.example.Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    static LinkedList list[];

    Graph(int vertex){
        list = new LinkedList[vertex];
    }
    void add(int source, int destination){
     list[source].add(destination);
     list[destination].add(source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no. of vertex");
        int vertex = sc.nextInt();
        Graph g = new Graph(vertex);
        System.out.println("Please enter the no. of edges");
        int edges = sc.nextInt();
        for(int i=1;i<=edges;i++){
            System.out.println("Please enter the source for edge "+i);
            int source = sc.nextInt();
            System.out.println("Please enter the destination for edge "+i);
            int destination = sc.nextInt();
            g.add(source,destination);
        }
    }
}
