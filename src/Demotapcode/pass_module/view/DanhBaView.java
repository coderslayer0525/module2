package Demotapcode.pass_module.view;

import Demotapcode.pass_module.entity.DanhBa;

import java.util.List;
import java.util.Scanner;

public class DanhBaView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<DanhBa> danhBaList) {
        if (danhBaList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        for (DanhBa danhBa : danhBaList) {
            System.out.println(danhBa);
        }
    }
    public static DanhBa inputData() {
        try {
            System.out.println("So Dien Thoai");
            int sdt = Integer.parseInt(sc.nextLine());

            System.out.println("Nhom danh ba");
            String nhom = sc.nextLine();

            System.out.println("Ho Ten");
            String hoTen;
            while (true){
                System.out.println("Nhap Ten:(Khoang Trang va viet hoa chu dau");
                hoTen=sc.nextLine().trim();
                if (!hoTen.matches("^[A-Za-z0-9\\- ]{2,50}$")){
                    System.out.println("Khong hop le :(vi du: Gia Nghiem");
                }else {
                    break;
                }
            }
            System.out.println("Gioi Tinh");
            String gt = sc.nextLine();


            System.out.println("Dia Chi");
           String diaChi = sc.nextLine();


            System.out.println("eMail");
            String sEmail= sc.nextLine();

            return new DanhBa(sdt,nhom,hoTen,gt,diaChi,sEmail);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
