package easy;

import java.util.Scanner;

public class Solution2011 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] operations = input.split(" ");
        int x = finalValueAfterOperations(operations);
        System.out.println(x);

    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations){
            switch (op){
                case "++X", "X++":
                    x++;
                    break;
                case "--X", "X--":
                    x--;
                    break;
                default:
                    break;
            }
        }
        return x;
    }
}
