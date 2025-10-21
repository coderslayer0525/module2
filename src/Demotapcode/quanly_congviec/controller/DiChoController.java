package Demotapcode.quanly_congviec.controller;

import Demotapcode.quanly_congviec.entity.DiCho;
import Demotapcode.quanly_congviec.service.DiChoService;
import Demotapcode.quanly_congviec.service.IDiChoService;
import Demotapcode.quanly_congviec.view.DiChoView;
import Demotapcode.quanly_traicay.entity.DuaHau;
import Demotapcode.quanly_traicay.view.DuaHauView;

import java.util.List;
import java.util.Scanner;

public class DiChoController {
    private final IDiChoService diChoService = new DiChoService();

    public void  displayMenu(){
        Scanner sc = new Scanner(System.in);

        final int DISPLAY = 1;
        final int ADD = 2;
        final int DEL = 3;
        final int FIND= 4;
        final int EXIT = 5;
        boolean drag = true;
        while (drag){
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "=== QUẢN LÝ CHI TIÊU ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Chọn chức năng:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DISPLAY, "Danh Sách Chi Tiêu");
            System.out.printf("| %-3d | %-20s |%n", ADD, "Mua Thêm Chi Tiêu");
            System.out.printf("| %-3d | %-20s |%n", DEL, "Xóa Chi Tiêu");
            System.out.printf("| %-3d | %-20s |%n", FIND, "Tìm Chi Tiêu");
            System.out.printf("| %-3d | %-20s |%n", EXIT, "Quay Lại Menu Chính");
            System.out.println("=====================================");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case DISPLAY :
                    System.out.println("");
                    List<DiCho> diChoList = this.diChoService.findAll();
                    DiChoView.display(diChoList);
                    break;
                case ADD:
                    System.out.println("");
                    DiCho diCho = DiChoView.inputData();
                    boolean isOk = this.diChoService.add(diCho);
                    if (isOk) {
                        System.out.println("Da them");
                    } else {
                        System.out.println("Khong them duoc");
                    }
                    break;
                case DEL:
                    System.out.println("");
                    DiCho dh = DiChoView.inputData();
                    boolean ok = this.diChoService.delete(dh.getMaChiTieu());
                    if (ok){
                        System.out.println("xoa thanh cong");
                    }else {
                        System.out.println("khong tim thay ngay san xuat da nhap.");
                    }
                case FIND:
                    System.out.println("Tim hoa don chi tieu :");
                    System.out.println("Ma Chi Tieu:");
                    Scanner scanner = new Scanner(System.in);
                    int maChiTieu = Integer.parseInt(scanner.nextLine());
                    DiCho tim = diChoService.findById(maChiTieu);
                    if(tim !=null){
                        System.out.println("Tim thay ma chi tieu :"+tim);
                    }else {
                        System.out.println("Khong tim thay thong tin vua nhap.");
                    }
                    break;
                case EXIT:
                    drag = false;
                default:
                    System.out.println("Lua Chon khong hop le");
            }
        }
    }
}
