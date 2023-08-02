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

    private List<Integer> createRandomNumsList() {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            nums.add(random.nextInt(0, 100));
        }

        return nums;
    }
}
