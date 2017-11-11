package core.com.udemy.fundamental.stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String originString = "Khoi";
        String[] splittedString = originString.split("", -1);
        for (String each : splittedString) {
            stack.push(each);
        }
        String reversedString = "";
        while (stack.getSize() > 0) {
            reversedString += stack.pop();
        }
        System.out.println(reversedString);
    }
}
