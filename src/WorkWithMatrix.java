import java.util.Scanner;

public class WorkWithMatrix {
    private static int _getSizeOfArray() {
        System.out.print("Enter size of array: ");

        return _createScanner().nextInt();
    }

    private static Scanner _createScanner() {
        return new Scanner(System.in);
    }

    private static int _getRandomNumber() {
        return (int)(0 + Math.random() * 10);
    }

    public static int[][] CreateRandomMatrix() {
        int[][] newArray = new int[_getSizeOfArray()][_getSizeOfArray()];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[i][j] = _getRandomNumber();
            }
        }

        return newArray;
    }

    public static int[][] CreateRandomMatrix(int n, int m) {
        int[][] newArray = new int[n][m];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[i][j] = _getRandomNumber();
            }
        }

        return newArray;
    }

    public static int[][][] CreateRandomMatrix(int n, int m, int k) {
        int[][][] newArray = new int[n][m][k];

        for (int i = 0; i < newArray.length; i++)
            for (int j = 0; j < newArray.length; j++)
                for (int v = 0; v < newArray.length; v++)
                    newArray[i][j][v] = _getRandomNumber();

        return newArray;
    }

    public static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void PrintMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void PrintMatrix(int[][][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                for (int v = 0; v < values.length; v++) {
                    System.out.print("arr[" + i + "][" + j + "][" + v + "] = " + values[i][j][v] + "\t");
                }

                System.out.println();
            }
        }
    }

    public static int[][] MatrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix[row].length; col++) {
                resultMatrix[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return resultMatrix;
    }

    private static int multiplyMatricesCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {
        int cell = 0;

        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
}
