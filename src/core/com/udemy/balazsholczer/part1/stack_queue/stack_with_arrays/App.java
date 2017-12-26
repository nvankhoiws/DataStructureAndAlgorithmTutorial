package core.com.udemy.balazsholczer.part1.stack_queue.stack_with_arrays;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Bibica");
        stack.push("Mama");
        stack.push("Coca");

        stack.traverseStack();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
