package Demotapcode.thi_module2.entity;

import java.time.LocalDate;

public class HoaDon {
    private String maHoaDon;
    private KhachHang khachHang;
    private LocalDate ngayRaHoaDon;
    private int soLuong;
    private double donGia;
    private double thanhTien;

    public HoaDon(String maHoaDon, KhachHang khachHang, LocalDate ngayRaHoaDon, int soLuong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.khachHang = khachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = khachHang.tinhThanhTien(soLuong, donGia);
    }

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKhachHang, String tenKhachHang, double soDien, double donGia, double thanhTien) {

    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public LocalDate getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    @Override
    public String toString() {
        return "Hóa đơn{" +
                "Mã hóa đơn='" + maHoaDon + '\'' +
                ", Khách hàng=" + khachHang.getName() +
                ", Ngày lập=" + ngayRaHoaDon +
                ", Số lượng=" + soLuong +
                ", Đơn giá=" + donGia +
                ", Thành tiền=" + thanhTien +
                '}';
    }

    public Object getMaKhachHang() {
        return null;
    }

    public Object getTenKhachHang() {
            return null;
    }

    public double getSoDienTieuThu() {
        return 0;
    }

    public void setTenKhachHang(String ten) {

    }

    public void setSoDienTieuThu(double v) {

    }

    public void setDonGia(double v) {

    }

    public void setThanhTien(double v) {

    }

    public void setSoLuong(int i) {

    }
}