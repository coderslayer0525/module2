package Demotapcode.quanly_traicay.controller;


import Demotapcode.quanly_traicay.entity.DuaHau;
import Demotapcode.quanly_traicay.service.DuaHauService;
import Demotapcode.quanly_traicay.service.IDuaHauService;
import Demotapcode.quanly_traicay.view.DuaHauView;

import java.util.List;
import java.util.Scanner;

public class DuaHauController {
    private final IDuaHauService duaHauService =new DuaHauService();

    public void displayMenu(){

        Scanner scanner = new Scanner(System.in);

        final int DISPLAY_LIST = 1;
        final int ADD_OB = 2;
        final int BACK_MENU = 3;
        boolean flag = true;
        while (flag){
            System.out.println("DUA HAU");
            System.out.println("CHon chuc nang :" +
                    "\n 1. DAnh Sach Dua Hau." +
                    "\n 2. Mua Them Dua Hau" +
                    "\n 3. Quay lai menu chinh.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case DISPLAY_LIST :
                    System.out.println("List Dua Hau");
                    List<DuaHau> duaHauList =this.duaHauService.findAll();
                    DuaHauView.display(duaHauList);
                    break;
                case ADD_OB:
                    System.out.println("Mua them Dua Hau");
                    DuaHau duaHau = DuaHauView.inputData();
                    boolean isOk =this.duaHauService.add(duaHau);
                    if (isOk){
                        System.out.println("Da Mua");
                    }else {
                        System.out.println("Khong mua duoc");
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
