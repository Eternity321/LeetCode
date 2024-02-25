package arrays.medium;

import java.util.*;

public class Solution347 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                int value = count.get(nums[i]);
                value += 1;
                count.put(nums[i], value);
            } else {
                count.put(nums[i], 1);
            }
        }
        List<Integer> keys = new ArrayList<>(count.keySet());
        keys.sort((n1, n2) -> count.get(n2) - count.get(n1));
        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i] = keys.get(i);
        }
        return ans;
    }
}
