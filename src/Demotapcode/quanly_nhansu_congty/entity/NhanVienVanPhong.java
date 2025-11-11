package Demotapcode.quanly_nhansu_congty.entity;

public class NhanVienVanPhong extends NhanSu {
    private  int soNgayLamViec;
    private  int heSoLuong;

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(int maNhanVien, String name, int namSinh, int soDienThoai) {
        super(maNhanVien, name, namSinh, soDienThoai);
    }

    public  int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public  void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public  int getHeSoLuong() {
        return heSoLuong;
    }

    public  void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public NhanVienVanPhong(int maNhanVien, String name, int namSinh, int soDienThoai, int soNgayLamViec, int heSoLuong) {
        super(maNhanVien, name, namSinh, soDienThoai);
        this.soNgayLamViec = soNgayLamViec;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +
                "'MaNhanVien=" + getMaNhanVien() +
                "'TenNhanVien=" + getName() +
                "'NamSinh=" + getNamSinh() +
                "'SoDienThoai=" + getSoDienThoai() +
                "'SoNgayLamViec=" + getSoNgayLamViec() +
                "'HeSoLuong=" + getHeSoLuong() +
                '}';
    }
}
