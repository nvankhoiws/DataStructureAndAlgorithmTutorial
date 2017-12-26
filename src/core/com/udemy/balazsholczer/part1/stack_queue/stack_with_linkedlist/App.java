package core.com.udemy.balazsholczer.part1.stack_queue.stack_with_linkedlist;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Dung");
        stack.push("Khoi");
        stack.push("Coca");

        System.out.println(stack.peak());

        stack.traverseStack();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.traverseStack();

    }
}
