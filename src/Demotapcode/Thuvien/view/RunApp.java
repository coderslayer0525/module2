package Demotapcode.Thuvien.view;

import Demotapcode.Thuvien.controller.LuanVanController;
import Demotapcode.Thuvien.controller.SachController;
import Demotapcode.Thuvien.controller.TapChiController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void displayMain(){
        TapChiController tapChiController = new TapChiController();
        SachController sachController = new SachController();
        LuanVanController luanVanController = new LuanVanController();

        Scanner scanner = new Scanner(System.in);

        final int SACH = 1;
        final  int TAPCHI = 2;
        final int LUANVAN = 3;
        final int EXIT_PROCESS = 4;
        boolean flag = true;
        while (flag){
            System.out.println("Quan Ly Thu Vien");
            System.out.println("---Chon Khu Vuc Quan ly : "+
                    "\n 1. THu Vien Sach" +
                    "\n 2. Thu Vien Tap Chi" +
                    "\n 3. THu Vien Luan Van" +
                    "\n 4. Thoat Chuong Trinh");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Thu Vien Sach");
                    sachController.displayMenu();
                    break;
                case 2:
                    System.out.println("Thu vIen Tap Chi");
                    tapChiController.displayMenu();
                    break;
                case 3:
                    System.out.println("Thu vien Luan Van");
                    luanVanController.displayMenu();
                    break;
                case 4:
                    System.out.println("Thoat");
                default:
                    flag= false;
            }
        }

    }
}
