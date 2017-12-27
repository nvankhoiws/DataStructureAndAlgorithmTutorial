package core.com.udemy.balazsholczer.part1.stack_queue.Dijkstra_Operation_Stack;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/27/20174:00 PM.
 */
public class App {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();
        algo.interpret("( ( ( 1 + 2 ) * ( 1 - 4 ) ) / ( 1 + 5 ) )");
        System.out.println(algo.getResult());
    }

}
