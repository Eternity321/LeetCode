package medium;

import java.util.*;

public class Solution271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] strs = new String[size];
        for (int i = 0; i < size; i++) {
            strs[i] = scanner.next();
        }
        System.out.println(decode(encode(List.of(strs))));
    }

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs){
            encodedString.append(str.length()).append('#').append(str);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.valueOf(str.substring(i,j));
            i = j + 1 + length;
            ans.add(str.substring(j + 1, i));
        }
        return ans;
    }
}
