package easy;

import java.util.Scanner;

public class Solution2798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int workers = scanner.nextInt();
        int[] hours = new int[workers];
        for (int i = 0; i < workers; i++){
            hours[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int h: hours){
            if(h >= target){
                ans++;
            }
        }
        return ans;
    }
}
