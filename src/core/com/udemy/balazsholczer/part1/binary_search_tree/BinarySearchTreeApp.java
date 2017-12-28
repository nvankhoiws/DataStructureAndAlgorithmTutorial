package core.com.udemy.balazsholczer.part1.binary_search_tree;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        Tree tree = new BinarySearchTree();

        tree.insert(78);
        tree.insert(-12);
        tree.insert(301);
        tree.insert(1);
        tree.insert(-12);
        tree.insert(1000);
        tree.insert(99);

        System.out.println(tree.getMax());
        System.out.println(tree.getMin());

        tree.traversal();
    }
}
