package ss3_mang.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" nhập phàn tu");
            arr[i] = sc.nextInt();
        }
        System.out.println("phan tu muon them");
        int x = sc.nextInt();
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = x;
        for (int i = 0; i < n + 1; i++) {
            System.out.println(newArr[i]+ " ");
        }
    }
}
