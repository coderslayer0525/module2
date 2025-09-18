package Demotapcode.quanly_nhansu_congty.controller;

import Demotapcode.quanly_nhansu_congty.entity.KySu;
import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;
import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;
import Demotapcode.quanly_nhansu_congty.service.INhanVienBanHangService;
import Demotapcode.quanly_nhansu_congty.service.NhanVienBanHangService;
import Demotapcode.quanly_nhansu_congty.view.KySuView;
import Demotapcode.quanly_nhansu_congty.view.NhanVienBanHangView;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienBanHangController {
    private final INhanVienBanHangService nhanVienBanHangService= new NhanVienBanHangService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);

        final int ADD_STAFF = 1;
        final int DISPLAY_STAFFLIST = 2;
        final int DELETE_STAFF = 3;
        final int FIND_STAFF = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Nhan Vien Ban Hang Manager");
            System.out.println("chon Chuc Nang : "+
                    "\n 1. Them NVBH." +
                    "\n 2. Hien Thi danh sach NVBH" +
                    "\n 3. Xoa NVBH." +
                    "\n 4. Tim Kiem NVBH" +
                    "\n 5. Quay lai trang Quan Ly Chinh");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case ADD_STAFF :
                    System.out.println("Them NVBH moi");
                    NhanVienBanHang nhanVienBanHang = NhanVienBanHangView.inputData();
                    boolean ok = this.nhanVienBanHangService.add(nhanVienBanHang);
                    if (ok){
                        System.out.println("da Them");
                    }else {
                        System.out.println("ERRor");
                    }
                    break;
                case DISPLAY_STAFFLIST:
                    System.out.println("Danh Sach NVBH");
                    ArrayList<NhanVienBanHang> nhanVienBanHangArrayList = this.nhanVienBanHangService.findAll();
                    NhanVienBanHangView.display(nhanVienBanHangArrayList);
                    break;
                case DELETE_STAFF:
                    System.out.println("Duoi Viec NVBH");
                    NhanVienBanHang ks = NhanVienBanHangView.inputData();
                    boolean not = this.nhanVienBanHangService.delete(ks.getMaNhanVien());
                    if (not){
                        System.out.println("Da duoi viec");
                    }else {
                        System.out.println(" khong duoi duoc ");
                    }
                    break;
                case FIND_STAFF:
                    System.out.println("tim NVBH trong cong Ty");
                    System.out.println("nhap ten NVBH");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    NhanVienBanHang found = nhanVienBanHangService.findById(name);
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
