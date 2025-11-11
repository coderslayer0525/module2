package Demotapcode.game_online.view;

import Demotapcode.game_online.entity.PhapSu;
import Demotapcode.game_online.entity.XaThu;

import java.util.List;
import java.util.Scanner;

public class XaThuView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(List<XaThu> xaThuList) {
        if (xaThuList.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }
        for ( XaThu xaThu : xaThuList) {
            System.out.println(xaThu);
        }
    }

    public static XaThu inputData() {
        try {
            System.out.println(" ID Nhan Vat :");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(" Ten Nhan Vat :");
            String name = sc.nextLine();

            System.out.println(" Lever Nhan Vat :");
            int lever = Integer.parseInt(sc.nextLine());

            System.out.println(" Diem mau Nhan Vat :");
            int healing = Integer.parseInt(sc.nextLine());

            System.out.println(" Tam ban");
           int rangeShot = Integer.parseInt(sc.nextLine());

            return new XaThu(id,name,lever,healing,rangeShot);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
