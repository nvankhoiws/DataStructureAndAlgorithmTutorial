package core.com.udemy.balazsholczer.arithmic_problem.recursion;

public class HeadTail {
    public static void main(String[] args) {
        int start1  = (int) System.currentTimeMillis();
        tail(1000);
        int end1  = (int) System.currentTimeMillis();
        System.out.println("This algorithim takes " + (end1 - start1));
        System.out.println();
        int start2  = (int) System.currentTimeMillis();
        head(1000);
        int end2  = (int) System.currentTimeMillis();
        System.out.println("This algorithim takes " + (end2 - start2));


    }


    // base case is located at head, tail is at 5, so it prints 5 first, then decrease
    public static void tail(int N) {
        if (N == 0) return;
//        System.out.print(N + "\t");
        tail(N-1);
    }

    public static void head(int N) {
        if (N == 0) return;
        head(N-1);
//        System.out.print(N + "\t");
    }


}
