package Demotapcode.quanly_traicay.entity;

public class DuaHau extends TraiCay {
    private int doNgot;

    public DuaHau() {
    }

    public DuaHau(String tenTraiCay, String loaiTraiCay, int ngaySanXuat, int hanSuDung, String xuatXu, int giaThanh) {
        super(tenTraiCay, loaiTraiCay, ngaySanXuat, hanSuDung, xuatXu, giaThanh);
    }

    public DuaHau(String tenTraiCay, String loaiTraiCay, int ngaySanXuat, int hanSuDung, String xuatXu, int giaThanh, int doNgot) {
        super(tenTraiCay, loaiTraiCay, ngaySanXuat, hanSuDung, xuatXu, giaThanh);
        this.doNgot = doNgot;
    }

    public int getDoNgot() {
        return doNgot;
    }

    public void setDoNgot(int doNgot) {
        this.doNgot = doNgot;
    }
    @Override
    public String toString(){
        return "DuaHau---{"+
                "=Ten=" + getTenTraiCay()+
                "=Loai=" +getLoaiTraiCay()+
                "=NSX="+ getNgaySanXuat()+
                "=HSD="+getHanSuDung()+
                "=XuatXu="+getXuatXu()+
                "=Gia="+getGiaThanh()+
                "=DoNgot="+getDoNgot()+
                "}---";
    }

    public String getInfoToCSV() {
        return getTenTraiCay()+","+getLoaiTraiCay()+","+getNgaySanXuat()+","+getHanSuDung()+","+getXuatXu()+","+getGiaThanh()+","+doNgot;
    }
}
