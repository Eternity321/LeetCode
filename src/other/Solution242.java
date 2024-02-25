package other;

import java.util.Scanner;

public class Solution242 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }
        for (int lt: letters){
            if (lt != 0){
                return false;
            }
        }
        return true;
    }
}
