package core.com.udemy.balazsholczer.part1.linkedlist;

public interface CList<T>{
    void insert(T data);

    void remove(T data);

    void traverseList();

    int size();
}
