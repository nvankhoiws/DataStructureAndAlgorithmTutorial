package core.com.udemy.balazsholczer.arithmic_problem.recursion;

public class EuclidGCD {
    public static void main(String[] args) {
        System.out.println(gcdIterative(4, 2));
        System.out.println(gcdRecursive(4, 2));
        System.out.println(gcdIterative(7, 5));
        System.out.println(gcdRecursive(7, 5));
        System.out.println(gcdIterative(30, 100));
        System.out.println(gcdRecursive(30, 100));

        long start = System.currentTimeMillis();
        gcdRecursive(464131524, 464);
        long end = System.currentTimeMillis();
        System.out.println("The al takes " + (end-start) + "ms");
    }

    public static int gcdIterative(int s, int e) {
        while (e != 0){
            int r = s % e;
            s = e;
            e = r;
        }
        return s;
    }

    // this algorithm same with gcdRecursive with accumulator, because s is accutal accumulator
    public static int gcdRecursive(int s, int e) {
        if (e == 0) return s;
        return gcdRecursive(e, s % e);
    }
}
