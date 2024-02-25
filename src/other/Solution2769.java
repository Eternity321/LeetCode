package other;

import java.util.Scanner;

public class Solution2769 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int t = scanner.nextInt();
        int x = theMaximumAchievableX(num, t);
        System.out.println(x);
    }
    public static int theMaximumAchievableX(int num, int t) {
        int x = num + (t*2);
        return x;
    }
}
