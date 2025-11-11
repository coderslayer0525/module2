package Demotapcode.zoo_tycoons.view;

import Demotapcode.zoo_tycoons.controller.ChimController;
import Demotapcode.zoo_tycoons.controller.ThuAnCoController;
import Demotapcode.zoo_tycoons.controller.ThuAnThitController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {

        displayMain();
    }
    public  static void displayMain(){
        ChimController chimController = new ChimController();
        ThuAnCoController thuAnCoController = new ThuAnCoController();

        ThuAnThitController thuAnThitController = new ThuAnThitController();

        Scanner scanner = new Scanner(System.in);

        final int CHIM = 1;
        final int THUANCO = 2;
        final int THUANTHIT = 3;
        final  int EXIT = 4;
        boolean drag = true;
        while (drag){
            System.out.println("ZOO TYCOONS");
            System.out.println("CHON LOAI VAT :" +
                    "\n 1. Chim." +
                    "\n 2. Thu An co" +
                    "\n 3. Thu AN Thit" +
                    "\n 4. Exit.");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1 :
                    System.out.println(" QUan Ly Chim");
                    chimController.displayMenu();
                    break;
                case 2:
                    System.out.println("Quan Ly Thu an co");
                    thuAnCoController.displayMenu();
                    break;
                case  3:
                    System.out.println("QuanlyThuAnThit");
                    thuAnThitController.displayMenu();
                    break;
                case  4:
                    System.out.println("Thoat app");
                default:
                    drag = false;
            }
        }
    }
}
