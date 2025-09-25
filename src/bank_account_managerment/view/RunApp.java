package bank_account_managerment.view;

import bank_account_managerment.controller.CreditAccountController;

import java.util.Scanner;

public class RunApp {
    public static void  main(String[] args){
      displayMain();


    }
    public static void displayMain(){
        CreditAccountController creditAccountController = new CreditAccountController();

        Scanner scanner = new Scanner(System.in);
        final int CREDIT = 1;
        final int EXIT = 2;
        boolean flag = true;
        while (flag){
            System.out.println("===GIANGHIEM'BANK MANAGER===");
            System.out.println("=OPTION=" +
                    "\n 1. Credit Accout." +
                    "\n 2. EXIT.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case CREDIT :
                    System.out.println("CreditACC");
                    creditAccountController.displayMenu();
                    break;
                case EXIT:
                    System.out.println("EXIT");
                default:
                    flag = false;

            }
        }
    }
}
