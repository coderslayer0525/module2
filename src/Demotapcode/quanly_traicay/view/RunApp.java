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
            System.out.println("===================");
            System.out.println("=== CODEGYMFARM ===");
            System.out.println("===================");
            System.out.println("Menu option's fruils" +
                    "\n 1. Dua Hau." +
                    "\n 2. Thoat app.");
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
