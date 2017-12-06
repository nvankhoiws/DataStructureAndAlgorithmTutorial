package core.self;

public class FindFinonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacciNo(1));
        System.out.println(getFibonacciNo(2));
        System.out.println(getFibonacciNo(3));
        System.out.println(getFibonacciNo(4));
        System.out.println(getFibonacciNo(5));
        System.out.println(getFibonacciNo(6));
        System.out.println(getFibonacciNo(7));
        System.out.println(getFibonacciNo(8));
        System.out.println(getFibonacciNo(9));
        System.out.println(getFibonacciNo(10));
    }

    public static int getFibonacciNo(int n) {

        if (n == 1) {
            return 0;
        } else if (n == 2){
            return 1;
        } else {
            return getFibonacciNo(n -1 ) + getFibonacciNo(n - 2);
        }
    }
}
