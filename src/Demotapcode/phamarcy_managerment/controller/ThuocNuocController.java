package Demotapcode.phamarcy_managerment.controller;

import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.service.IThuocNuocService;
import Demotapcode.phamarcy_managerment.service.ThuocNuocService;
import Demotapcode.phamarcy_managerment.view.ThuocNuocView;

import java.util.List;
import java.util.Scanner;

public class ThuocNuocController {
    private final IThuocNuocService thuocNuocService = new ThuocNuocService();


    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_OPPTIONS = 1;
        final int ADD_CHAR = 2;
        final int REMOVE_CHAR = 3;
        final  int SEARCH = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("-< Thuốc Nước >-");
            System.out.println("CHọn chức năng :" +
                    "\n 1. List Thuôốc nước:" +
                    "\n 2. Nhập Thuốc nước  : " +
                    "\n 3. Xoa Thuốc nước : " +
                    "\n 4. Tim thuốc nước : " +
                    "\n 5. Quay lai ban menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY_OPPTIONS:
                    System.out.println("Danh sach thuoc nuoc dang co :");
                    List<ThuocNuoc> thuocNuocList = this.thuocNuocService.findAll();
                    ThuocNuocView.display(thuocNuocList);
                    break;
                case ADD_CHAR:
                    System.out.println(" thuoc moi :");
                    ThuocNuoc thuocNuoc = ThuocNuocView.inputData();
                    boolean isSucess = this.thuocNuocService.add(thuocNuoc);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVE_CHAR:
                    System.out.println("Xoa thuoc");
                   ThuocNuoc tn = ThuocNuocView.inputData();
                    boolean isOk = this.thuocNuocService.delete(tn.getMaThuoc());
                    if (isOk){
                        System.out.println(" Xoa thanh cong ");
                    }else {
                        System.out.println(" khong the tim thay thong tin cua thuoc");
                    }
                    break;
                case  SEARCH:
                    System.out.println(" Tim thuoc ");
                    System.out.println(" nhap ten :");
                    Scanner scanner = new Scanner(System.in);
                    String tenThuoc = scanner.nextLine();
                    ThuocNuoc found = thuocNuocService.findByName(tenThuoc);
                    if (found != null){
                        System.out.println("tim duoc:"+ found);
                    }else {
                        System.out.println(" khong co ten vua nhap");
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
