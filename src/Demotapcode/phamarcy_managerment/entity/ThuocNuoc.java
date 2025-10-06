package Demotapcode.phamarcy_managerment.entity;

public class ThuocNuoc  extends  Thuoc{
    private int theTich;

    public ThuocNuoc(){
    }
    public ThuocNuoc(int maThuoc,String tenThuoc,int hanSuDung,String hangSanXuat){
        super(maThuoc,tenThuoc,hanSuDung,hangSanXuat);
    }

    public int getTheTich() {
        return theTich;
    }

    public void setTheTich(int theTich) {
        this.theTich = theTich;
    }

    public ThuocNuoc(int maThuoc, String tenThuoc, int hanSuDung, String hangSanXuat, int theTich) {
        super(maThuoc, tenThuoc, hanSuDung, hangSanXuat);
        this.theTich = theTich;
    }
    @Override
    public String toString(){
        return "ThuocNuoc--{" +
                "=ID="+ getMaThuoc()+
                "=TenThuoc="+getTenThuoc()+
                "=HanSuDung=" + getHanSuDung()+
                "=HangSanXuat=" + getHangSanXuat()+
                "=TheTich=" + getTheTich()+
                "}--";
    }

    public String getInfoToCSV() {
        return getMaThuoc()+","+getTenThuoc()+","+getHanSuDung()+","+getHangSanXuat()+","+getTheTich();
    }
}
