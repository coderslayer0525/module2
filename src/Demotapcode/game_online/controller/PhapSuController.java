package Demotapcode.game_online.controller;

import Demotapcode.game_online.entity.ChienBinh;
import Demotapcode.game_online.entity.PhapSu;
import Demotapcode.game_online.service.IPhapSuService;
import Demotapcode.game_online.service.PhapSuService;
import Demotapcode.game_online.view.ChienBinhView;
import Demotapcode.game_online.view.PhapSuView;

import java.util.List;
import java.util.Scanner;

public class PhapSuController {
    private final IPhapSuService phapSuService = new PhapSuService();

    public void  displayMenu(){

    Scanner sc = new Scanner(System.in);
    final int DISPLAY_OPPTIONS = 1;
    final int ADD_CHAR = 2;
    final int REMOVE_CHAR = 3;
    final  int SEARCH = 4;
    final int EXIT = 5;
    boolean flag = true;
        while (flag) {
        System.out.println("-< PHAP SU SKILL >-");
        System.out.println("CHọn chức năng :" +
                "\n 1. List Phap Su :" +
                "\n 2. Tao Phap su moi : " +
                "\n 3. Xoa Phap Su : " +
                "\n 4. Tim Phap Su : " +
                "\n 5. Quay lai ban menu");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case DISPLAY_OPPTIONS:
                System.out.println("Danh sach Phap su dang co :");
                List<PhapSu> phapSuList = this.phapSuService.findAll();
                PhapSuView.display(phapSuList);
                break;
            case ADD_CHAR:
                System.out.println(" Them moi Phap Su :");
                PhapSu phapSu = PhapSuView.inputData();
                boolean isSucess = this.phapSuService.add(phapSu);
                if (isSucess) {
                    System.out.println("Đã thêm.");
                }else {
                    System.out.println("ERROR");
                }
                break;
            case REMOVE_CHAR:
                System.out.println("Xoa PS");
                PhapSu ps  = PhapSuView.inputData();
                boolean isOk = this.phapSuService.delete(ps.getId());
                if (isOk){
                    System.out.println(" Xoa thanh cong ");
                }else {
                    System.out.println(" khong the tim thay thong tin cua phap su");
                }
                break;
            case  SEARCH:
                System.out.println(" Tim Phap Su ");
                System.out.println(" nhap Id :");
                Scanner scanner = new Scanner(System.in);
                int id = Integer.parseInt(scanner.nextLine());
                PhapSu found = phapSuService.findById(id);
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
