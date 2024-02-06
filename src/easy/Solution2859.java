package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2859 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++){
            nums.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        System.out.println(sumIndicesWithKSetBits(nums, k));
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++){
            if(Integer.bitCount(i) == k){
                ans += nums.get(i);
            }
        }
        return ans;
    }
}
