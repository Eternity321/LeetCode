package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution1313 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2){
            for (int j = 0; j < nums[i]; j++){
                ans.add(nums[i+1]);
            }
        }
        int[] ansArr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}
