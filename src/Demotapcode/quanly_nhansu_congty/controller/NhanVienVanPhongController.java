package Demotapcode.quanly_nhansu_congty.controller;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;
import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;
import Demotapcode.quanly_nhansu_congty.service.INhanVienVanPhongService;
import Demotapcode.quanly_nhansu_congty.service.NhanVienVanPhongService;
import Demotapcode.quanly_nhansu_congty.view.NhanVienBanHangView;
import Demotapcode.quanly_nhansu_congty.view.NhanVienVanPhongView;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienVanPhongController {
    private final INhanVienVanPhongService nhanVienVanPhongService= new NhanVienVanPhongService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);

        final int ADD_STAFF = 1;
        final int DISPLAY_STAFFLIST = 2;
        final int DELETE_STAFF = 3;
        final int FIND_STAFF = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Nhan Vien Van Phong Manager");
            System.out.println("chon Chuc Nang : "+
                    "\n 1. Them NVVP." +
                    "\n 2. Hien Thi danh sach NVVP" +
                    "\n 3. Xoa NVVP." +
                    "\n 4. Tim Kiem NVVP" +
                    "\n 5. Quay lai trang Quan Ly Chinh");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case ADD_STAFF :
                    System.out.println("Them NVVP moi");
                    NhanVienVanPhong nhanVienVanPhong = NhanVienVanPhongView.inputData();
                    boolean ok = this.nhanVienVanPhongService.add(nhanVienVanPhong);
                    if (ok){
                        System.out.println("da Them");
                    }else {
                        System.out.println("ERRor");
                    }
                    break;
                case DISPLAY_STAFFLIST:
                    System.out.println("Danh Sach NVVP");
                    ArrayList<NhanVienVanPhong> nhanVienVanPhongArrayList = this.nhanVienVanPhongService.findAll();
                    NhanVienVanPhongView.display(nhanVienVanPhongArrayList);
                    break;
                case DELETE_STAFF:
                    System.out.println("Duoi Viec NVVP");
                    NhanVienVanPhong ks = NhanVienVanPhongView.inputData();
                    boolean not = this.nhanVienVanPhongService.delete(ks.getMaNhanVien());
                    if (not){
                        System.out.println("Da duoi viec");
                    }else {
                        System.out.println(" khong duoi duoc ");
                    }
                    break;
                case FIND_STAFF:
                    System.out.println("tim NVVP trong cong Ty");
                    System.out.println("Nhap ten NVVP");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    NhanVienVanPhong found = nhanVienVanPhongService.findById(name);
                    if (found != null){
                        System.out.println("tim duoc "+ found);
                    }else {
                        System.out.println(" kho ng thay");
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
