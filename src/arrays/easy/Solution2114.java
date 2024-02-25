package arrays.easy;

import java.util.Scanner;

public class Solution2114 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            scanner.nextLine();
            String[] sentences = new String[size];
            for (int i = 0; i < size; i++){
                sentences[i] = scanner.nextLine();
            }
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (int i = 0; i < sentences.length; i++){
            int count = 1;
            for (char ch: sentences[i].toCharArray()){
                if (ch == ' '){
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
