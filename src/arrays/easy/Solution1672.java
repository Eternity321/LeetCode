package arrays.easy;

import java.util.Scanner;

public class Solution1672 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int person = scanner.nextInt();
        int countBank = scanner.nextInt();
        int[][] accounts = new int[person][countBank];
        for(int i = 0; i < person; i++){
            for (int j = 0; j < countBank; j++){
                accounts[i][j] = scanner.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        int[] sumBalance = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                sumBalance[i] += accounts[i][j];
            }
        }
        for (int l = 0; l < accounts.length; l++){
            if(sumBalance[l] > ans){
                ans = sumBalance[l];
            }
        }
        return ans;
    }
}
