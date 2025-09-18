package ss3_mang.bai_tap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows :  ");
        int row = sc.nextInt();
        System.out.print("Colum : ");
        int colum = sc.nextInt();
        if (row != colum) {
            System.out.print("ma tran méo");
            return;
        }
        double[][] matran = new double[row][colum];
        System.out.print("nhap tung so cua ma tran");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(" " + i + " " + j + " ");
                matran[i][j] = sc.nextDouble();
            }
            double sumMaTran = 0;
            for (int j = 0; j < colum; j++) {
                sumMaTran += matran[j][j];
            }
            System.out.print("ket qua : " + sumMaTran);
        }

    }

}
