package Demotapcode.thi_module2.view;



import Demotapcode.thi_module2.entity.KhachVietNam;
import Demotapcode.thi_module2.exception.DienLucException;

import java.util.List;
import java.util.Scanner;

public class KhachVietNamView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<KhachVietNam> khachVietNamList) {
        if (khachVietNamList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        System.out.println("┌─────────++─────────┐");
        System.out.println("│    KH VIET NAM     │");
        System.out.println("└─────────++─────────┘");

        for (KhachVietNam khachVietNam : khachVietNamList) {
            System.out.println(khachVietNam);
        }
    }

    public static KhachVietNam inputData() {
        try {
            System.out.println(" ten KHVN");
            String nhap = sc.nextLine();

            System.out.println("ma khach hang");
            int maKhachHang = Integer.parseInt(sc.nextLine());

            System.out.println("Loai KHVN(Kinh doanh, Sinh hoat,, ");
            String loaiKhvn = sc.nextLine();

            System.out.println("Dinh muc tieu thu.");
            int dinhMucTieuThu = Integer.parseInt(sc.nextLine());

            return new KhachVietNam(nhap, maKhachHang, loaiKhvn, dinhMucTieuThu);
        } catch (DienLucException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}

