package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] encoded = new int[size];
        for (int i = 0; i < size; i++){
            encoded[i] = scanner.nextInt();
        }
        int first = scanner.nextInt();
        System.out.println(Arrays.toString(decode(encoded, first)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++){
            decoded[i+1] = decoded[i] ^ encoded[i];
        }
        return decoded;
    }
}
