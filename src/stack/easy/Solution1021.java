package stack.easy;

import java.util.Stack;

public class Solution1021 {
    public static void main(String[] args){
        String s = "(()())((()()))";
        System.out.println(removeOuterParentheses(s));
        System.out.println(removeOuterParentheses2(s));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                if (stack.size() > 0){
                    ans.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }else {
                stack.pop();
                if (stack.size() > 0){
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }

    public static String removeOuterParentheses2(String s) {
        StringBuilder ans = new StringBuilder();
        int opened = 0;
        for (char ch: s.toCharArray()){
            if (ch == '(' && opened++ > 0){
                ans.append(ch);
            }
            else if (ch == ')' && opened-- > 1){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
