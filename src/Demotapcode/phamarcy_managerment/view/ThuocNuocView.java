package Demotapcode.phamarcy_managerment.view;


import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;

import java.util.List;
import java.util.Scanner;

public class ThuocNuocView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(List<ThuocNuoc> thuocNuocList) {
        if (thuocNuocList.isEmpty()) {
            System.out.println("danh sach trong");
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

                if (!tenThuoc.matches("^[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)*$")) {
                    System.out.println("Tên thuốc không hợp lệ. Ví dụ: 'Paracetamol Extra'");
                } else {
                    break;
                }
            }

            int hsd;
            while (true) {
                System.out.print("Nhập hạn sử dụng (>= 5): ");
                hsd = sc.nextInt();
                sc.nextLine();
                if (hsd >= 5) {
                    break;
                } else {
                    System.out.println("Hạn sử dụng phải >= 5. Vui lòng nhập lại!");
                }
            }

            System.out.println(" Hang San Xuat :");
           String hsx;
           while (true){
               System.out.println("Nhap noi san Xuat(chi chu va khoang trang, viet hoa chu dau):");
               hsx = sc.nextLine().trim();
               if (!hsx.matches("^[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)*$")){
                   System.out.println("hang san xuat khong hop le : vi du :'Viet Nam");
               }else {
                   break;
               }
           }

            System.out.println(" The Tich:");
            int theTich = Integer.parseInt(sc.nextLine());

            return new ThuocNuoc(id,tenThuoc,hsd,hsx,theTich);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
