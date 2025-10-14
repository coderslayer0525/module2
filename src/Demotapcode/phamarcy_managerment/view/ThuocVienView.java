package Demotapcode.phamarcy_managerment.view;

import Demotapcode.phamarcy_managerment.entity.ThuocVien;

import java.util.List;
import java.util.Scanner;

public class ThuocVienView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<ThuocVien> thuocVienList) {
        if (thuocVienList.isEmpty()) {
            System.out.println("Danh sach đang trống");
            return;
        }
        for (ThuocVien thuocVien : thuocVienList) {
            System.out.println(thuocVien);
        }
    }

    public static ThuocVien inputData() {
        try {
            System.out.println(" Ma Thuoc:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(" Ten Thuoc :");
            String tenThuoc;
            while (true) {
                System.out.print("Nhập tên thuốc (chỉ chữ và khoảng trắng, viết hoa chữ đầu): ");
                tenThuoc = sc.nextLine().trim();

                if (!tenThuoc.matches("^[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)*$")) {
                    System.out.println("Tên thuốc không hợp lệ. Ví dụ: 'Panadol Extra'");
                } else {
                    break;
                }
            }

            System.out.println("Han su dung");
            int hsd;
            while (true) {
                System.out.print("Nhập hạn sử dụng (> 5 thang): ");
                hsd = Integer.parseInt(sc.nextLine());
                if (hsd > 5) {
                    System.out.println(" Hop le");
                    break;
                } else {
                    System.out.println("Hạn sử dụng phải > 5. Vui lòng nhập lại!");
                }
            }
            System.out.println(" Noi San xuat:");
            String hsx;
            while (true) {
                System.out.println("Nhap noi san Xuat(chi chu va khoang trang, viet hoa chu dau):");
                hsx = sc.nextLine().trim();
                if (!hsx.matches("^[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)*$")) {
                    System.out.println("hang san xuat khong hop le : vi du :'Viet Nam");
                } else {
                    break;
                }
            }

            System.out.println(" so vien:");
            String input;
            int soVien = 0;

            while (true){
                System.out.println("chi nhap so nguyen");
                input = sc.nextLine();
                if (  input.matches("\\d+")){
                     soVien = Integer.parseInt(input);
                    System.out.println("The tich hop le :" + soVien);
                    break;
                }else {
                    System.out.println(" chi nhap dc so");
                }
            }

            return new ThuocVien(id, tenThuoc, hsd, hsx, soVien);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
