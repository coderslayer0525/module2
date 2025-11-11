package Demotapcode.quanly_nhansu_congty.controller;

import Demotapcode.quanly_nhansu_congty.entity.KySu;
import Demotapcode.quanly_nhansu_congty.service.IKySuService;
import Demotapcode.quanly_nhansu_congty.service.KySuService;
import Demotapcode.quanly_nhansu_congty.view.KySuView;

import java.util.ArrayList;
import java.util.Scanner;

public class KySuController {
    private final IKySuService kySuService = new KySuService();
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        final int ADD_STAFF = 1;
        final int DISPLAY_STAFFLIST = 2;
        final int DELETE_STAFF = 3;
        final int FIND_STAFF = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag){
            System.out.println("ky Su Manager");
            System.out.println("chon Chuc Nang : "+
                    "\n 1. Them Ky Su." +
                    "\n 2. Hien Thi danh sach ky su" +
                    "\n 3. Xoa ky su." +
                    "\n 4. Tim Kiem ky su" +
                    "\n 5. Quay lai trang Quan Ly Chinh");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case ADD_STAFF :
                    System.out.println("Them ky su moi");
                   KySu kySu = KySuView.inputData();
                   boolean ok = this.kySuService.add(kySu);
                   if (ok){
                       System.out.println("da Them");
                   }else {
                       System.out.println("ERRor");
                   }
                    break;
                case DISPLAY_STAFFLIST:
                    System.out.println("Danh Sach ky su");
                    ArrayList<KySu> kySuArrayList = this.kySuService.findAll();
                    KySuView.display(kySuArrayList);
                    break;
                case DELETE_STAFF:
                    System.out.println("Duoi Viec Nky su");
                    KySu ks = KySuView.inputData();
                    boolean not = this.kySuService.delete(ks.getMaNhanVien());
                    if (not){
                        System.out.println("Da duoi viec");
                    }else {
                        System.out.println(" khong duoi duoc ");
                    }
                    break;
                case FIND_STAFF:
                    System.out.println("tim ky su trong cong Ty");
                    System.out.println("Nhap ten Ky su");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    KySu found = kySuService.findById(name);
                    if (found != null){
                        System.out.println("thim Thay"+ found);
                    }else {
                        System.out.println(" khong thay");
                    }
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}
