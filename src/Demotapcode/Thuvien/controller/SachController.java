package Demotapcode.Thuvien.controller;

import Demotapcode.Thuvien.entity.LuanVan;
import Demotapcode.Thuvien.service.ISachService;
import Demotapcode.Thuvien.service.SachService;
import Demotapcode.Thuvien.view.LuanVanView;
import Demotapcode.Thuvien.view.SachView;
import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class SachController {
    private final ISachService sachService= new SachService();

    public void displayMenu(){
        Scanner sc = new Scanner(System.in);

        final int ADD_FILES = 1;
        final int DISPLAY_FILES = 2;
        final int DELETE_FILES = 3;
        final int FIND_FILES = 4;
        final int BACK = 5;
        boolean flag = true;
        while (flag){
            System.out.println("sach Manager");
            System.out.println(" chon chuc nang :" +
                    "\n 1. Them moi sach" +
                    "\n 2. Hien Thi Thu vien sach" +
                    "\n 3. Xoa sach" +
                    "\n 4. Tim kiem sach" +
                    "\n 5. Quay lai trang quan ly chinh");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ADD_FILES :
                    System.out.println("Them moi Sach");
                    Sach sach = SachView.inputData();
                    boolean isOk = this.sachService.add(sach);
                    if (isOk){
                        System.out.println("Da Them");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case DISPLAY_FILES:
                    System.out.println("danh sach sach trong thu vien");
                    ArrayList<Sach> sachArrayList= this.sachService.findAll();
                    SachView.display(sachArrayList);
                    break;
                case DELETE_FILES:
                    System.out.println("xoa sach");
                    Sach cs = SachView.inputData();
                    boolean isNot = this.sachService.delete(cs.getMaTaiLieu());
                    if (isNot){
                        System.out.println("Xoa Thanh Cong");
                    }else {
                        System.out.println("khong the tim thay thong tin cua sach");
                    }
                    break;
                case FIND_FILES:
                    System.out.println("Tim sach");
                    System.out.println("nhap ma Tai Lieu");
                   Scanner scanner = new Scanner(System.in);
                   int maTaiLieu = scanner.nextInt();
                    Sach found = sachService.findById(maTaiLieu);
                    if (found != null){
                        System.out.println("tim thay" + found);
                    }else {
                        System.out.println("khong tim thay  sach");
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
