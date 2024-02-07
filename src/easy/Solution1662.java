package easy;

import java.util.Scanner;

public class Solution1662 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        String[] word1 = new String[size1];
        for (int i = 0; i < size1; i++){
            word1[i] = scanner.next();
        }
        int size2 = scanner.nextInt();
        String[] word2 = new String[size1];
        for (int i = 0; i < size1; i++){
            word2[i] = scanner.next();
        }
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String stWord1 = "";
        String stWord2 = "";
        for (String st1: word1){
            stWord1 = stWord1 + st1;
        }
        for (String st2: word2){
            stWord2 = stWord2 + st2;
        }
        return stWord1.equals(stWord2)?true:false;
    }
}
