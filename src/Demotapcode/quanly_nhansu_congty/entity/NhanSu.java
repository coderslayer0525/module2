package Demotapcode.quanly_nhansu_congty.entity;

public abstract class NhanSu {
    private int maNhanVien;
    private String name;
    private int namSinh;
    private int soDienThoai;

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public NhanSu() {
    }

    public NhanSu(int maNhanVien, String name, int namSinh, int soDienThoai) {
        this.maNhanVien = maNhanVien;
        this.name = name;
        this.namSinh = namSinh;
        this.soDienThoai = soDienThoai;

    }

}
