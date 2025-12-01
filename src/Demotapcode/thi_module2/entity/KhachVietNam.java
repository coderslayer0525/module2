package Demotapcode.thi_module2.entity;

public class KhachVietNam extends KhachHang{
    private String loaiKhach;
    private int dinhMucTieuThu;


    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public int getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(int dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public KhachVietNam() {

    }
public KhachVietNam(String name, int maKhachhang, String loaiKhach, int dinhMucTieuThu) {
        super(name,maKhachhang );
        this.loaiKhach = loaiKhach;
        this.dinhMucTieuThu = dinhMucTieuThu;

    }
    @Override
    public String toString() {
        return
                "Ten KHVN :" + getName()+
                "Ma KHVN :" + getMaKhachHang()+
                "Loai Khach :" + getLoaiKhach()+
                "Dinh Muc :" + getDinhMucTieuThu();


    }
    public String getInfoToCSV(){
        return getName()+ "," +  getMaKhachHang()+","+getLoaiKhach()+","+getDinhMucTieuThu();
    }
}

