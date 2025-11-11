package ss2_loop.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:(phải < 20): ");
        int number = input.nextInt();
        int n = 2;
        int s = 0;
        while (s < number) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);
                s++;
            }
            n++;
        }
    }
}
