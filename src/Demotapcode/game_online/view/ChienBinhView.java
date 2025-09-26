package Demotapcode.game_online.view;

import Demotapcode.game_online.entity.ChienBinh;

import java.util.List;
import java.util.Scanner;

public class ChienBinhView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(List<ChienBinh> chienBinhList) {
        if (chienBinhList.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }
        for (ChienBinh chienBinh : chienBinhList) {
            System.out.println(chienBinh);
        }
    }

    public static ChienBinh inputData() {
        try {
            System.out.println(" ID Nhan Vat :");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(" Ten Nhan Vat :");
            String name = sc.nextLine();

            System.out.println(" Lever Nhan Vat :");
            int lever = Integer.parseInt(sc.nextLine());

            System.out.println(" Diem mau Nhan Vat :");
            int healing = Integer.parseInt(sc.nextLine());

            System.out.println(" Suc manh can chien :");
            int dame = Integer.parseInt(sc.nextLine());

            return new ChienBinh(id,name,lever,healing,dame);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
