package bank_account_managerment.view;

import bank_account_managerment.entity.CreditAccount;
import bank_account_managerment.entity.SavingMoneyAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingMoneyView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<SavingMoneyAccount> savingMoneyAccountArrayList) {
        if (savingMoneyAccountArrayList.isEmpty()) {
            System.out.println("EMPTY");
            return;
        }
        for (SavingMoneyAccount savingMoneyAccount : savingMoneyAccountArrayList) {
            System.out.println(savingMoneyAccount);
        }
    }

    public static SavingMoneyAccount inputData() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input IdCard:");
            int idCard = Integer.parseInt(sc.nextLine());

            System.out.println(" Input User's Name:");
            String user = sc.nextLine();

            System.out.println("Input balance :");
            int balance = Integer.parseInt(sc.nextLine());

            System.out.println("Input Time Deposit:");
            int timeDeposit = Integer.parseInt(sc.nextLine());

            System.out.println("Input Interest Rate :");
            int interestRate = Integer.parseInt(sc.nextLine());
            return new SavingMoneyAccount(idCard, user, balance, timeDeposit, interestRate);

        } catch (NumberFormatException e) {
            return null;
        }
    }
}
