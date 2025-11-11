package Demotapcode.kiemtra_songuyento;


import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = scanner.nextInt();

        Stack<Integer> stack = PrimeList.getPrimeStack(n);
        Queue<Integer> queue = PrimeList.getPrimeQueue(n);
        System.out.println("so nguyen to(stack)" + stack);
        System.out.println("so nguyen to(queue)" + queue);
    }
}
