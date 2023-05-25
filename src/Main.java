import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // FIRST TASK
//        int[] array = WorkWithArray.CreateRandomArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(_findNumber(array, 2));
    }

    private static boolean _findNumber(int[] numbers, int searchNumber) {
        for (int number : numbers) {
            if (number == searchNumber) {
                return true;
            }
        }

        return false;
    }
}