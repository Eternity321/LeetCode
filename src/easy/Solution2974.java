package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2974 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numberGame(nums)));
    }
    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2){
            arr[i+1] = nums[i];
            arr[i] = nums[i+1];
        }
        return arr;
    }
}
