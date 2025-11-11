package ss3_mang.bai_tap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("phan tu muon xoa");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Mang sau khi xoa phan tu:" + x + ":");
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
