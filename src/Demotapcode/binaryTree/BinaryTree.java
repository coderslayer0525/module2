package Demotapcode.binaryTree;

class NhanVien {
    String ten;
    NhanVien trai, phai;

    NhanVien(String ten) {
        this.ten = ten;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Giam Doc");
        nhanVien.trai = new NhanVien("quan ly A");
        nhanVien.phai = new NhanVien("quan ly B");

        nhanVien.trai.trai = new NhanVien("Nhan Vien 1");
        nhanVien.phai.phai = new NhanVien("Nhan Vien 4");
        nhanVien.phai.trai = new NhanVien("Nhan Vien 3");
        nhanVien.trai.phai = new NhanVien("Nhan Vien 2");

        System.out.println("Goc Cay:" + nhanVien.ten);
        System.out.println("con Trai:" + nhanVien.trai.ten);
        System.out.println("con phai:" + nhanVien.phai.ten);
        System.out.println("con1:" + nhanVien.trai.trai.ten);
        System.out.println("con2:" + nhanVien.trai.phai.ten);
        System.out.println("con3:" + nhanVien.phai.trai.ten);
        System.out.println("con4:" + nhanVien.phai.phai.ten);

    }
}
