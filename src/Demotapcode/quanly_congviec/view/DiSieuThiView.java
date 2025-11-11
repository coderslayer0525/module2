package Demotapcode.quanly_congviec.view;

import Demotapcode.quanly_congviec.entity.DiSieuThi;

import java.util.List;
import java.util.Scanner;

public class DiSieuThiView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<DiSieuThi> diSieuThiList) {
        if (diSieuThiList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        for (DiSieuThi diSieuThi : diSieuThiList) {
            System.out.println(diSieuThi);
        }
    }
    public static DiSieuThi inputData() {
        try {
            System.out.println("ma chi tieu");
            int maChiTieu = Integer.parseInt(sc.nextLine());

            System.out.println("ten chi tieu");
            String tenChiTieu;
            while (true){
                System.out.println("Nhap chi tieu:(Khoang Trang va viet hoa chu dau");
                tenChiTieu=sc.nextLine().trim();
                if (!tenChiTieu.matches("^[A-Za-z0-9\\- ]{2,50}$")){
                    System.out.println("Khong hop le :(vi du: Mua Hanh");
                }else {
                    break;
                }
            }


            System.out.println("Ngay chi");
            int ngayChi;
            while (true){
                System.out.println("ngay chi phai bat dau sau ngay 5");
                ngayChi =Integer.parseInt(sc.nextLine());
                if (ngayChi > 5){
                    System.out.println("hop le");
                    break;
                }else {
                    System.out.println("ngay chi bat dau tu ngay 5-> 31");
                }
            }

            System.out.println("so tien");
            int soTienChi;
            while (true){
                System.out.println("So tien Chi khong duoc nhieu hon 300k");
                soTienChi=Integer.parseInt(sc.nextLine());
                if (soTienChi<300){
                    System.out.println("so tien hop le");
                    break;
                }else {
                    System.out.println("vui long giam chi phi");
                }
            }

            System.out.println("mo ta");
            String moTa = sc.nextLine();

            System.out.println("Chuyen khoan ?");
            String nhap = sc.nextLine().trim().toLowerCase();
            boolean chuyenKhoan = nhap.equals("co");

            return new DiSieuThi(maChiTieu,tenChiTieu,ngayChi,soTienChi,moTa,chuyenKhoan);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
