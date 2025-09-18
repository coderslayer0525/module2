package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        final double OKX = 0.000038;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền VND: ");

        double vnd = sc.nextDouble();
        double usd = vnd * OKX;

        System.out.println("sau khi đổi  ra  usd : " + usd);
    }
}
