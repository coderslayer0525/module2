package Demotapcode.thi_module2.entity;

public abstract class KhachHang {
    private String name;
    private int maKhachHang;



    public KhachHang() {
    }
    public  KhachHang(String name, int maKhachHang) {
        this.name = name;
        this.maKhachHang = maKhachHang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public double tinhThanhTien(int soLuong, double donGia) {
        return 0;
    }
}
