import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // FIRST TASK
//        int[] array = WorkWithArray.CreateRandomArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(_findNumber(array, 2));




//        // SECOND TASK
//        int[] array = WorkWithArray.CreateArrayFromConsole();
//        System.out.print("Enter value to delete: ");
//        array = _removeElement(array, _createScanner().nextInt());
//        System.out.println(Arrays.toString(array));




//        // THIRD TASK
//        int[] array = WorkWithArray.CreateRandomArray();
//        _findMaxMinAverage(array);




        // FOURTH TASK
        int[] values1 = WorkWithArray.CreateRandomArray();
        int[] values2 = WorkWithArray.CreateRandomArray();

        System.out.println(Arrays.toString(values1));
        System.out.println(Arrays.toString(values2));

        _biggestAverage(
                WorkWithArray.Average(values1),
                WorkWithArray.Average(values2)
        );
    }

    private static boolean _findNumber(int[] numbers, int searchNumber) {
        for (int number : numbers) {
            if (number == searchNumber) {
                return true;
            }
        }

        return false;
    }

    private static int[] _removeElement(int[] nums, int value) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value)
                offset++;
            else
                nums[i - offset] = nums[i];
        }

        return Arrays.copyOf(nums, nums.length - offset);
    }

    private  static void _findMaxMinAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println(
                "Min: " + min + "\n"
                + "Max: " + max + "\n"
                + "Average: " + WorkWithArray.Average(nums)
        );
    }

    private static void _biggestAverage(float num1, float num2) {
        if (num1 > num2)
            System.out.println("Average #1 > Average #2");
        else if (num2 > num1)
            System.out.println("Average #1 < Average #2");
        else
            System.out.println("equal");
    }

    private static Scanner _createScanner() {
        return new Scanner((System.in));
    }
}