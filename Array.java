package ShuffleArray;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(nums));

        shuffle(nums);

        System.out.println("Shuffled Array: " + Arrays.toString(nums));
    }

    public static void shuffle(int[] nums) {
        Random rand = new Random();
        for (int i = nums.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
