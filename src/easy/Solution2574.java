package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2574 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i=0; i<length; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;
        int[] rightSum = new int[nums.length];
        rightSum[nums.length-1] = 0;
        int[] ans = new int[nums.length];
        for (int i = 1; i < nums.length; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for (int i = nums.length-1; i > 0; i--){
            rightSum[i - 1] = rightSum[i] + nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}
