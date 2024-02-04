package easy;

import java.util.Scanner;

public class Solution1512 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int nums[] = new int[length];
        for (int i = 0; i < length; i++){
            nums[i] = scanner.nextInt();
        }
        int ans = numIdenticalParis(nums);
        System.out.println(ans);
    }
    public static int numIdenticalParis(int[] nums){
        int ans = 0;
        for(int  i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j] && i < j){
                    ans++;
                }
            }
        }
        return ans;
    }
}
