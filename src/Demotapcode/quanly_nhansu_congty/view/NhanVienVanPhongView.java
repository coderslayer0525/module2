package Demotapcode.quanly_nhansu_congty.view;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienVanPhongView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<NhanVienVanPhong> nhanVienVanPhongArrayList){
        if (nhanVienVanPhongArrayList.isEmpty()){
            System.out.println("danh sach trong");
            return;
        }
        for (NhanVienVanPhong nhanVienVanPhong : nhanVienVanPhongArrayList){
            System.out.println(nhanVienVanPhong);
        }
    }
    public static NhanVienVanPhong inputData(){
        try{
            System.out.println("Ma Nhan vien");
            int maNhanVien = Integer.parseInt(sc.nextLine());

            System.out.println("Ten Nhan vien");
            String tenNhanVien = sc.nextLine();

            System.out.println("nam Sinh");
            int namSinh = Integer.parseInt(sc.nextLine());

            System.out.println("So Dien Thoai");
            int soDienThoai = Integer.parseInt(sc.nextLine());

            System.out.println("So ngay Lam viec");
            int soNgayLamViec = Integer.parseInt(sc.nextLine());

            System.out.println("he so Luong");
            int heSoLuong = Integer.parseInt(sc.nextLine());

            return new NhanVienVanPhong(maNhanVien,tenNhanVien,namSinh,soDienThoai,soNgayLamViec,heSoLuong);
        }catch(NumberFormatException e){
            return null;
        }
    }
}
