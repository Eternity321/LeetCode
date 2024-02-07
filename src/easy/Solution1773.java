package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1773 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ruleKey = scanner.next();
        String ruleValue = scanner.next();
        int size = scanner.nextInt();
        List<List<String>> items = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<String> valuesItems = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                valuesItems.add(scanner.next());
            }
            items.add(valuesItems);
        }
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int index;
        switch (ruleKey){
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            default:
                index = 2;
                break;
        }
        for (int i = 0; i < items.size(); i++){
               if(items.get(i).get(index).equals(ruleValue))ans++;
            }
        return ans;
    }
}
