package core.com.udemy.fundamental.linkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(7);
        singlyLinkedList.displayAsString();
        singlyLinkedList.add(2, 102);
        singlyLinkedList.add(0, 100);
        singlyLinkedList.add(9, 109);
        singlyLinkedList.add(11, 111);
        singlyLinkedList.add(13, 113);
        singlyLinkedList.displayAsString();
        singlyLinkedList.isEmpty();
        singlyLinkedList.set(1, 103);
        singlyLinkedList.displayAsString();
        singlyLinkedList.get(0);
        singlyLinkedList.get(-1);
        singlyLinkedList.set(12, 212);
        singlyLinkedList.displayAsString();

        // Check remove method of SinglyLinkedList
        singlyLinkedList.remove(100);
        singlyLinkedList.displayAsString();
        singlyLinkedList.remove(212);
        singlyLinkedList.displayAsString();
        singlyLinkedList.remove(3);
        singlyLinkedList.displayAsString();

        // Check remove method by index
        singlyLinkedList.remove(6, true);
        singlyLinkedList.displayAsString();

        // Check indexOf method
        System.out.println(singlyLinkedList.indexOf(109));
        System.out.println(singlyLinkedList.indexOf(103));
        System.out.println(singlyLinkedList.indexOf(111));
        System.out.println(singlyLinkedList.indexOf(-2));

        // Check contains method
        System.out.println(singlyLinkedList.contains(7));
        System.out.println(singlyLinkedList.contains(103));
        System.out.println(singlyLinkedList.contains(111));
        System.out.println(singlyLinkedList.contains(1000));

    }
}
