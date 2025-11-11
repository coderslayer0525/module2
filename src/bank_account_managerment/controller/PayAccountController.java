package bank_account_managerment.controller;

import bank_account_managerment.entity.CreditAccount;
import bank_account_managerment.entity.PayAccount;
import bank_account_managerment.service.IPayAccountService;
import bank_account_managerment.service.PayAccountService;
import bank_account_managerment.view.CreditAccountView;
import bank_account_managerment.view.PayAccountView;

import java.util.ArrayList;
import java.util.Scanner;

public class PayAccountController {
    private final IPayAccountService payAccountService = new PayAccountService();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        final int ADD_NEWACC = 1;
        final int DISPLAY_KINDOFACC = 2;
        final int DEL_ACC = 3;
        final int FIND_ACC = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("===BANK'S ACCOUNT MANAGERMENT===");
            System.out.println("---OPTION---" +
                    "\n 1. Add new account." +
                    "\n 2. Account's list." +
                    "\n 3. Delete account." +
                    "\n 4. Find User." +
                    "\n 5. Back to main menu.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ADD_NEWACC:
                    System.out.println("New User");
                    PayAccount payAccount = PayAccountView.inputData();
                    boolean ok = this.payAccountService.add(payAccount);
                    if (ok) {
                        System.out.println("SUCCESS.");
                    } else {
                        System.out.println("EROR!");
                    }
                    break;
                case DISPLAY_KINDOFACC:
                    System.out.println("User Database.");

                    ArrayList<PayAccount> payAccountArrayList = this.payAccountService.findAll();
                    PayAccountView.display(payAccountArrayList);
                    break;
                case DEL_ACC:
                    System.out.println("Delete User.");
                    PayAccount pac = PayAccountView.inputData();
                    boolean not = this.payAccountService.delete(pac.getIdCard());
                    if (not) {
                        System.out.println(" Deleted.");
                    } else {
                        System.out.println("Try Again !");
                    }
                    break;
                case FIND_ACC:
                    System.out.println("Find User.");
                    System.out.println("Input Name :");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    PayAccount find = payAccountService.findByName(name);
                    if (find != null) {
                        System.out.println("User :" + find);
                    } else {
                        System.out.println("Not Found.");
                    }
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
                    System.out.println("Choice Unvailbe! Please try again!!");
            }
        }
    }

}
