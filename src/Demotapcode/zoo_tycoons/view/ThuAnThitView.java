package Demotapcode.zoo_tycoons.view;

import Demotapcode.zoo_tycoons.entity.ThuAnThit;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuAnThitView {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMenu(ArrayList<ThuAnThit> thuAnThitArrayList) {
        if (thuAnThitArrayList.isEmpty()) {
            System.out.println("Khong co con THu nao o day");
            return;
        }
        for (ThuAnThit thuAnThit : thuAnThitArrayList) {
            System.out.println(thuAnThit);

        }
    }

    public static ThuAnThit inputData() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("= MA SO =");
            int maSo = Integer.parseInt(scanner.nextLine());

            System.out.println("= TEN THU AN THIT");
            String name = scanner.nextLine();

            System.out.println("=NAM SINH=");
            int namSinh = Integer.parseInt(scanner.nextLine());

            System.out.println("CHUONG NUOI");
            int chuongNuoi = Integer.parseInt(scanner.nextLine());

            System.out.println(" THICH AN GI ");
            String moinUaThich = scanner.nextLine();

            return new ThuAnThit(maSo, name, namSinh, chuongNuoi, moinUaThich);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void display(ArrayList<ThuAnThit> thuAnThitArrayList) {

    }
}
