package cs_shop_moblie.controller;

import cs_shop_moblie.entity.MayTinh;
import cs_shop_moblie.service.IMayTinhService;
import cs_shop_moblie.service.MayTinhService;
import cs_shop_moblie.view.MayTinhView;

import java.util.ArrayList;
import java.util.Scanner;

public class MayTinhcontroller {
    private final IMayTinhService mayTinhService = new MayTinhService();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        final int DISPLAY_CPU = 1;
        final  int ADD = 2;
        final int   DELETE = 3;
        final int FIND_CPU = 4;
        boolean clag = true;
        while (clag){
            System.out.println(" quan ly kho computer");
            System.out.println("Option" +
                    "\n 1. Danh sach cac loai may tinh trong kho" +
                    "\n 2. Nhap them may tinh moi vao shop" +
                    "\n 3. Thanh ly Computer cu" +
                    "\n 4. Tim mau may tinh trong kho");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case DISPLAY_CPU :
                    System.out.println("danh sach may tinh dang hien thi");
                    ArrayList<MayTinh> mayTinhArrayList = this.mayTinhService.findAll();
                    MayTinhView.display(mayTinhArrayList);
                    break;
                case ADD:
                    System.out.println("Nhap may moi");
                    MayTinh mayTinh = MayTinhView.inputData();

                    boolean hehe= this.mayTinhService.add(mayTinh);
                    if(hehe){
                        System.out.println("da them may moi");
                    }else {
                        System.out.println("Loi roi");
                    }
                    break;
                case DELETE:
                    System.out.println(" thanh ly lai may tinh cu");
                    MayTinh mayTinh1 = MayTinhView.inputData();
                    boolean nono = this.mayTinhService.delete(mayTinh1);
                    if (nono){
                        System.out.println("Thanh ly xong");
                    }else {
                        System.out.println(" khong tim thay thong tin cua mmay  can tim");
                    }
                    break;
                case FIND_CPU:

            }
        }
    }
}
