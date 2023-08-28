import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Node {
    private String name;
    private Map<Node, String> relations;

    public Node(String name) {
        this.name = name;
        this.relations = new HashMap<>();
    }

    public void addRelation(Node node, String relation) {
        this.relations.put(node, relation);
    }

    public String getName() {
        return name;
    }

    public Map<Node, String> getRelations() {
        return relations;
    }
}

class Graph {
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
                System.out.println(node.getName() + " " + entry.getValue() + " " + entry.getKey().getName());
            }
        }
    }

    public void displayNodeRelation(Node rodrigo) {
    }

    public void displayVisualGraph() {
    }
}
/*public class Main -> o nome do arquivo tem que ser 'main'*/
class Main {
    public static void main(String[] args) {
        Node taube = new Node("Taube");
        Node valeria = new Node("Valeria");
        Node desine = new Node("Desine");
        Node andrea = new Node("Andrea");
        Node daise = new Node("Daise");
        Node jair = new Node("Jair");
        Node rodrigo = new Node("Rodrigo");
        Node ricardo = new Node("Ricardo");
        Node marta = new Node("Marta");
        Node alexandre = new Node("Alexandre");
        Node guerda = new Node("Guerda");
        Node leonardo = new Node("Leonardo");
        Node camila = new Node("Camila");

        Graph graph = new Graph();
        
        // Adding nodes to the graph
        Node[] nodes = {taube, valeria, desine, andrea, daise, jair, rodrigo, ricardo, marta, alexandre, guerda, leonardo, camila};
        for (Node node : nodes) {
            graph.addNode(node);
        }

        // Adding relations
        graph.createRelation(taube, valeria, "pai de");
        graph.createRelation(taube, desine, "pai de");
        graph.createRelation(taube, andrea, "pai de");
        graph.createRelation(daise, valeria, "mãe de");
        graph.createRelation(daise, desine, "mãe de");
        graph.createRelation(daise, andrea, "mãe de");
        
        graph.createRelation(jair, rodrigo, "pai de");
        graph.createRelation(jair, ricardo, "pai de");
        graph.createRelation(jair, marta, "pai de");
        graph.createRelation(jair, alexandre, "pai de");
        graph.createRelation(guerda, rodrigo, "mãe de");
        graph.createRelation(guerda, ricardo, "mãe de");
        graph.createRelation(guerda, marta, "mãe de");
        graph.createRelation(guerda, alexandre, "mãe de");
        
        graph.createRelation(rodrigo, leonardo, "pai de");
        graph.createRelation(rodrigo, camila, "pai de");
        graph.createRelation(valeria, leonardo, "mãe de");
        graph.createRelation(valeria, camila, "mãe de");

        /*graph.displayGraph();*/

        for (Map.Entry<Node, String> entry : rodrigo.getRelations().entrySet()) {
            System.out.println(rodrigo.getName() + " " + entry.getValue() + " " + entry.getKey().getName());
}
    }
}
