import calculator.Calculator;
import exceptions.HaveTwoOperandsException;
import exceptions.IncorrectExpression;
import inputOutput.InputOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean key = true;

        while (key) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Enter expression");
            System.out.println("2. Check history");
            System.out.println("3. Exit");

            int guess = scanner.nextInt();
            switch (guess) {
                case 1:
                    System.out.print("Expression: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String expression = scanner1.nextLine();
                    try {
                        Calculator calculator = new Calculator(expression);
                        System.out.println(calculator.calculate());
                    } catch (IncorrectExpression | HaveTwoOperandsException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3: key = false;
                case 2: InputOutput.getHistory();
            }
        }
    }
}