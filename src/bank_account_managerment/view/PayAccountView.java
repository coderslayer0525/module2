package bank_account_managerment.view;

import bank_account_managerment.entity.CreditAccount;
import bank_account_managerment.entity.PayAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class PayAccountView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<PayAccount> payAccountArrayList){
        if (payAccountArrayList.isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        for (PayAccount payAccount : payAccountArrayList){
            System.out.println(payAccount);
        }
    }
    public static PayAccount inputData(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input IdCard:");
            int idCard = Integer.parseInt(sc.nextLine());

            System.out.println(" Input User's Name:");
            String user = sc.nextLine();

            System.out.println("Input balance :");
            int balance = Integer.parseInt(sc.nextLine());

            System.out.println("Daily transfer limit");
            int dailyTransfer = Integer.parseInt(sc.nextLine());

            return new PayAccount(idCard, user , balance, dailyTransfer);

        }catch (NumberFormatException e) {
            return null;
        }
    }
}
