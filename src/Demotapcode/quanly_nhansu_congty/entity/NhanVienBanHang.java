package Demotapcode.quanly_nhansu_congty.entity;

public class NhanVienBanHang extends NhanSu{
    private  int doanhSo;
    private  int hoaHong;

    public NhanVienBanHang(){
    }

    public  int getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(int doanhSo) {
        this.doanhSo = doanhSo;
    }

    public  int getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(int hoaHong) {
        this.hoaHong = hoaHong;
    }

    public NhanVienBanHang(int maNhanVien, String name, int namSinh,  int soDienThoai){
        super(maNhanVien, name, namSinh, soDienThoai);
    }
    public NhanVienBanHang(int maNhanVien, String name, int namSinh, int soDienThoai,int doanhSo,int hoaHong){
        super(maNhanVien, name, namSinh, soDienThoai);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    @Override
    public String toString(){
        return " NhanVienBanHang{"+
                " 'maNhanVien=" +getMaNhanVien() +
                " 'TenNhanVien=" +getName() +
                " 'NamSinh=" +getNamSinh() +
                " 'SoDienThoai=" +getSoDienThoai() +
                " 'DoanhSo="+getDoanhSo()+
                "  'HoaHong=" +getHoaHong() +
                '}';
    }

}
