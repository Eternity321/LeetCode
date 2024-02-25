package other;

import java.util.Scanner;

public class Solution1108 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }
    public static String defangIPaddr(String address) {
        return address.replace("." , "[.]");
    }
}
