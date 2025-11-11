package Demotapcode.kiemtra_songuyento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrimeList {
    public static Stack<Integer> getPrimeStack(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 2; i < n; i++) {
            if (PrimeCheck.isPrime(i)) stack.push(i);
        }
        return stack;
    }

    public static Queue<Integer> getPrimeQueue(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 2; i < n; i++) {
            if (PrimeCheck.isPrime(i)) queue.add(i);
        }
        return queue;
    }
}