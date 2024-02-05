package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1431 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++){
            candies[i] = scanner.nextInt();
        }
        int extraCandies = scanner.nextInt();
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandies = 0;
        for (int i: candies){
            maxCandies = Math.max(maxCandies, i);
        }
        for (int i: candies){
            ans.add(i + extraCandies >= maxCandies);
        }
        return ans;
    }
}
