package cs_shop_moblie.view;

import cs_shop_moblie.controller.DienThoaicontroller;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
disPlayMenu();
    }
    public static  void disPlayMenu(){
        DienThoaicontroller dienThoaicontroller = new DienThoaicontroller();
        Scanner sc = new Scanner(System.in);

        final  int MOBI = 1;
        final int EXIT = 2;
        boolean flag = true;
        while (flag){
            System.out.println("=== QUAN LY TONG  ====");
            System.out.println(" Chon Loai SP quan ly" +
                    "\n 1. TELEPHONE" +
                    "\n 2. EXIT PROGRAM");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case MOBI:
                    System.out.println("TELEPHONe");
                    dienThoaicontroller.displayMenu();
                    break;
                case EXIT:
                    System.out.println("EXITed");
                default:
                    flag = false;
            }

        }
    }
}