package Demotapcode.phamarcy_managerment.controller;

import Demotapcode.phamarcy_managerment.entity.ThuocVien;
import Demotapcode.phamarcy_managerment.service.IThuocVienService;
import Demotapcode.phamarcy_managerment.service.ThuocVienService;
import Demotapcode.phamarcy_managerment.view.ThuocVienView;

import java.util.List;
import java.util.Scanner;

public class ThuocVienController {
    private final IThuocVienService thuocVienService = new ThuocVienService();
    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_OPPTIONS = 1;
        final int ADD_CHAR = 2;
        final int REMOVE_CHAR = 3;
        final  int SEARCH = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("-< Thuốc VIen >-");
            System.out.println("CHọn chức năng :" +
                    "\n 1. List Thuôốc V:" +
                    "\n 2. Nhập Thuốc V  : " +
                    "\n 3. Xoa Thuốc V : " +
                    "\n 4. Tim thuốc V : " +
                    "\n 5. Quay lai ban menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY_OPPTIONS:
                    System.out.println("Danh sach thuoc V dang co :");
                    List<ThuocVien> thuocVienList = this.thuocVienService.findAll();
                    ThuocVienView.display(thuocVienList);
                    break;
                case ADD_CHAR:
                    System.out.println(" thuoc moi :");
                    ThuocVien thuocVien = ThuocVienView.inputData();
                    boolean isSucess = this.thuocVienService.add(thuocVien);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVE_CHAR:
                    System.out.println("Xoa thuoc");
                    ThuocVien tv = ThuocVienView.inputData();
                    boolean isOk = this.thuocVienService.delete(tv.getMaThuoc());
                    if (isOk){
                        System.out.println(" Xoa thanh cong ");
                    }else {
                        System.out.println(" khong the tim thay thong tin cua thuoc");
                    }
                    break;
                case  SEARCH:
                    System.out.println(" Tim thuoc ");
                    System.out.println(" nhap Id :");
                    Scanner scanner = new Scanner(System.in);
                    String tenThuoc = scanner.nextLine();
                    ThuocVien found = thuocVienService.findByName(tenThuoc);
                    if (found != null){
                        System.out.println("tim duoc:"+ found);
                    }else {
                        System.out.println(" khong co ID vua nhap");
                    }
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
                    System.out.println("không hợp le");
            }
        }
    }
}
