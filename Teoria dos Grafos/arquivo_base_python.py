class Node:
    def __init__(self, name: str):
        self.name = name
        self.relations = {}

    def add_relation(self, node, relation):
        self.relations[node] = relation

    def get_name(self):
        return self.name

    def get_relations(self):
        return self.relations

class Graph:
    def __init__(self):
        self.nodes = []

    def add_node(self, node):
        self.nodes.append(node)

    def create_relation(self, node1, node2, relation):
        node1.add_relation(node2, relation)

    def display_graph(self):
        for node in self.nodes:
            node_name = node.get_name()
            relations_list = []

            for adj_node, rel in node.get_relations().items():
                relation_str = f"{node_name} {rel} {adj_node.get_name()}"
                relations_list.append(relation_str)

            relations_str = "\n".join(relations_list)
            if relations_list:
                print(f'{relations_str}\n')

if __name__ == '__main__':
    Taube = Node('Taube')
    Valeria = Node('Valeria')
    Desine = Node('Desine')
    Andrea = Node('Andrea')
    Daise = Node('Daise')
    Jair = Node('Jair')
    Rodrigo = Node('Rodrigo')
    Ricardo = Node('Ricardo')
    Marta = Node('Marta')
    Alexandre = Node('Alexandre')
    Guerda = Node('Guerda')
    Leonardo = Node('Leonardo')
    Camila = Node('Camila')

    g = Graph()

    # Adicionando os nós
    nodes = [Taube, Valeria, Desine, Andrea, Daise, Jair, Rodrigo, Ricardo, Marta, Alexandre, Guerda, Leonardo, Camila]
    for node in nodes:
        g.add_node(node)

    # Adicionando as relações
    g.create_relation(Taube, Valeria, "pai de")
    g.create_relation(Taube, Desine, "pai de")
    g.create_relation(Taube, Andrea, "pai de")
    g.create_relation(Daise, Valeria, "mãe de")
    g.create_relation(Daise, Desine, "mãe de")
    g.create_relation(Daise, Andrea, "mãe de")

    g.create_relation(Jair, Rodrigo, "pai de")
    g.create_relation(Jair, Ricardo, "pai de")
    g.create_relation(Jair, Marta, "pai de")
    g.create_relation(Jair, Alexandre, "pai de")
    g.create_relation(Guerda, Rodrigo, "mãe de")
    g.create_relation(Guerda, Ricardo, "mãe de")
    g.create_relation(Guerda, Marta, "mãe de")
    g.create_relation(Guerda, Alexandre, "mãe de")

    g.create_relation(Rodrigo, Leonardo, "pai de")
    g.create_relation(Rodrigo, Camila, "pai de")
    g.create_relation(Valeria, Leonardo, "mãe de")
    g.create_relation(Valeria, Camila, "mãe de")

    g.display_graph()
