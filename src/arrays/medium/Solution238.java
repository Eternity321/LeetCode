package arrays.medium;

import java.util.Arrays;

import java.util.Scanner;

public class Solution238 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
//    public static int[] productExceptSelf(int[] nums) {
//        int[] pref = new int[nums.length];
//        int[] suf = new int[nums.length];
//        int[] ans =new int[nums.length];
//        pref[0] = 1;
//        suf[nums.length-1] = 1;
//        for (int i = 1; i < nums.length; i++){
//            pref[i] = pref[i-1] * nums[i-1];
//        }
//        for (int i = nums.length-2; i >= 0; i--){
//            suf[i] = suf[i+1] * nums[i+1];
//        }
//        for (int i = 0; i < nums.length; i++){
//            ans[i] = pref[i] * suf[i];
//        }
//        return ans;
//    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans =new int[nums.length];
        Arrays.fill(ans, 1);
        int sum = 1;
        for (int i = 0; i < nums.length; i++){
            ans[i] *= sum;
            sum *= nums[i];
        }
        sum = 1;
        for (int i = nums.length-1; i >= 0; i--){
            ans[i] *= sum;
            sum *= nums[i];
        }
        return ans;
    }
}
