package Demotapcode.phamarcy_managerment.view;


import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;

import java.util.List;
import java.util.Scanner;

public class ThuocNuocView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<ThuocNuoc> thuocNuocList) {
        if (thuocNuocList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        for (ThuocNuoc thuocNuoc : thuocNuocList) {
            System.out.println(thuocNuoc);
        }
    }

    public static ThuocNuoc inputData() {
        try {
            System.out.println(" Ma Thuoc:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(" Ten Thuoc :");
            String tenThuoc;
            while (true) {
                System.out.print("Nhập tên thuốc (chỉ chữ và khoảng trắng, viết hoa chữ đầu): ");
                tenThuoc = sc.nextLine().trim();

                if (!tenThuoc.matches("^[A-Za-z0-9\\- ]{2,50}$")) {
                    System.out.println("Tên thuốc không hợp lệ. Ví dụ: 'Panadol -Extra-500mg'");
                } else {
                    System.out.println("Hợp lệ :");
                    break;
                }
            }

            System.out.println("Han su dung(tháng)");
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
                System.out.println("Nhap noi san Xuat(khong dau, viet hoa chu dau.):");
                hsx = sc.nextLine().trim();
                if (!hsx.matches("^[A-Z][a-zA-Z ]{1,50}$")) {
                    System.out.println("hang san xuat khong hop le : vi du :'Viet Nam");
                } else {
                    System.out.println("Đã nhập.");
                    break;
                }
            }

            System.out.println(" The Tich:");
            int theTich;
            while (true){
                System.out.println(" thể tích tính theo đơn vi ml:  (vi du : 200)");
                theTich=Integer.parseInt(sc.nextLine());
                if(theTich > 100){
                    System.out.println("Hợp lệ");
                    break;
                }else {
                    break;
                }
            }

            return new ThuocNuoc(id, tenThuoc, hsd, hsx, theTich);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
