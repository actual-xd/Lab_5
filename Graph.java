import java.util.HashSet;

class Graph {
    private HashSet<Vertex> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public boolean AddEdge(Vertex v1, Vertex v2, int weight) {

        return v1.getEdges().add(new Edge(v2, weight));

    }

    public boolean AddVertex(Vertex v) {
        return nodes.add(v);
    }

    public void printGraph() {

        for (Vertex v : nodes) {
            System.out.print("vertex name: " + v.getName() + ": ");
            for (Edge e : v.getEdges()) {
                System.out.print("destVertex: " + e.getDestVertex().getName() + " weight: " + e.getWeight() + " | ");
            }
            System.out.print("\n");
        }
    }
}
