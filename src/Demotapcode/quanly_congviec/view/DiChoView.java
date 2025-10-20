package Demotapcode.quanly_congviec.view;

import Demotapcode.quanly_congviec.entity.DiCho;
import Demotapcode.quanly_traicay.entity.DuaHau;


import java.util.List;
import java.util.Scanner;

public class DiChoView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<DiCho> diChoList) {
        if (diChoList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        for (DiCho diCho : diChoList) {
            System.out.println(diCho);
        }
    }
    public static DiCho inputData() {
        try {
            System.out.println("ma chi tieu");
            int maChiTieu = Integer.parseInt(sc.nextLine());

            System.out.println("ten chi tieu");
            String tenChiTieu= sc.nextLine();

            System.out.println("Ngay chi");
            int ngayChi = Integer.parseInt(sc.nextLine());

            System.out.println("so tien");
            int soTienChi = Integer.parseInt(sc.nextLine());

            System.out.println("mo ta");
            String moTa = sc.nextLine();

            System.out.println("hinh Thuc Chi");
            boolean chuyenKhoan = sc.nextBoolean();

            return new DiCho(maChiTieu,tenChiTieu,ngayChi,soTienChi,moTa,chuyenKhoan);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
