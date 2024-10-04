public class GraphImplementation {
    public static void main(String[] args) {
        Graph ourGraph = new Graph();

        //vertices
        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");
        Vertex v3 = new Vertex("D");
        Vertex v4 = new Vertex("E");
        Vertex v5 = new Vertex("F");
        Vertex v6 = new Vertex("G");

        ourGraph.AddVertex(v0);
        ourGraph.AddVertex(v1);
        ourGraph.AddVertex(v2);
        ourGraph.AddVertex(v3);
        ourGraph.AddVertex(v4);
        ourGraph.AddVertex(v5);
        ourGraph.AddVertex(v6);

        //edges
        ourGraph.AddEdge(v0, v1, 1);
        ourGraph.AddEdge(v0, v2, 1);
        ourGraph.AddEdge(v0, v3, 1); // A
        ourGraph.AddEdge(v0, v4, 1);
        ourGraph.AddEdge(v0, v5, 1);

        ourGraph.AddEdge(v1, v0, 1);
        ourGraph.AddEdge(v1, v2, 1);
        ourGraph.AddEdge(v1, v3, 1); // B
        ourGraph.AddEdge(v1, v4, 1);
        ourGraph.AddEdge(v1, v6, 1);

        ourGraph.AddEdge(v2, v0, 1);
        ourGraph.AddEdge(v2, v1, 1);
        ourGraph.AddEdge(v2, v3, 1); // C
        ourGraph.AddEdge(v2, v5, 1);
        ourGraph.AddEdge(v2, v6, 1);

        ourGraph.AddEdge(v3, v0, 1);
        ourGraph.AddEdge(v3, v1, 1);
        ourGraph.AddEdge(v3, v2, 1); // D
        ourGraph.AddEdge(v3, v4, 1);
        ourGraph.AddEdge(v3, v5, 1);
        ourGraph.AddEdge(v3, v6, 1);

        ourGraph.AddEdge(v4, v0, 1);
        ourGraph.AddEdge(v4, v1, 1);
        ourGraph.AddEdge(v4, v3, 1); // E
        ourGraph.AddEdge(v4, v5, 1);
        ourGraph.AddEdge(v4, v6, 1);

        ourGraph.AddEdge(v5, v0, 1);
        ourGraph.AddEdge(v5, v2, 1);
        ourGraph.AddEdge(v5, v3, 1); // F
        ourGraph.AddEdge(v5, v4, 1);
        ourGraph.AddEdge(v5, v6, 1);

        ourGraph.AddEdge(v6, v1, 1);
        ourGraph.AddEdge(v6, v2, 1);
        ourGraph.AddEdge(v6, v3, 1); // G
        ourGraph.AddEdge(v6, v4, 1);
        ourGraph.AddEdge(v6, v5, 1);


        ourGraph.printGraph();

    }
}
