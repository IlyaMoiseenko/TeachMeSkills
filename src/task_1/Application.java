package task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    private final Random random = new Random();
    private final List<Integer> nums;

    public List<Integer> getNums() {
        return nums;
    }

    public Application() {
        this.nums = createRandomNumsList();
    }

    public void start() {
        deleteDuplicates();
        evenNumbers();
        multiply();
        sortedNumsLimitFour();
        countOfStream();
        average();
    }

    private void deleteDuplicates() {
        System.out.println("Nums without duplicates");

        List<Integer> numsWithoutDuplicates = nums.stream().distinct().toList();
        System.out.println(numsWithoutDuplicates);
    }

    private void evenNumbers() {
        System.out.println("Even numbers in the range from 7 to 17");

        List<Integer> evenNumbers = nums.stream().filter(num -> num >= 7 && num <= 17 && isEven(num)).toList();
        System.out.println(evenNumbers);
    }

    private void multiply() {
        System.out.println("Multiply nums");

        List<Integer> multiplyNums = nums.stream().map(num -> num * 2).toList();
        System.out.println(multiplyNums);
    }

    private void sortedNumsLimitFour() {
        System.out.println("Sorted nums with limit 4");

        List<Integer> sortedNums = nums.stream().sorted().limit(4).toList();
        System.out.println(sortedNums);
    }

    private void countOfStream() {
        System.out.println("Count of stream");

        System.out.println(nums.stream().count());
    }

    private void average() {
        System.out.println("Average");
        System.out.println(nums.stream().mapToInt(num -> num).average());
    }

    private boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    private List<Integer> createRandomNumsList() {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            nums.add(random.nextInt(0, 100));
        }

        return nums;
    }
}
