package stack.medium;

import java.util.Stack;

public class Solution155 {

    private Stack<Integer> stack;
    private Stack<Integer> cash;
    public Solution155() {
        stack = new Stack<>();
        cash = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        val = Math.min(val, cash.isEmpty() ? val : cash.peek());
        cash.push(val);
    }

    public void pop() {
        stack.pop();
        cash.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return cash.peek();
    }

//        private Stack<Integer> stack;
//        private Stack<Integer> cash;
//        private int min;
//
//        public Solution155() {
//            stack = new Stack<>();
//            cash = new Stack<>();
//            min = Integer.MAX_VALUE;
//
//        }
//
//        public void push(int val) {
//            stack.push(val);
//            min = Math.min(min, val);
//            cash.push(min);
//        }
//
//        public void pop() {
//            stack.pop();
//            cash.pop();
//            min = cash.isEmpty() ? Integer.MAX_VALUE : cash.peek();
//        }
//
//        public int top() {
//            return stack.peek();
//        }
//
//        public int getMin() {
//            return cash.peek();
//        }

    public static void main(String[] args) {
        Solution155 minStack = new Solution155();

        minStack.push(5);
        minStack.push(7);
        minStack.push(2);
        minStack.push(8);

        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());

        minStack.pop();

        System.out.println("After popping, top element: " + minStack.top());
        System.out.println("After popping, minimum element: " + minStack.getMin());
    }
}