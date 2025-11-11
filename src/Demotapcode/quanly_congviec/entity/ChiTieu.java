package Demotapcode.quanly_congviec.entity;

import java.time.LocalDate;

public abstract class ChiTieu {
    private int maChiTieu;
    private String tenChiTieu;
    private int ngayChi;
    private int soTienChi;
    private String moTa;

    public ChiTieu() {
    }

    public ChiTieu(int maChiTieu, String tenChiTieu, int ngayChi, int soTienChi, String moTa) {
        this.maChiTieu = maChiTieu;
        this.tenChiTieu = tenChiTieu;
        this.ngayChi = ngayChi;
        this.soTienChi = soTienChi;
        this.moTa = moTa;
    }

    public int getMaChiTieu() {
        return maChiTieu;
    }

    public void setMaChiTieu(int maChiTieu) {
        this.maChiTieu = maChiTieu;
    }

    public String getTenChiTieu() {
        return tenChiTieu;
    }

    public void setTenChiTieu(String tenChiTieu) {
        this.tenChiTieu = tenChiTieu;
    }

    public int getNgayChi() {
        return ngayChi;
    }

    public void setNgayChi(int ngayChi) {
        this.ngayChi = ngayChi;
    }

    public int getSoTienChi() {
        return soTienChi;
    }

    public void setSoTienChi(int soTienChi) {
        this.soTienChi = soTienChi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
