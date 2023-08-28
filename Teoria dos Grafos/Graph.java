import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Set<Node> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void createRelation(Node node1, Node node2, String relation) {
        node1.addRelation(node2, relation);
    }

    public void displayGraph() {
        for (Node node : nodes) {
            Map<Node, String> relations = node.getRelations();
    
            for (Map.Entry<Node, String> entry : relations.entrySet()) {
                System.out.println("(" + node.getName() + ") O------" + entry.getValue() + "------>O (" + entry.getKey().getName() + ")");
            }
        }
    }

    public void displayNodeRelation(Node node) {
        for (Map.Entry<Node, String> entry : node.getRelations().entrySet()) {
            System.out.println(node.getName() + " " + entry.getValue() + " " + entry.getKey().getName());
        }
    }
}
