package bank_account_managerment.view;

import bank_account_managerment.entity.CreditAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditAccountView {
    private static Scanner scanner= new Scanner(System.in);

    public static void display(ArrayList<CreditAccount> creditAccountArrayList){
        if (creditAccountArrayList.isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        for (CreditAccount creditAccount : creditAccountArrayList){
            System.out.println(creditAccount);
        }
    }
    public static CreditAccount inputData(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input IdCard:");
            int idCard = Integer.parseInt(sc.nextLine());

            System.out.println(" Input User's Name:");
            String user = sc.nextLine();

            System.out.println("Input balance :");
            int balance = Integer.parseInt(sc.nextLine());

            System.out.println("Input Loan Limit");
            int loanLimit = Integer.parseInt(sc.nextLine());

            System.out.println("Input Outstanding Balance :");
            int outstandingBalance = Integer.parseInt(sc.nextLine());
            return new CreditAccount(idCard, user , balance,loanLimit , outstandingBalance);

        }catch (NumberFormatException e) {
            return null;
        }
    }
}
