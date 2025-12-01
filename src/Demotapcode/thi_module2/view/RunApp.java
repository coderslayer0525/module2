package Demotapcode.thi_module2.view;

import Demotapcode.thi_module2.controller.KhachVietNamController;


import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        displayMenu();

    }

    public static void displayMenu() {
        KhachVietNamController khachVietNamController = new KhachVietNamController();

        Scanner scanner = new Scanner(System.in);
        final int DIS_CUS = 1;
        final int ADD_CUS = 2;
        final int FND_CUS = 3;
        final int ADD_BILL = 4;
        final int UPD_BILL = 5;
        final int DIS_BILL = 6;
        final int EXIT = 7;
        boolean flag = true;
        while (flag) {
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Quan Ly khach su dung Dien===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "  lưa chọn :");
            System.out.printf("| %-3s | %-20s |%n", "STT", "");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DIS_CUS, "Danh Sach Khach hang :");
            System.out.printf("| %-3d | %-20s |%n", ADD_CUS, "them khach hang :");
            System.out.printf("| %-3d | %-20s |%n", FND_CUS, "TIm Khach hang :");
            System.out.printf("| %-3d | %-20s |%n", ADD_BILL, "Them Hoa don:");
            System.out.printf("| %-3d | %-20s |%n", UPD_BILL, "Sua Bill :");
            System.out.printf("| %-3d | %-20s |%n", DIS_BILL, "Danh sach bill :");
            System.out.printf("| %-3d | %-20s |%n", EXIT, "Thoát app");
            System.out.println("=====================================");
            System.out.print(" Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DIS_CUS:
                    System.out.println("Hien thi thong tin khach hang");

                    break;
                case ADD_CUS:
                    System.out.println("Thêm :");
                    System.out.println("1 .Khách Tây.");
                    System.out.println("2 .Khách Việt Nam.");
                    int miniChoice = Integer.parseInt(scanner.nextLine());
                    if (miniChoice == 1) {
                        System.out.println(" khach tay");

                    } else if (miniChoice == 2) {
                        System.out.println("Khach Viet Nam");
                        khachVietNamController.displayMenu();

                        break;
                    } else {
                        System.out.println(" lua chon khong hop le, vui long thu lai");
                    }
                    break;
                case FND_CUS:
                    System.out.println(" Tim khach hang troong he thong");
                    break;
                case ADD_BILL:
                    System.out.println("Them bill dien");
                    break;
                case UPD_BILL:
                    System.out.println("them bill moi");
                    break;
                case DIS_BILL:
                    System.out.println("hIEN THI LAI danh sach list bill trong he thon");
                    break;
                case EXIT:
                    System.out.println(" thoát");
                default:

                    flag = false;
            }
        }
    }
}
