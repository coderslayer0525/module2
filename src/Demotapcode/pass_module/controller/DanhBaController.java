package Demotapcode.pass_module.controller;

import Demotapcode.pass_module.entity.DanhBa;
import Demotapcode.pass_module.service.DanhBaService;
import Demotapcode.pass_module.service.IDanhBaService;
import Demotapcode.pass_module.view.DanhBaView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhBaController {
    private final IDanhBaService danhBaService =  new DanhBaService();
    public List<DanhBa> displayMenu() {
        Scanner sc = new Scanner(System.in);

        final int DISPLAY = 1;
        final int ADD = 2;
        final int DEL = 3;
        final int FIND = 4;
        final int EXIT = 5;
        boolean drag = true;
        while (drag) {
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "=== Danh Ba ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Chọn chức năng:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DISPLAY, "Danh Ba");
            System.out.printf("| %-3d | %-20s |%n", ADD, "Thêm");
            System.out.printf("| %-3d | %-20s |%n", DEL, "Xóa");
            System.out.printf("| %-3d | %-20s |%n", FIND, "Tìm");
            System.out.printf("| %-3d | %-20s |%n", EXIT, "Quay Lại Menu Chính");
            System.out.println("=====================================");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("Danh Sach");
                    List<DanhBa> danhBaList = danhBaService.findAll();
                   DanhBaView.display(danhBaList);
                    break;
                case ADD:
                    System.out.println("Them");
                    DanhBa danhBa = DanhBaView.inputData();
                    boolean isOk = this.danhBaService.add(danhBa);
                    if (isOk) {
                        System.out.println("Thanh cong");
                    } else {
                        System.out.println("Loi khong xac dinh");
                    }
                    break;
                case DEL:
                    System.out.println("Xoa");
                    DanhBa tv =DanhBaView.inputData();
                    boolean ok = this.danhBaService.delete(tv.getSoDienThoai());
                    if (ok) {
                        System.out.println(" Xoa thanh cong ");
                    } else {
                        System.out.println(" khong the tim thay thong tin sdt");
                    }
                    break;
                case FIND:
                    System.out.println(" nhap ten :");
                    Scanner scanner = new Scanner(System.in);
                    String ten= scanner.nextLine();
                    List<DanhBa> found = danhBaService.findByName(ten);
                    if (found != null) {
                        System.out.println("tim duoc:" + found);
                    } else {
                        System.out.println(" khong co ten vua nhap");
                    }
                    break;
                case EXIT:
                   drag = false;

                default:
                    System.out.println("lua chon khong hop le");
            }
        }
            return null;
    }
}
