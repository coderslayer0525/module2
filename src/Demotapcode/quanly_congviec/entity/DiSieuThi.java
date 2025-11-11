package Demotapcode.quanly_congviec.entity;

public class DiSieuThi extends ChiTieu implements Comparable<DiSieuThi> {
    private boolean chuyenKhoan;

    public boolean isChuyenKhoan() {
        return chuyenKhoan;
    }

    public void setChuyenKhoan(boolean chuyenKhoan) {
        this.chuyenKhoan = chuyenKhoan;
    }

    public DiSieuThi(boolean chuyenKhoan) {
        this.chuyenKhoan = chuyenKhoan;
    }

    public DiSieuThi() {
    }

    public DiSieuThi(int maChiTieu, String tenChiTieu, int ngayChi, int soTienChi, String moTa) {
        super(maChiTieu, tenChiTieu, ngayChi, soTienChi, moTa);
    }

    public DiSieuThi(int maChiTieu, String tenChiTieu, int ngayChi, int soTienChi, String moTa, boolean chuyenKhoan) {
        super(maChiTieu, tenChiTieu, ngayChi, soTienChi, moTa);
        this.chuyenKhoan = chuyenKhoan;
    }

    @Override
    public int compareTo(DiSieuThi o) {
        return this.getMaChiTieu() - o.getMaChiTieu();
    }

    @Override
    public String toString() {
        return  "\n╔════════════════════════════════════════╗" +
                "\n║                DiSieuThi               ║" +
                "\n╚════════════════════════════════════════╝" +
                "\n• Mã chi tiêu           : " + getMaChiTieu() +
                "\n• Tên chi tiêu          : " + getTenChiTieu() +
                "\n• Ngày chi              : " + getNgayChi() +
                "\n• Số tiền chi           : " + getSoTienChi() +
                "\n• Mô tả                 : " + getMoTa() +
                "\n• Chuyển khoản thanh toán : " + (chuyenKhoan ? "Co" : "khong") +
                "\n------------------------------------------";
    }

    public String getInfoToCSV() {
        return getMaChiTieu()+","+getTenChiTieu()+","+getNgayChi()+","+getSoTienChi()+","+getMoTa()+","+chuyenKhoan;
    }
}
