package core.com.udemy.fundamental.dataStructures.linkedList;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/17/201711:12 AM.
 */
public class CircularLinkedListApp {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.insertFirst(1);
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertLast(3);

        circularLinkedList.deleteFirst();

        circularLinkedList.displayList();
    }

}
