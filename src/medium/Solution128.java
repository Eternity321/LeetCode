package medium;

import java.util.HashSet;
import java.util.Scanner;

public class Solution128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        int maxCount = 1;
        for (int num : nums) {
            hs.add(num);
        }
        for (int num : nums) {
            if (!hs.contains(num - 1)) {
                int count = 1;
                while (hs.contains(num + 1)) {
                    num++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
            if(maxCount > nums.length/2) break;
        }
        return maxCount;
    }
}