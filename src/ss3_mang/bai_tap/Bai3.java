package ss3_mang.bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("số lượng phần tử mảng 1 :");
        int m1 =sc.nextInt();
        int[] arr1 = new int[m1];
        for(int i = 0; i < m1; i++){
            System.out.println("nhap mảng 1" + i +":");
            arr1[i] = sc.nextInt();
        }
        System.out.println("nhập mảng 2 :");
        int m2 = sc.nextInt();
        int [] arr2 = new int[m2];
        for(int i = 0; i < m2; i++){
            System.out.println("nhập mảng 2 "+ i + ":");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[m1+m2];
        for(int i = 0; i < m1; i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < m2; i++){
            arr3[m1+i] = arr2[i];
        }
        System.out.println("mảng sau khi gôộp :");
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i] + " ");
        }
    }
}
