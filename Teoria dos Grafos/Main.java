public class Main {
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

        Node[] nodes = {taube, valeria, desine, andrea, daise, jair, rodrigo, ricardo, marta, alexandre, guerda, leonardo, camila};
        for (Node node : nodes) {
            graph.addNode(node);
        }

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
        graph.createRelation(leonardo, camila, "irmão de");
        graph.createRelation(camila, leonardo, "irmã de");

        graph.displayGraph();

        /*graph.displayNodeRelation(rodrigo);*/
    }
}