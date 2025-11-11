package Demotapcode.game_online.controller;


import Demotapcode.game_online.entity.ChienBinh;
import Demotapcode.game_online.service.ChienBinhService;
import Demotapcode.game_online.service.IChienBinhService;
import Demotapcode.game_online.view.ChienBinhView;

import java.util.List;
import java.util.Scanner;

public class ChienBinhController {
    private final IChienBinhService chienBinhService = new ChienBinhService();


    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_OPPTIONS = 1;
        final int ADD_CHAR = 2;
        final int REMOVE_CHAR = 3;
        final  int PK_CHAR = 4;
        final  int SEARCH = 5;
        final int EXIT = 6;
        boolean flag = true;
        while (flag) {
            System.out.println("-< CHIEN BINH SKILL >-");
            System.out.println("CHọn chức năng :" +
                    "\n 1. List Chien Binh :" +
                    "\n 2. Tao Chien Binh moi : " +
                    "\n 3. Xoa Chien Binh : " +
                    "\n 5. Tim chien binh : " +
                    "\n 4. Chon Chien binh lam Tuong"+
                    "\n 6. Quay lai ban menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY_OPPTIONS:
                    System.out.println("Danh sach chien binh dang co :");
                    List<ChienBinh> chienBinhList = this.chienBinhService.findAll();
                    ChienBinhView.display(chienBinhList);
                    break;
                case ADD_CHAR:
                    System.out.println(" Them moi Chien Binh :");
                    ChienBinh chienBinh = ChienBinhView.inputData();
                    boolean isSucess = this.chienBinhService.add(chienBinh);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVE_CHAR:
                    System.out.println("Xoa Chien binh");
                    ChienBinh cs = ChienBinhView.inputData();
                    boolean isOk = this.chienBinhService.delete(cs.getId());
                    if (isOk){
                        System.out.println(" Xoa thanh cong ");
                    }else {
                        System.out.println(" khong the tim thay thong tin cua chien binh");
                    }
                    break;
                case  SEARCH:
                    System.out.println(" Tim Chien Binh ");
                    System.out.println(" nhap Id :");
                    Scanner scanner = new Scanner(System.in);
                    int id = Integer.parseInt(scanner.nextLine());
                    ChienBinh found = chienBinhService.findById(id);
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
