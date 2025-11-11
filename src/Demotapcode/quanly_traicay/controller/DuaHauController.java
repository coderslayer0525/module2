package Demotapcode.quanly_traicay.controller;


import Demotapcode.quanly_traicay.entity.DuaHau;
import Demotapcode.quanly_traicay.service.DuaHauService;
import Demotapcode.quanly_traicay.service.IDuaHauService;
import Demotapcode.quanly_traicay.view.DuaHauView;

import java.util.List;
import java.util.Scanner;

public class DuaHauController {
    private final IDuaHauService duaHauService = new DuaHauService();

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
            System.out.printf("%-30s%n", "=== QUẢN LÝ DƯA HẤU ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Chọn chức năng:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DISPLAY_LIST, "Danh Sách Dưa Hấu");
            System.out.printf("| %-3d | %-20s |%n", ADD_OB, "Mua Thêm Dưa Hấu");
            System.out.printf("| %-3d | %-20s |%n", DEL_OB, "Xóa Dưa Hấu");
            System.out.printf("| %-3d | %-20s |%n", FIND_OB, "Tìm Dưa Hấu");
            System.out.printf("| %-3d | %-20s |%n", BACK_MENU, "Quay Lại Menu Chính");
            System.out.println("=====================================");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY_LIST:
                    System.out.println("List Dua Hau");
                    List<DuaHau> duaHauList = this.duaHauService.findAll();
                    DuaHauView.display(duaHauList);
                    break;
                case ADD_OB:
                    System.out.println("Mua them Dua Hau");
                    DuaHau duaHau = DuaHauView.inputData();
                    boolean isOk = this.duaHauService.add(duaHau);
                    if (isOk) {
                        System.out.println("Da Mua");
                    } else {
                        System.out.println("Khong mua duoc");
                    }
                    break;
                case DEL_OB:
                    System.out.println("Xoa Dua Hau.");
                    DuaHau dh = DuaHauView.inputData();
                    boolean ok = this.duaHauService.delete(dh.getNgaySanXuat());
                    if (ok){
                        System.out.println("xoa thanh cong");
                    }else {
                        System.out.println("khong tim thay ngay san xuat da nhap.");
                    }
                    break;
                case FIND_OB:
                    System.out.println("Tim Dua Hau.");
                    System.out.println("Ten Dua Hau:");
                    Scanner sc = new Scanner(System.in);
                    String tenDuaHau =  sc.nextLine();
                    DuaHau tim = duaHauService.findByName(tenDuaHau);
                    if(tim !=null){
                        System.out.println("Tim thay loai :"+tim);
                    }else {
                        System.out.println("Khong tim thay thong tin vua nhap.");
                    }
                    break;
                case BACK_MENU:
                    flag = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le");

            }
        }
    }
}
