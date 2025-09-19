package Demotapcode.zoo_tycoons.view;

import Demotapcode.zoo_tycoons.controller.ChimController;
import Demotapcode.zoo_tycoons.controller.ThuAnCoController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {

        displayMain();
    }
    public  static void displayMain(){
        ChimController chimController = new ChimController();
        ThuAnCoController thuAnCoController = new ThuAnCoController();

        Scanner scanner = new Scanner(System.in);

        final int CHIM = 1;
        final int THUANCO = 2;
        final  int EXIT = 3;
        boolean drag = true;
        while (drag){
            System.out.println("ZOO TYCOONS");
            System.out.println("CHON LOAI VAT :" +
                    "\n 1. Chim." +
                    "\n 2. Thu An co" +
                    "\n 3. Thoat.");
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
                    System.out.println("Thoat.");
                default:
                    drag = false;
            }
        }
    }
}
