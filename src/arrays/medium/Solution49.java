package arrays.medium;

import java.util.*;

public class Solution49 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] strs = new String[size];
        for (int i = 0; i < size; i++){
            strs[i] = scanner.nextLine();
        }
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ansMap = new HashMap<>();
        for (String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!ansMap.containsKey(sortedWord)){
                ansMap.put(sortedWord, new ArrayList<>());
            }
            ansMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(ansMap.values());
    }
}
