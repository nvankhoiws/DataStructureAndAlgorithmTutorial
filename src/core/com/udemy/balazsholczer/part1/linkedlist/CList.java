package core.com.udemy.balazsholczer.part1.linkedlist;

import java.util.List;

public interface CList<T extends Comparable<T>> extends List<T> {
    void insert(T data);

    Node<T> remove(T data);

    void traverseList();

    int size();
}
