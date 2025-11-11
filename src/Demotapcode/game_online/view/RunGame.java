package Demotapcode.game_online.view;


import Demotapcode.game_online.controller.ChienBinhController;
import Demotapcode.game_online.controller.PhapSuController;
import Demotapcode.game_online.controller.XaThuController;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        displayMain();
    }

        public static void displayMain () {
            ChienBinhController chienBinhController = new ChienBinhController();
            PhapSuController phapSuController = new PhapSuController();
            XaThuController xaThuController = new XaThuController();

            Scanner sc = new Scanner(System.in);

            final int CHIENBINH = 1;
            final int PHAPSU = 2;
            final int XATHU = 3;
            final int EXIT_PROCESS = 4;
            boolean flag = true;
            while (flag) {
                System.out.println("======================================");
                System.out.println("=      GIA NGHIEM ENTERTAINMENT      =");
                System.out.println("=       -CHọn lớp Nhân Vật-          =");
                System.out.println("=            <GNGAMING>              =");
                System.out.println("======================================");
                System.out.println(" " +
                        "\n 1. Lớp Chiến Binh." +
                        "\n 2. Lớp Pháp Sư." +
                        "\n 3. Lớp Xạ Thủ." +
                        "\n 4. Thoát Chương trình");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case CHIENBINH:
                        System.out.println("Quản lý Chiến Binh. ");
                        chienBinhController.displayMenu();
                        break;
                    case PHAPSU:
                        System.out.println(" Quản lý Pháp Sư.");
                        phapSuController.displayMenu();
                        break;
                    case XATHU:
                        System.out.println(" Quản lý Xạ Thủ. ");
                        xaThuController.displayMenu();
                        break;
                    case EXIT_PROCESS:
                        System.out.println("Exited");
                    default:
                        flag = false;
                }
            }
        }
    }
