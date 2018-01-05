package core.self;

public class SumNotUsingTempVar {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        a = a+b;
        b = a - b;
        a = a - b;
    }
}
