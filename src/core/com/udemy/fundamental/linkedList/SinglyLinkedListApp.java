package core.com.udemy.fundamental.linkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(7);
        singlyLinkedList.add(8);
        singlyLinkedList.add(10);
        singlyLinkedList.add(3);
        singlyLinkedList.add(2, 100);
        singlyLinkedList.add(0, 101);
        System.out.println(singlyLinkedList.toString());
    }
}
