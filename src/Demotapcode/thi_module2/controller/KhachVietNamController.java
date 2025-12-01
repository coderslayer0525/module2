package Demotapcode.thi_module2.controller;



import Demotapcode.thi_module2.entity.KhachVietNam;
import Demotapcode.thi_module2.service.IKhachVietNamService;
import Demotapcode.thi_module2.service.KhachVietNamService;
import Demotapcode.thi_module2.view.KhachVietNamView;

import java.util.List;
import java.util.Scanner;

public class KhachVietNamController {
    private final IKhachVietNamService khachVietNamService = new KhachVietNamService();

    public void displayMenu() {

        Scanner scanner = new Scanner(System.in);

        final int DISPLAY_LIST = 1;
        final int ADD_OB = 2;
        final int DEL_OB = 3;
        final int FIND_OB = 4;
        final int BACK_MENU = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "=== QUẢN LÝ Khach hang Dien ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Chọn chức năng:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DISPLAY_LIST, "Danh Sách Kh");
            System.out.printf("| %-3d | %-20s |%n", ADD_OB, "Them kh moi");
            System.out.printf("| %-3d | %-20s |%n", DEL_OB, "Xóa kh cu");
            System.out.printf("| %-3d | %-20s |%n", FIND_OB, "Tìm khach trong he thong");
            System.out.printf("| %-3d | %-20s |%n", BACK_MENU, "Quay Lại Menu Chính");
            System.out.println("=====================================");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY_LIST:
                    System.out.println("Danh Khach Viet Nam dang su dung Dien luc.");
                    List<KhachVietNam> khachVietNamList = this.khachVietNamService.findAll();
                    KhachVietNamView.display(khachVietNamList);
                    break;
                case ADD_OB:
                    System.out.println("them khach hang VN moi.");
                    KhachVietNam khachVietNam = KhachVietNamView.inputData();
                    boolean ok = this.khachVietNamService.add(khachVietNam);
                    if (ok) {
                        System.out.println("Them thanh cong khach hang VN");
                    }else {
                        System.out.println("loi khong xac dinh");
                    }
                    break;
                case DEL_OB:
                    System.out.println("xoa khach hang cu");
                    break;
                case FIND_OB:
                    System.out.println("TIm khach hang VN dang su dung dien.");
                    break;
                case BACK_MENU:
                    System.out.println("quay lai Menu chinh");
                    flag = false;
                    break;
                default:
                    System.out.println("lua chon khong hop le");

            }
        }
    }
}
