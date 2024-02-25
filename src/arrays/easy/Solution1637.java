package arrays.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution1637 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] points = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                points[i][j] = scanner.nextInt();
            }
        }
        System.out.println(maxWidthOfVerticalArea(points));
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
            Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
            int max_width = 0;
            for (int i = 1; i < points.length; i++){
                int width = points[i][0] - points[i-1][0];
                max_width =Math.max(max_width, width);
            }
            return max_width;
    }
}
