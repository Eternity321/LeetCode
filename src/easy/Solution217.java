package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution217 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet();
        for (int i: nums){
            if (numsSet.contains(i)){
                return true;
            }
            numsSet.add(i);
        }
        return false;
    }
}
