package Demotapcode.Thuvien.view;

import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class SachView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<Sach> sachArrayList) {
        if (sachArrayList.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }
        for (Sach sach : sachArrayList) {
            System.out.println(sach);
        }
    }

    public static Sach inputData() {
        try {
            System.out.println("Ma Tai Lieu");
            int MaTaiLieu = Integer.parseInt(scanner.nextLine());

            System.out.println("Ten Tai Lieu");
            String tenTaiLieu = scanner.nextLine();

            System.out.println("Nam Xuat Ban");
            int namXuatBan = Integer.parseInt(scanner.nextLine());

            System.out.println("Ten Tac Gia");
            String TenTacGia = scanner.nextLine();

            System.out.println("So Trang");
            int soTrang = Integer.parseInt(scanner.nextLine());

            System.out.println("The Loai");
            String theLoai = scanner.nextLine();


            return new Sach(MaTaiLieu, tenTaiLieu, namXuatBan, TenTacGia, soTrang, theLoai);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
