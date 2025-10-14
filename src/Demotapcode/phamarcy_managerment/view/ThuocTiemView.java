package Demotapcode.phamarcy_managerment.view;

import Demotapcode.phamarcy_managerment.entity.ThuocTiem;

import java.util.List;
import java.util.Scanner;

public class ThuocTiemView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<ThuocTiem> thuocTiemList) {
        if (thuocTiemList.isEmpty()) {
            System.out.println("Danh sach đang trống");
            return;
        }
        for (ThuocTiem thuocTiem : thuocTiemList) {
            System.out.println(thuocTiem);
        }
    }

    public static  ThuocTiem inputData() {
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
                System.out.println("Nhap noi san Xuat(khong dau, viet hoa chu dau.):");
                hsx = sc.nextLine().trim();
                if (!hsx.matches("^[A-Z][a-zA-Z ]{1,50}$")) {
                    System.out.println("hang san xuat khong hop le : vi du :'Viet Nam");
                } else {
                    break;
                }
            }

            System.out.println(" Lieu luong:");
            int lieuLuong;
            while (true){
                System.out.println(" t tính theo đơn vi ml:  (vi du : 200)");
                lieuLuong=Integer.parseInt(sc.nextLine());
                if(lieuLuong > 100){
                    System.out.println("Hợp lệ");
                    break;
                }else {
                    break;
                }
            }

            return new ThuocTiem(id, tenThuoc, hsd, hsx, lieuLuong);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
