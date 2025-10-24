package Demotapcode.quanly_congviec.view;

import Demotapcode.quanly_congviec.controller.DiChoController;
import Demotapcode.quanly_congviec.controller.DiSieuThiController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void displayMain(){
        DiChoController diChoController = new DiChoController();
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
            System.out.printf("| %-3d | %-20s |%n", DICHO, " DI CHO");
            System.out.printf("| %-3d | %-20s |%n", DISIEUTHI, " DI SIEUTHI");
            System.out.printf("| %-3d | %-20s |%n", EXIT, "Thoát app");
            System.out.println("=====================================");
            System.out.print(" Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case DICHO :
                    System.out.println("Chi Tieu Di cho");
                    diChoController.displayMenu();
                    break;
                case DISIEUTHI:
                    System.out.println("Chi Tieu Di Sieu Thi");
                    diSieuThiController.displayMenu();
                    break;
                case EXIT:
                    System.out.println("dang Thoat App");
                default:
                    flag = false;
            }
        }
    }
}
