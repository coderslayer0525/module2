package Demotapcode.game_online.controller;


import Demotapcode.game_online.entity.XaThu;

import Demotapcode.game_online.service.IXaThuService;


import Demotapcode.game_online.service.XaThuService;
import Demotapcode.game_online.view.PhapSuView;
import Demotapcode.game_online.view.XaThuView;

import java.util.List;
import java.util.Scanner;

public class XaThuController {
    private final IXaThuService xaThuService = new XaThuService();

    public void  displayMenu(){

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_OPPTIONS = 1;
        final int ADD_CHAR = 2;
        final int REMOVE_CHAR = 3;
        final  int SEARCH = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("-< Xa Thu SKILL >-");
            System.out.println("CHọn chức năng :" +
                    "\n 1. List  xt :" +
                    "\n 2. Tao xt moi : " +
                    "\n 3. Xoa xt : " +
                    "\n 4. Tim xt : " +
                    "\n 5. Quay lai ban menu");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY_OPPTIONS:
                    System.out.println("Danh sachxt dang co :");
                    List<XaThu> xaThuList = this.xaThuService.findAll();
                  XaThuView.display(xaThuList);
                    break;
                case ADD_CHAR:
                    System.out.println(" Them moi xt :");
                   XaThu xaThu = XaThuView.inputData();
                    boolean isSucess = this.xaThuService.add(xaThu);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVE_CHAR:
                    System.out.println("Xoa PS");
                    XaThu xtt  = XaThuView.inputData();
                    boolean isOk = this.xaThuService.delete(xtt.getId());
                    if (isOk){
                        System.out.println(" Xoa thanh cong ");
                    }else {
                        System.out.println(" khong the tim thay thong tin cua xt");
                    }
                    break;
                case  SEARCH:
                    System.out.println(" Tim xa thu ");
                    System.out.println(" nhap Id :");
                    Scanner scanner = new Scanner(System.in);
                    int id = Integer.parseInt(scanner.nextLine());
                   XaThu  tim= xaThuService.findById(id);
                    if (tim!= null){
                        System.out.println("tim duoc:"+ tim);
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
