package core.com.udemy.fundamental.linkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(0);
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        doublyLinkedList.add(7);
        doublyLinkedList.displayAsString();
        doublyLinkedList.add(2, 102);
        doublyLinkedList.add(0, 100);
        doublyLinkedList.add(9, 109);
        doublyLinkedList.add(11, 111);
        doublyLinkedList.add(13, 113);
        doublyLinkedList.displayAsString();
        doublyLinkedList.isEmpty();
        doublyLinkedList.set(1, 103);
        doublyLinkedList.displayAsString();
        doublyLinkedList.get(0);
        doublyLinkedList.get(-1);
        doublyLinkedList.set(12, 212);
        doublyLinkedList.displayAsString();

        // Check remove method of SinglyLinkedList
        doublyLinkedList.removeFirstIndex(100);
        doublyLinkedList.displayAsString();
        // debugging
        doublyLinkedList.removeFirstIndex(212);
        doublyLinkedList.displayAsString();
        doublyLinkedList.removeFirstIndex(3);
        doublyLinkedList.displayAsString();

        // Check remove method by index
        doublyLinkedList.remove(6, true);
        doublyLinkedList.displayAsString();

        // Check indexOf method
        System.out.println(doublyLinkedList.firstIndexOf(109));
        System.out.println(doublyLinkedList.firstIndexOf(103));
        System.out.println(doublyLinkedList.lastIndexOf(111));
        System.out.println(doublyLinkedList.lastIndexOf(-2));

        // Check contains method
        System.out.println(doublyLinkedList.contains(7));
        System.out.println(doublyLinkedList.contains(103));
        System.out.println(doublyLinkedList.contains(111));
        System.out.println(doublyLinkedList.contains(1000));

        doublyLinkedList.clear();
        doublyLinkedList.displayAsString();

    }
}
