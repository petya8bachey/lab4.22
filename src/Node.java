import java.util.ArrayList;

public class Node {
    int value;
    ArrayList<Node> nodes = new ArrayList<>();
    Node(int value){
        this.value = value;
    }
    public void add(Node node) {
        nodes.add(node);
    }
    public int task() {
        if (nodes.isEmpty()) {
            return value;
        }
        int result = 0;
        for (Node node: nodes) {
            result += node.task();
        }
        value = result;
        return result;
    }
}
