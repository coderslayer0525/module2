package ss11_jfc.bai_tap.bai_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba".toLowerCase();


        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean newPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                newPalindrome = false;
                break;
            }
        }
        if (newPalindrome) {
            System.out.println(" Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
