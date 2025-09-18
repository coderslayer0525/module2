package ss3_mang.bai_tap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        String str = "khi  nào may áo giáp sắt, nhớ sang phố Huế cửa Á hàng phi âu";
        Scanner sc = new Scanner(System.in);
        System.out.print("ký tự muốn đếm : ");
        char kyTu = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Ký tự '" + kyTu + "' xuất hiện " + count + " trong đoạn văn.");
    }
}