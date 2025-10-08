package Demotapcode.phamarcy_managerment.entity;

public class ThuocTiem extends Thuoc{
    private int lieuLuong;

    public ThuocTiem(){
    }
    public ThuocTiem(int maThuoc,String tenThuoc,int hanSuDung,String hangSanXuat){
        super(maThuoc, tenThuoc, hanSuDung, hangSanXuat);
    }

    public int getLieuLuong() {
        return lieuLuong;
    }

    public void setLieuLuong(int lieuLuong) {
        this.lieuLuong = lieuLuong;
    }

    public ThuocTiem(int maThuoc, String tenThuoc, int hanSuDung, String hangSanXuat, int lieuLuong) {
        super(maThuoc, tenThuoc, hanSuDung, hangSanXuat);
        this.lieuLuong = lieuLuong;
    }
    @Override
    public String toString() {
        return "ThuocTiem--{" +
                "=MaThuoc" + getMaThuoc() +
                "=TenThuoc" + getTenThuoc() +
                "=HSD" + getHanSuDung() +
                "=HSX" + getHangSanXuat() +
                "=LieuLuong=" + getLieuLuong() +
                "}--";
    }

    public String getInfoToCSV(){
        return getMaThuoc()+ ","+ getTenThuoc()+","+getHanSuDung()+","+getHangSanXuat()+","+lieuLuong;
    }
}
