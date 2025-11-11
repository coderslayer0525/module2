package Demotapcode.Thuvien.entity;

public class LuanVan extends TaiLieu implements Comparable<LuanVan> {
    private static String Truong;
    private String NguoiHuongDan;

    public LuanVan() {
    }

    public LuanVan(int MaTaiLieu, String TenTaiLieu, int NamXuatBan, String TenTacGia) {
        super(MaTaiLieu, TenTaiLieu, NamXuatBan, TenTacGia);
    }

    public static String getTruong() {
        return Truong;
    }

    public static void setTruong(String truong) {
        Truong = truong;
    }

    public String getNguoiHuongDan() {
        return NguoiHuongDan;
    }

    public void setNguoiHuongDan(String nguoiHuongDan) {
        NguoiHuongDan = nguoiHuongDan;
    }

    public LuanVan(int MaTaiLieu, String TenTaiLieu, int NamXuatBan, String TenTacGia, String Truong, String NguoiHuongDan) {
        super(MaTaiLieu, TenTaiLieu, NamXuatBan, TenTacGia);
        this.Truong = Truong;
        this.NguoiHuongDan = NguoiHuongDan;
    }

    @Override
    public int compareTo(LuanVan luanVan) {
        return this.getMaTaiLieu() - luanVan.getMaTaiLieu();
    }

    @Override
    public String toString() {
        return "LuanVan{" +
                " MaTaiLieu=" + getMaTaiLieu() +
                " TenTaiLieu=" + getTenTaiLieu() +
                " NamXuatBan=" + getNamXuatBan() +
                " TacGia=" + getTenTacGia() +
                " Truong=" + getTruong() +
                " NguoiHuongDan=" + getNguoiHuongDan() +
                '}';

    }

    public String nextline() {
        return null;
    }
}
