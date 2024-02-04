package easy;

import java.util.HashSet;
import java.util.Scanner;

public class Solytion771 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String jewels = scanner.nextLine();
        String stones = scanner.nextLine();
        int ans = numJewelsInStones(jewels, stones);
        System.out.println(ans);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashSet<Character> check = new HashSet<>();
        for (char ch1: jewels.toCharArray()){
            check.add(ch1);
        }
        for (char ch2: stones.toCharArray()){
            if(check.contains(ch2)){
                ans++;
            }
        }
        return ans;
    }

//    public int numJewelsInStones(String jewels, String stones) {
//        char[] jew = jewels.toCharArray();
//        char[] st = stones.toCharArray();
//        int ans = 0;
//        for (char ch1: jew){
//            for(char ch2: st){
//                if(ch1 == ch2){
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }

}
