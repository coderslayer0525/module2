package Demotapcode.Thuvien.controller;

import Demotapcode.Thuvien.service.ILuanVanService;
import Demotapcode.Thuvien.service.LuanVanService;
import Demotapcode.Thuvien.view.LuanVanView;
import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;
import java.util.Scanner;

public class LuanVanController {
    private final ILuanVanService luanVanService = new LuanVanService();

    public void displayMenu(){
        Scanner sc = new Scanner(System.in);

        final int ADD_FILES = 1;
        final int DISPLAY_FILES = 2;
        final int DELETE_FILES = 3;
        final int FIND_FILES = 4;
        final int BACK = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Luan Van Manager");
            System.out.println(" chon chuc nang :" +
                    "\n 1. Them moi Luan van" +
                    "\n 2. Hien Thi Thu vien Luan Van" +
                    "\n 3. Xoa Luan Van" +
                    "\n 4. Tim kiem Luan van" +
                    "\n 5. Quay lai trang quan ly chinh");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ADD_FILES :
                    System.out.println("Them moi Luan Van");
                    LuanVan luanVan = LuanVanView.inputData();
                    boolean isOk = this.luanVanService.add(luanVan);
                    if (isOk){
                        System.out.println("Da Them");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case DISPLAY_FILES:
                    System.out.println("danh sach Luan van trong thu vien");
                    ArrayList<LuanVan> luanVanArrayList= this.luanVanService.findAll();
                    LuanVanView.display(luanVanArrayList);
                    break;
                case DELETE_FILES:
                    System.out.println("xoa Luan van");
                    LuanVan cs = LuanVanView.inputData();
                    boolean isNot = this.luanVanService.delete(cs.getMaTaiLieu());
                    if (isNot){
                        System.out.println("Xoa Thanh Cong");
                    }else {
                        System.out.println("khong the tim thay thong tin cua luan van");
                    }
                    break;
                case FIND_FILES:
                    System.out.println("Tim Luan Van");
                    System.out.println("nhap Ma tai Lieu");
                   Scanner scanner = new Scanner(System.in);
                   int maTaiLieu = scanner.nextInt();
                   LuanVan found = luanVanService.findById(maTaiLieu);
                   if (found != null){
                       System.out.println("tim thay" + found);
                   }else {
                       System.out.println("khong tim thay luan van");
                   }
                   break;
                case BACK:
                    flag = false;
                    break;
                default:
                    System.out.println("Lua chon khong hoop le");

            }
        }
    }

}
