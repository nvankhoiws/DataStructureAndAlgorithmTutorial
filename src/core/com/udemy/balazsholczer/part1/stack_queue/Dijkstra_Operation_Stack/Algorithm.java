package core.com.udemy.balazsholczer.part1.stack_queue.Dijkstra_Operation_Stack;

import java.util.Stack;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/27/20173:48 PM.
 */
public class Algorithm {

    private Stack<String> operationStack;

    private Stack<String> valueStack;

    public Algorithm() {
        operationStack = new Stack<>();
        valueStack = new Stack<>();
    }

    public void interpret(String expression){
        String[] splitted = expression.split(" ");
        for (int i = 0, length = splitted.length; i < length; i++) {
            String elem = splitted[i];
            if (elem.equalsIgnoreCase("(")){
                continue;
            } else if (elem.equalsIgnoreCase(")")) {
                String operator = operationStack.pop();
                Double secondOperand = Double.valueOf(valueStack.pop());
                Double firstOperand = Double.valueOf(valueStack.pop());
                if (operator.equalsIgnoreCase("+"))
                    valueStack.push(String.valueOf( firstOperand + secondOperand));
                else if (operator.equalsIgnoreCase("*"))
                    valueStack.push(String.valueOf(firstOperand * secondOperand));
                else if (operator.equalsIgnoreCase("-"))
                    valueStack.push(String.valueOf(firstOperand - secondOperand));
                else if (operator.equalsIgnoreCase("/"))
                    valueStack.push(String.valueOf(firstOperand / secondOperand));
            } else if (elem.equalsIgnoreCase("+") || elem.equalsIgnoreCase("-") || elem.equalsIgnoreCase("*") || elem.equalsIgnoreCase("/")) {
                operationStack.push(elem);
            } else {
                valueStack.push(elem);
            }
        }
    }

    public Double getResult(){
        return Double.valueOf(valueStack.pop());
    }

}
