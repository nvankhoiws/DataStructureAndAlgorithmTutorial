package core.com.udemy.balazsholczer.arithmic_problem.recursion;

public class FactorialProblem {
    public static void main(String[] args) {
        long start  = System.currentTimeMillis();
        System.out.println(factorial(20) + "");
        long end = System.currentTimeMillis();
        System.out.println("This algorithim takes " + (end - start) + "ms");

        long start2  = System.currentTimeMillis();
        System.out.println(factorialwithaccumulator(1, 20) + "");
        long end2 = System.currentTimeMillis();
        System.out.println("This algorithim takes " + (end2 - start2) + "ms");
    }

    // Not use accumulator
    public static long factorial(int n) {
        if (n == 1) return 1;
        return (n * factorial(n-1));
    }

    // Use accumulator. faster than with out
    public static long factorialwithaccumulator(long accumulator, int n){
        if (n == 1) return accumulator;
        return factorialwithaccumulator(accumulator * n, n - 1);
    }
}
