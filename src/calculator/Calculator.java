package calculator;

import exceptions.HaveTwoOperandsException;
import exceptions.IncorrectExpression;
import inputOutput.InputOutput;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> actions;
    private List<String> regexActions;
    private String expression;

    public Calculator(String expression) {
        this.expression = expression;
        actions = getActions();
        regexActions = getRegexActions();
    }

    private List<String> getActions() {
        List<String> operations = new ArrayList<>();

        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        return operations;
    }

    private List<String> getRegexActions() {
        List<String> operations = new ArrayList<>();

        operations.add("\\+");
        operations.add("-");
        operations.add("/");
        operations.add("\\*");

        return operations;
    }

    private int arithmeticAction() {
        int actionIndex = -1;

        for (int i = 0; i < actions.size(); i++) {
            if (expression.contains(actions.get(i))){
                actionIndex = i;
                break;
            }
        }

        return actionIndex;
    }

    private boolean checkNumberOfOperands(String[] data) {
        return data.length != 2;
    }

    public int calculate() throws Exception {
        int actionIndex = arithmeticAction();

        if (actionIndex == -1)
            throw new IncorrectExpression("Некорретное выражение");


        String[] data = expression.split(regexActions.get(actionIndex));

        if (checkNumberOfOperands(data))
            throw new HaveTwoOperandsException("Должно быть 2 операнда");

        int a = Integer.parseInt(data[0].trim());
        int b = Integer.parseInt(data[1].trim());

        int result = switch (actions.get(actionIndex)) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> a / b;
        };

        InputOutput.writeToFile(a + " " + actions.get(actionIndex) + " " + b + " = " + result + "\n");

        return result;
    }
}
