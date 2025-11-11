package Demotapcode.phamarcy_managerment.entity;

public class ThuocVien extends Thuoc {
    private int soVien;

    public ThuocVien(){
    }
    public ThuocVien(int maThuoc,String tenThuoc,int hanSuDung, String hangSanXuat){
        super(maThuoc, tenThuoc, hanSuDung, hangSanXuat);
    }

    public int getSoVien() {
        return soVien;
    }

    public void setSoVien(int soVien) {
        this.soVien = soVien;
    }

    public ThuocVien(int maThuoc, String tenThuoc, int hanSuDung, String hangSanXuat, int soVien) {
        super(maThuoc, tenThuoc, hanSuDung, hangSanXuat);
        this.soVien = soVien;
    }
    @Override
    public String toString(){
        return "ThuocVien--{"+
                "=MaThuoc"+ getMaThuoc()+
                "=TenThuoc"+getTenThuoc()+
                "=HSD"+ getHanSuDung()+
                "=HSX"+ getHangSanXuat()+
                "=SoVien"+ getSoVien()+
                "}--";
    }
    public String getInfoToCSV() {
        return getMaThuoc() + "," + getTenThuoc() + "," + getHanSuDung() + "," + getHangSanXuat() + "," + soVien;
    }
}
