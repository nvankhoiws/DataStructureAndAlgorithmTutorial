package core.com.udemy.fundamental.dataStructures.linkedList;

public class NoteApp {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.setData(1);

        Node nodeB = new Node();
        nodeB.setData(2);

        Node nodeC = new Node();
        nodeC.setData(3);

        Node nodeD = new Node();
        nodeD.setData(4);

        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);

        System.out.println(listLength(nodeC));
    }

    public static int listLength(Node node) {
        int returned = 1;
        while(node.getNext() != null){
            returned++;
            node = node.getNext();
        }
        return returned;
    }
}
