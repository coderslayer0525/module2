package Demotapcode.thi_module2.entity;

public class KhachTay extends KhachHang{
    private String quocTich;

    public KhachTay() {
    }
    public KhachTay(String name,int maKhachHang,  String quocTich) {
        super(name,maKhachHang);
        this.quocTich=quocTich;
    }
    public KhachTay(String name, int maKhachHang) {
        super(name,maKhachHang);
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
}