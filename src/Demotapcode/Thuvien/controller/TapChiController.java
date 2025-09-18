package Demotapcode.Thuvien.controller;

import Demotapcode.Thuvien.entity.LuanVan;
import Demotapcode.Thuvien.entity.TapChi;
import Demotapcode.Thuvien.service.ITapChiService;
import Demotapcode.Thuvien.service.TapChiService;
import Demotapcode.Thuvien.view.LuanVanView;
import Demotapcode.Thuvien.view.TapChiView;

import java.util.ArrayList;
import java.util.Scanner;

public class TapChiController {
    private final ITapChiService tapChiService = new TapChiService();

    public void displayMenu(){
        Scanner sc = new Scanner(System.in);

        final int ADD_FILES = 1;
        final int DISPLAY_FILES = 2;
        final int DELETE_FILES = 3;
        final int FIND_FILES = 4;
        final int BACK = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Tap chi Manager");
            System.out.println(" chon chuc nang :" +
                    "\n 1. Them moi Tap chi" +
                    "\n 2. Hien Thi Thu vien Tap chi" +
                    "\n 3. Xoa Tap Chi" +
                    "\n 4. Tim kiem Tap Chi" +
                    "\n 5. Quay lai trang quan ly chinh");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ADD_FILES :
                    System.out.println("Them moi Tap Chi");
                    TapChi tapChi = TapChiView.inputData();
                    boolean isOk = this.tapChiService.add(tapChi);
                    if (isOk){
                        System.out.println("Da Them");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case DISPLAY_FILES:
                    System.out.println("danh sach tap chi trong thu vien");
                    ArrayList<TapChi> tapChiArrayList= this.tapChiService.findAll();
                    TapChiView.display(tapChiArrayList);
                    break;
                case DELETE_FILES:
                    System.out.println("xoa tap chi");
                    TapChi cs = TapChiView.inputData();
                    boolean isNot = this.tapChiService.delete(cs.getMaTaiLieu());
                    if (isNot){
                        System.out.println("Xoa Thanh Cong");
                    }else {
                        System.out.println("khong the tim thay thong tin cua luan van");
                    }
                    break;
                case FIND_FILES:
                    System.out.println("Tim Tap Chi");
                    System.out.println("nhap ma Tai Lieu");
                   Scanner scanner = new Scanner(System.in);
                   int maTaiLieu = scanner.nextInt();
                    TapChi found = tapChiService.findById(maTaiLieu);
                    if (found != null){
                        System.out.println("tim thay" + found);
                    }else {
                        System.out.println("khong tim thay tap chi");
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

