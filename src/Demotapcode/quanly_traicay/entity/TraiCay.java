package Demotapcode.quanly_traicay.entity;

public abstract class TraiCay {
    private String tenTraiCay;
    private String loaiTraiCay;
    private int ngaySanXuat;
    private int hanSuDung;
    private String xuatXu;
    private int giaThanh;

    public TraiCay() {
    }

    public TraiCay(String tenTraiCay, String loaiTraiCay, int ngaySanXuat, int hanSuDung, String xuatXu, int giaThanh) {
        this.tenTraiCay = tenTraiCay;
        this.loaiTraiCay = loaiTraiCay;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.xuatXu = xuatXu;
        this.giaThanh = giaThanh;
    }


    public String getTenTraiCay() {
        return tenTraiCay;
    }

    public void setTenTraiCay(String tenTraiCay) {
        this.tenTraiCay = tenTraiCay;
    }

    public String getLoaiTraiCay() {
        return loaiTraiCay;
    }

    public void setLoaiTraiCay(String loaiTraiCay) {
        this.loaiTraiCay = loaiTraiCay;
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }
}
