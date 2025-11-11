package Demotapcode.quanly_nhansu_congty.view;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienBanHangView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<NhanVienBanHang> nhanVienBanHangArrayList){
        if (nhanVienBanHangArrayList.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }
        for (NhanVienBanHang nhanVienBanHang : nhanVienBanHangArrayList){
            System.out.println(nhanVienBanHang);
        }
    }
    public static NhanVienBanHang inputData(){
        try{
            System.out.println(" Ma Nhan vien");
            int maNhanVien = Integer.parseInt(sc.nextLine());

            System.out.println("Ten Nhan vien");
            String tenNhanVien = sc.nextLine();

            System.out.println(" Nam sinh ");
            int namSinh = Integer.parseInt(sc.nextLine());

            System.out.println("So Dien Thoai");
            int soDienThoai = Integer.parseInt(sc.nextLine());

            System.out.println("Doanh So");
            int doanhSo = Integer.parseInt(sc.nextLine());

            System.out.println("Hoa Hong ");
            int hoaHong = Integer.parseInt(sc.nextLine());

            return new NhanVienBanHang(maNhanVien,tenNhanVien,namSinh,soDienThoai,doanhSo,hoaHong);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
