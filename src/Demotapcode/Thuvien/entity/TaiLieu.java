package Demotapcode.Thuvien.entity;

public abstract class TaiLieu {
    private int MaTaiLieu;
    private String TenTaiLieu;
    private int NamXuatBan;
    private String TenTacGia;

    public TaiLieu() {
    }

    public int getMaTaiLieu() {
        return MaTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        MaTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return TenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        TenTaiLieu = tenTaiLieu;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        NamXuatBan = namXuatBan;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public TaiLieu(int MaTaiLieu, String TenTaiLieu, int NamXuatBan, String TenTacGia){
        this.MaTaiLieu = MaTaiLieu;
        this.NamXuatBan = NamXuatBan;
        this.TenTaiLieu = TenTaiLieu;
        this.TenTacGia = TenTacGia;
    }
}
