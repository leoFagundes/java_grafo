import java.util.HashMap;
import java.util.Map;

public class Node {
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
