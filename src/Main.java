public class Main {
    public static void main(String[] args) {
        // Задача 22. Дано N-дерево. Каждая вершина имеет некоторое значение. В каждую вершину вставить сумму значений всех его предков.
        Node rootNode = new Node(0);
        for (int i = 1; i < 5; i++) {
            rootNode.add(new Node(i));
        }
        for (Node node: rootNode.nodes) {
            for (int i = 1; i < 5; i++) {
                node.add(new Node(i));
            }
        }
        rootNode.task();
        System.out.println(rootNode.value);
        System.out.println(rootNode.nodes.get(0).value);
    }
}