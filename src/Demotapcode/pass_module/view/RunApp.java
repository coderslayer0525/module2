package Demotapcode.pass_module.view;

import Demotapcode.pass_module.controller.DanhBaController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {

        displayMain();

    }
    public static void displayMain(){
        DanhBaController danhBaController = new DanhBaController();

        Scanner sc = new Scanner(System.in);
        final int LIST= 1;
        final int OUT = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("======================================");
            System.out.println("=             DANH BA QUAN LY        =");
            System.out.println("=                                    =");
            System.out.println("=              <GNPMCY>              =");
            System.out.println("======================================");
            System.out.println(" " +
                    "\n 1. Quan ly Chuc nang" +
                    "\n 2. thoat");


            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case LIST:
                    System.out.println(" option");
                    danhBaController.displayMenu();
                    break;
                case OUT:
                    System.out.println("Exited");
                default:
                    flag = false;
            }
        }
    }
}

