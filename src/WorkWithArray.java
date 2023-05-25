import java.util.Scanner;

public class WorkWithArray {
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

    public static int[] CreateRandomArray() {
        int[] newArray = new int[_getSizeOfArray()];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = _getRandomNumber();
        }

        return newArray;
    }

    public static int[] CreateArrayFromConsole() {
        int[] newArray = new int[_getSizeOfArray()];

        for (int i = 0; i < newArray.length; i++) {
            System.out.print("Enter number: ");
            newArray[i] = _createScanner().nextInt();
        }

        return newArray;
    }
}
