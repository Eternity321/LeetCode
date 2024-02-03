package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i=0; i<length; i++){
            nums[i] = scanner.nextInt();
        }
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
