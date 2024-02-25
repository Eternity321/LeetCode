package arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1480 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        String ans = Arrays.toString(runningSum(nums));
        System.out.println(ans);
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
