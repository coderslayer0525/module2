package ss3_mang.bai_tap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số dòng: ");
        int cot = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int dong = sc.nextInt();


        int[][] arr = new int[cot][dong];


        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < dong; j++) {
                System.out.print("Nhập arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Nhập chỉ số cột cần tính tổng (từ 0 đến " + (dong - 1) + "): ");
        int viTri = sc.nextInt();

        if (viTri < 0 || viTri >= dong) {
            System.out.println("Chỉ số cột không hợp lệ!");
        } else {
            int sum = 0;
            for (int i = 0; i < cot; i++) {
                sum += arr[i][viTri];
            }
            System.out.println("Tổng các phần tử ở cột " + viTri + " là: " + sum);
        }
    }
}