package Demotapcode.quanly_nhansu_congty.view;

import Demotapcode.quanly_nhansu_congty.entity.KySu;

import java.util.ArrayList;
import java.util.Scanner;

public class KySuView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<KySu> kySuArrayList) {
        if (kySuArrayList.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        for (KySu kySu : kySuArrayList) {
            System.out.println(kySu);
        }
    }
    public static KySu inputData(){
        try{
            System.out.println("Ma Nhan Vien");
            int maNhanVien = Integer.parseInt(sc.nextLine());

            System.out.println("Ten Nhan Vien");
            String tenNhanVien = sc.nextLine();

            System.out.println("Nam Sinh");
            int namSinh = Integer.parseInt(sc.nextLine());

            System.out.println("So Dien Thoai");
            int soDienThoai = Integer.parseInt(sc.nextLine());

            System.out.println("Chuyen nganh");
            String chuyenNganh = sc.nextLine();

            System.out.println("Bac Ky Thuat");
            int bacKyThuat = Integer.parseInt(sc.nextLine());


            return new KySu (maNhanVien,tenNhanVien,namSinh,soDienThoai,chuyenNganh,bacKyThuat);

            }catch (NumberFormatException e){
            return null;
        }
    }
}
