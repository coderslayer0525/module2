package bank_account_managerment.view;

import bank_account_managerment.controller.CreditAccountController;
import bank_account_managerment.controller.PayAccountController;
import bank_account_managerment.controller.SavingMoneyController;

import java.util.Scanner;

public class RunApp {
    public static void  main(String[] args){
      displayMain();


    }
    public static void displayMain(){
        CreditAccountController creditAccountController = new CreditAccountController();
        PayAccountController payAccountController = new PayAccountController();
        SavingMoneyController savingMoneyController = new SavingMoneyController();

        Scanner scanner = new Scanner(System.in);
        final int CREDIT = 1;
        final int PAY = 2;
        final int SAV = 3;
        final int EXIT = 4;
        boolean flag = true;
        while (flag){
            System.out.println("===GIANGHIEM'BANK MANAGER===");
            System.out.println("=OPTION=" +
                    "\n 1. Credit Account." +
                    "\n 2. Pay Account" +
                    "\n 3. Saving money Acount" +
                    "\n 4. EXIT.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case CREDIT :
                    System.out.println("CreditACC");
                    creditAccountController.displayMenu();
                    break;
                case PAY:
                    System.out.println("PayACC");
                    payAccountController.displayMenu();
                case SAV:
                    System.out.println("SAVACC");
                    savingMoneyController.displayMenu();
                case EXIT:
                    System.out.println("EXIT");
                default:
                    flag = false;

            }
        }
    }
}
