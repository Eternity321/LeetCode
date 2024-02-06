package medium;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2433 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pref = new int[n];
        for (int i = 0; i < n; i++){
            pref[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(findArray(pref)));
    }
    public static int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        for (int i = 1; i < pref.length; i++){
            ans[i] = pref[i-1] ^ pref[i];
        }
        return ans;
    }
}
