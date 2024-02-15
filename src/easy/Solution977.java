package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution977 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length-1;
        int leftSq, rightSq;
        for (int i = nums.length-1; i >= 0; i--){
            leftSq = nums[left] * nums[left];
            rightSq = nums[right] * nums[right];
            if (leftSq > rightSq){
                ans[i] = leftSq;
                left++;
            } else {
                ans[i] = rightSq;
                right--;
            }
        }
        return ans;
    }
}
