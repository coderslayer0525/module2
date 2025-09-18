package ss2_loop.bai_tap;


public class Bai3 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("số nguyên tố :");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i +",");
            }
        }
    }
}