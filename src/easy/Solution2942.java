package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2942 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String xInput = scanner.next();
        char x = 0;
        if (xInput.length() > 0) {
            x = xInput.charAt(0);
        }
        String[] words = input.split(" ");
        List<Integer> ans = findWordsContaining(words, x);
        System.out.println(ans);
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
