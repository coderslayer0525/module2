package Demotapcode.quanly_congviec.view;

import Demotapcode.quanly_congviec.controller.DiSieuThiController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void displayMain(){
        DiSieuThiController diSieuThiController = new DiSieuThiController();
        Scanner sc = new Scanner(System.in);

        final int DICHO = 1;
        final int DISIEUTHI = 2;
        final int EXIT = 3;
        boolean flag = true;
        while (flag){
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "=== QUAN LY CHI TIEU ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Menu option:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", 1, " DI CHO");
            System.out.printf("| %-3d | %-20s |%n", 2, " DI SIEUTHI");
            System.out.printf("| %-3d | %-20s |%n", 3, " Thoát app");
            System.out.println("=====================================");
            System.out.print(" Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    System.out.println("Chi Tieu Di cho");
                    break;
                case 2:
                    System.out.println("Chi Tieu Di Sieu Thi");
                    diSieuThiController.displayMenu();
                    break;
                case 3:
                    System.out.println("dang Thoat App");
                default:
                    flag = false;
            }
        }
    }
}
