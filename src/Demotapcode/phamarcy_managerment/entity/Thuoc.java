package Demotapcode.phamarcy_managerment.entity;

public abstract class Thuoc {
    private int maThuoc;
    private String tenThuoc;
    private  int hanSuDung;
    private String hangSanXuat;

    public int getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Thuoc(){
    }
    public Thuoc(int maThuoc,String tenThuoc,int hanSuDung,String hangSanXuat){
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.hanSuDung = hanSuDung;
        this.hangSanXuat = hangSanXuat;
    }
}
