package Demotapcode.quanly_congviec.entity;

public class DiCho extends  ChiTieu {
    private boolean chuyenKhoan;

    public DiCho() {
    }

    public DiCho(int maChiTieu, String tenChiTieu, int ngayChi, int soTienChi, String moTa) {
        super(maChiTieu, tenChiTieu, ngayChi, soTienChi, moTa);
    }

    public DiCho(int maChiTieu, String tenChiTieu, int ngayChi, int soTienChi, String moTa, boolean chuyenKhoan) {
        super(maChiTieu, tenChiTieu, ngayChi, soTienChi, moTa);
        this.chuyenKhoan = chuyenKhoan;
    }
    @Override
    public String toString(){
        return  "\n╔════════════════════════════════════════╗" +
                "\n║               DiCho Info               ║" +
                "\n╚════════════════════════════════════════╝" +
                "\n• Mã chi tiêu           : " + getMaChiTieu() +
                "\n• Tên chi tiêu          : " + getTenChiTieu() +
                "\n• Ngày chi              : " + getNgayChi() +
                "\n• Số tiền chi           : " + getSoTienChi() +
                "\n• Mô tả                 : " + getMoTa() +
                "\n• Chuyển khoản thanh toán : " + (chuyenKhoan ? "True" : "false") +
                "\n------------------------------------------";
    }

    public String getInfoToCSV() {
        return getMaChiTieu()+","+getTenChiTieu()+","+getNgayChi()+","+getSoTienChi()+","+getMoTa()+","+chuyenKhoan;
    }
}
