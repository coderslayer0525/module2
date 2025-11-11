package Demotapcode.phamarcy_managerment.controller;

import Demotapcode.phamarcy_managerment.entity.ThuocTiem;
import Demotapcode.phamarcy_managerment.entity.ThuocVien;
import Demotapcode.phamarcy_managerment.service.IThuocTiemService;
import Demotapcode.phamarcy_managerment.service.IThuocVienService;
import Demotapcode.phamarcy_managerment.service.ThuocTiemService;
import Demotapcode.phamarcy_managerment.service.ThuocVienService;
import Demotapcode.phamarcy_managerment.view.ThuocTiemView;
import Demotapcode.phamarcy_managerment.view.ThuocVienView;

import java.util.List;
import java.util.Scanner;

public class ThuocTiemController {
    private final IThuocTiemService thuocTiemService = new ThuocTiemService();

    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_OPPTIONS = 1;
        final int ADD_CHAR = 2;
        final int REMOVE_CHAR = 3;
        final int SEARCH = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("-< Thuốc TIem>-");
            System.out.println("CHọn chức năng :" +
                    "\n 1. List Thuôốc T:" +
                    "\n 2. Nhập Thuốc T  : " +
                    "\n 3. Xoa Thuốc T : " +
                    "\n 4. Tim thuốc T : " +
                    "\n 5. Quay lai ban menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY_OPPTIONS:
                    System.out.println("Danh sach thuoc Tdang co :");
                    List<ThuocTiem> thuocTiemList = this.thuocTiemService.findAll();
                    ThuocTiemView.display(thuocTiemList);
                    break;
                case ADD_CHAR:
                    System.out.println(" thuoc moi :");
                    ThuocTiem thuocTiem = ThuocTiemView.inputData();
                    boolean isSucess = this.thuocTiemService.add(thuocTiem);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVE_CHAR:
                    System.out.println("Xoa thuoc");
                    ThuocTiem tv = ThuocTiemView.inputData();
                    boolean isOk = this.thuocTiemService.delete(tv.getMaThuoc());
                    if (isOk) {
                        System.out.println(" Xoa thanh cong ");
                    } else {
                        System.out.println(" khong the tim thay thong tin cua thuoc");
                    }
                    break;
                case SEARCH:
                    System.out.println(" Tim thuoc ");
                    System.out.println(" nhap ten thuoc :");
                    Scanner scanner = new Scanner(System.in);
                    String tenThuocTiem = scanner.nextLine();
                    ThuocTiem found = thuocTiemService.findByName(tenThuocTiem);
                    if (found != null) {
                        System.out.println("tim duoc:" + found);
                    } else {
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
