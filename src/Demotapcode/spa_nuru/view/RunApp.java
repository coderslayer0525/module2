package Demotapcode.spa_nuru.view;

import Demotapcode.spa_nuru.controller.DepController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        DepController depController = new DepController();

        Scanner scanner = new Scanner(System.in);
        final int MYNHAN = 1;
        final int EXIT = 2;
        boolean drag = true;
        while (drag) {
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "===TAY THI'SAUNA ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "  lưa chọn :");
            System.out.printf("| %-3s | %-20s |%n", "STT", "");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", MYNHAN, "Quản lý nhân su :");
            System.out.printf("| %-3d | %-20s |%n", EXIT, "Thoát app");
            System.out.println("=====================================");
            System.out.print(" Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case MYNHAN:
                    System.out.println(" Nhân sự controller : ");
                    depController.displayMenu();
                    break;
                case EXIT:
                    System.out.println("Thoát");
                default:
                    drag = false;
            }
        }
    }
}
