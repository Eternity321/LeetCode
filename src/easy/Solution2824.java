package easy;

import java.util.*;

public class Solution2824 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            nums.add(num);
        }
        System.out.println(countPairs(nums, target));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++){
            for (int j = 0; j < nums.size(); j++){
                if (j < i && nums.get(j) + nums.get(i) < target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
