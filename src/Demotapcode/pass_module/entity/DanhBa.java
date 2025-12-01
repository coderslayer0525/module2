package Demotapcode.pass_module.entity;

public class DanhBa {
    private int soDienThoai;
    private String nhomDanhBa;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String eMail;

    public DanhBa() {
    }

    public DanhBa(int soDienThoai, String nhomDanhBa, String hoTen, String gioiTinh, String diaChi, String eMail) {
        this.soDienThoai = soDienThoai;
        this.nhomDanhBa = nhomDanhBa;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.eMail = eMail;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return  "\n╔════════════════════════════════════════╗" +
                "\n║                Danh Ba VN              ║" +
                "\n╚════════════════════════════════════════╝" +
                "\n• Số Điện Thoại         : " + getSoDienThoai() +
                "\n• Nhóm Danh Bạ          : " + getNhomDanhBa() +
                "\n• Họ tên                : " + getHoTen() +
                "\n• Giới tính             : " + getGioiTinh() +
                "\n• Địa chỉ               : " + getDiaChi() +
                "\n• EMail                 : " + geteMail() +
                "\n------------------------------------------";
    }
    public String getInfoToCSV() {
        return getSoDienThoai()+","+getNhomDanhBa()+","+getHoTen()+","+getGioiTinh()+","+getDiaChi()+","+geteMail();
    }
}

