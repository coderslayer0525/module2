package Demotapcode.quanly_traicay.view;


import Demotapcode.quanly_traicay.entity.DuaHau;

import java.util.List;
import java.util.Scanner;

public class DuaHauView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<DuaHau> duaHauList) {
        if (duaHauList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        for (DuaHau duaHau : duaHauList) {
            System.out.println(duaHau);
        }
    }

    public static DuaHau inputData() {
        try {
            System.out.println("Ten Trai Cay");
            String tenTraiCay = sc.nextLine();

            System.out.println("Loai Trai Cay");
            String loaiTraiCay = sc.nextLine();

            System.out.println("Ngay San xuat");
            int nsx = Integer.parseInt(sc.nextLine());

            System.out.println("Han Su Dung");
            int hsd = Integer.parseInt(sc.nextLine());

            System.out.println("xuat xu");
            String xuatXu = sc.nextLine();

            System.out.println("gia thanh");
            int giaTien = Integer.parseInt(sc.nextLine());

            System.out.println("Do ngot");
            int doNgot = Integer.parseInt(sc.nextLine());

            return new DuaHau(tenTraiCay, loaiTraiCay, nsx, hsd, xuatXu, giaTien, doNgot);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
