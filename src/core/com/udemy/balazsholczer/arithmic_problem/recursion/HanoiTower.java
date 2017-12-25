package core.com.udemy.balazsholczer.arithmic_problem.recursion;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/201710:22 AM.
 */
public class HanoiTower {
    private static int counter = 0;

    public static void main(String[] args) {
        solve(3, 1, 2, 3);

//        solveHanoiProblem(3, 'A', 'B', 'C');
    }

    public static void solve(int n, int rodFrom, int rodAuxiliary, int rodTo) {
        counter++;
        if (n == 1) {
            System.out.println("Solved problem with rodFrom " + rodFrom + " rodAuxiliary " + rodAuxiliary + " rodTo " + rodTo);
            System.out.println("Counter = " + counter);
        }
        solve(n-1, rodFrom, rodTo, rodAuxiliary);
        solve(n-2, rodAuxiliary, rodFrom, rodTo);
    }

    public static void solveHanoiProblem(int n, char rodFrom, char middleRod, char rodTo){

        if( n == 1 ){
            System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
            return;
        }

        solveHanoiProblem(n-1, rodFrom, rodTo, middleRod);
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
        solveHanoiProblem(n-1, middleRod, rodFrom, rodTo);
    }

}
