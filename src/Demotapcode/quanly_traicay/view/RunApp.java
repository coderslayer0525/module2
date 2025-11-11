package Demotapcode.quanly_traicay.view;

import Demotapcode.quanly_traicay.controller.DuaHauController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
        displayMain();


    }
    public static void displayMain(){
        DuaHauController duaHauController = new DuaHauController();

        Scanner sc = new Scanner(System.in);
        final  int DUAHAU = 1;
        final int EXIT = 2;
        boolean drag = true;
        while (drag){
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "=== CODEGYMFARM ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Menu option's fruit:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DUAHAU, "Quản Lý Dưa Hấu");
            System.out.printf("| %-3d | %-20s |%n", EXIT, "Thoát app");
            System.out.println("=====================================");
            System.out.print(" Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case DUAHAU :
                    System.out.println("Quan Ly Dua Hau");
                    duaHauController.displayMenu();
                    break;
                case EXIT:
                    System.out.println("Dang Thoat app");
                default:
                    drag= false;
            }
        }
    }
}
