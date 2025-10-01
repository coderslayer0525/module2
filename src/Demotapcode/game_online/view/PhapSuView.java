package Demotapcode.game_online.view;



import Demotapcode.game_online.entity.PhapSu;

import java.util.List;
import java.util.Scanner;

public class PhapSuView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(List<PhapSu> phapSuList) {
        if (phapSuList.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }
        for ( PhapSu phapSu : phapSuList) {
            System.out.println(phapSu);
        }
    }

    public static PhapSu inputData() {
        try {
            System.out.println(" ID Nhan Vat :");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(" Ten Nhan Vat :");
            String name = sc.nextLine();

            System.out.println(" Lever Nhan Vat :");
            int lever = Integer.parseInt(sc.nextLine());

            System.out.println(" Diem mau Nhan Vat :");
            int healing = Integer.parseInt(sc.nextLine());

            System.out.println(" Loai Phep Chinh");
            String skill = sc.nextLine();

           return new PhapSu(id, name, lever,healing,skill);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}

