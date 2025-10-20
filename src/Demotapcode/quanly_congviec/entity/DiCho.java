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
        return "DiCHo--{"+
                "-MaChiTieu"+getMaChiTieu()+
                "-TenChiTieu"+getTenChiTieu()+
                "-NgayChi"+getNgayChi()+
                "-SoTienChi"+getSoTienChi()+
                "-MoTa"+getMoTa()+
                "-CachThanhToan"+chuyenKhoan+
                "}--";
    }

    public String getInfoToCSV() {
        return getMaChiTieu()+","+getTenChiTieu()+","+getNgayChi()+","+getSoTienChi()+","+getMoTa()+","+chuyenKhoan;
    }
}
