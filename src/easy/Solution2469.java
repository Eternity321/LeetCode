package easy;

import java.util.Arrays;
import java.util.Scanner;

public class    Solution2469 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double[] ans = convertTemperature(celsius);
        System.out.println(Arrays.toString(ans));
    }
    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}
