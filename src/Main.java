import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TASK #1
//        int[][][] values = WorkWithMatrix.CreateRandomMatrix(5, 5, 5);
//        WorkWithMatrix.PrintMatrix(values);
//        _increaseTheValues(values);
//        WorkWithMatrix.PrintMatrix(values);




        // TASK #2
//        String[][] stringMatrix = new String[8][8];
//        for (int i = 0; i < stringMatrix.length; i++) {
//            for (int j = 0; j < stringMatrix.length; j++) {
//                if (j % 2 == 1) stringMatrix[i][j] = "B";
//                else stringMatrix[i][j] = "W";
//            }
//        }
//
//        WorkWithMatrix.PrintMatrix(stringMatrix);
    }

    private static void _increaseTheValues(int[][][] values) {
        System.out.print("Value: ");
        int guessValue = _createScanner().nextInt();

        for (int i = 0; i < values.length; i++)
            for (int j = 0; j < values.length; j++)
                for (int v = 0; v < values.length; v++)
                    values[i][j][v] += guessValue;
    }

    private static Scanner _createScanner() {
        return new Scanner(System.in);
    }
}