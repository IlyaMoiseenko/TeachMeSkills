import java.util.Arrays;
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




        // TASK #3
//        int[][] firstMatrix = WorkWithMatrix.CreateRandomMatrix(3, 3);
//        int[][] secondMatrix = WorkWithMatrix.CreateRandomMatrix(3, 3);
//        int[][] resultOfMultiplication = WorkWithMatrix.MatrixMultiplication(firstMatrix, secondMatrix);
//        WorkWithMatrix.PrintMatrix(resultOfMultiplication);




        // TASK #4
//        int sum = 0;
//        int[][] matrix = WorkWithMatrix.CreateRandomMatrix();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                sum += matrix[i][j];
//            }
//        }
//
//        System.out.println("Sum: " + sum);




        // TASK #5
//        int[][] matrix = WorkWithMatrix.CreateRandomMatrix(5, 5);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i; j < matrix.length; j++) {
//                System.out.println(matrix[i][j]);
//                break;
//            }
//        }




        // TASK #6
//        int[][] matrix = WorkWithMatrix.CreateRandomMatrix(10, 10);
//
//        for (int i = 0; i < matrix.length; i++) {
//            Arrays.sort(matrix[i]);
//        }
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