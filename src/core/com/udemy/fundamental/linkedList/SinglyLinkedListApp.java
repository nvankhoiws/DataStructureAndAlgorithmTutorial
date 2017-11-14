package core.com.udemy.fundamental.linkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(new Node(3));
        System.out.println(singlyLinkedList.toString());
    }
}
