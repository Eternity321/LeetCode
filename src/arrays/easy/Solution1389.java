package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution1389 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        int[] index = new int[size];
        for (int i = 0; i < size; i++){
            index[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            ans.add(index[i], nums[i]);
        }
        int[] ansArr = new int[nums.length];
        for (int i = 0; i < ans.size(); i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}
