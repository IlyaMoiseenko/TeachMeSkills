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




//        // FOURTH TASK
//        int[] values1 = WorkWithArray.CreateRandomArray();
//        int[] values2 = WorkWithArray.CreateRandomArray();
//
//        System.out.println(Arrays.toString(values1));
//        System.out.println(Arrays.toString(values2));
//
//        _biggestAverage(
//                WorkWithArray.Average(values1),
//                WorkWithArray.Average(values2)
//        );




//        // FIFTH TASK
//        boolean key = true;
//        int sizeOfArray = 0;
//
//        while (key) {
//            System.out.print("Enter size of array: ");
//            sizeOfArray = _createScanner().nextInt();
//
//            if (sizeOfArray > 5 && sizeOfArray <= 10)
//                key = false;
//        }
//
//        int[] array = WorkWithArray.CreateRandomArray(sizeOfArray);
//        System.out.println(Arrays.toString(array));
//        int[] evenArray = _createArrayFromEvenElements(array);
//        System.out.println(Arrays.toString(evenArray));




//        // SIXTH TASK
//        int[] array = WorkWithArray.CreateArrayFromConsole();
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(_changeWithOddIndex(array)));




//        // SEVENTH TASK
//        String[] names = new String[] {"Ilya", "Marina", "Karina", "Katya", "Egor", "Lena", "Kolya"};
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
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

    private static int[] _createArrayFromEvenElements(int[] oldArray) {
        int[] newArray = new int[10];

        for (int i = 0; i < oldArray.length; i++) {
            if (i == newArray.length)
                newArray = Arrays.copyOf(newArray, newArray.length + 10);
            else
                if (oldArray[i] % 2 == 0)
                    newArray[i] = oldArray[i];

        }

        return newArray;
    }

    private static int[] _changeWithOddIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1)
                array[i] = 0;
        }

        return array;
    }

    private static Scanner _createScanner() {
        return new Scanner((System.in));
    }
}