package cs_shop_moblie.controller;

import cs_shop_moblie.entity.DienThoai;
import cs_shop_moblie.service.DienThoaiService;
import cs_shop_moblie.service.IDienThoaiService;
import cs_shop_moblie.view.DienThoaiView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaicontroller {
    private final IDienThoaiService dienThoaiService = new DienThoaiService();

    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_MOBILIST = 1;
        final int ADD_NEWMOBI = 2;
        final int BACK = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("");
            System.out.println("Chon hanh dong voi dien thoai" +
                    "\n 1. Danh sach dien thoai co trong shop" +
                    "\n 2. Them may dien thoai moi vao shop" +
                    "\n 3. Quay lai Menu chinh");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY_MOBILIST:
                    System.out.println("Danh sach dang hien thi");
                    List<DienThoai> dienThoaiList = this.dienThoaiService.findAll();
                    DienThoaiView.display((ArrayList<DienThoai>) dienThoaiList);
                case ADD_NEWMOBI:
                    System.out.println(" Nhâp thêm máy vào  cửa hàng");
                    DienThoai dienThoai = DienThoaiView.inputData();
                    boolean isOk = this.dienThoaiService.add(dienThoai);
                    if (isOk) {
                        System.out.println("da theem");
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                case BACK:
                    System.out.println(" quay lai trang quan ly");
                    break;
                default:
                    flag = false;
            }
        }
    }
}

