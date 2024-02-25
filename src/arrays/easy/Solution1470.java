package arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] ans = shuffle(nums, length / 2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[i + n];
        }
        return ans;
    }
}
