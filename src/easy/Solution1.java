package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            if(numMap.containsKey(target - nums[i]) && i != numMap.get(target-nums[i])){
                return new int[]{numMap.get(target-nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}
