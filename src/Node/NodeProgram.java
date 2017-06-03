package Node;

/**
 * Created by Istiak-Morsalin on 6/3/2017.
 */
public class NodeProgram {
    public static void main(String args[]) {
        Node firstNode = new Node();
        Node secondNode = new Node();
        Node thirdNode = new Node();

        firstNode.setValue(3);
        secondNode.setValue(5);
        thirdNode.setValue(7);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;


        printNode(firstNode);
        printNode(secondNode);
        printNode(thirdNode);
    }

    private static void printNode(Node node) {

        while (node != null) {
            System.out.println(node.value);
            node = node.next;

        }
    }
}
