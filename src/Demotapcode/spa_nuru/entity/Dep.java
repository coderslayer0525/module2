package Demotapcode.spa_nuru.entity;

public class Dep extends KyThuatVien {

    private double danhGia;
    private int giaDichVu;

    public Dep(int maSo, String ngheDanh, boolean outTime,boolean working) {
        super(maSo, ngheDanh, outTime,working);
    }

    public Dep() {
    }

    public Dep(int maSo, String ngheDanh, boolean outTime,boolean working, double danhGia, int giaDichVu) {
        super(maSo, ngheDanh, outTime,working);
        this.danhGia = danhGia;
        this.giaDichVu = giaDichVu;
    }

    public Dep(String trim, String trim1, String trim2) {

    }

    public double getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(double danhGia) {
        this.danhGia = danhGia;
    }

    public int getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(int giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    @Override
    public String toString() {
        return
                "\n• maSo         : " + getMaSo() +
                "\n• Nghệ Danh    : " + getNgheDanh() +
                "\n• OT           : " + (outTime ? "co" : "Khong") +
                "\n• On a duty    : " + (working ? "co" : "khong") +
                "\n• Đanh Gia     : " + getDanhGia() +
                "\n• TIPS         : " + getGiaDichVu() +
                "\n------------------------------------------";
    }

    public String getInfoToCSV() {
        return getMaSo() + "," + getNgheDanh() + "," + outTime +","+ working + "," + getDanhGia() + "," + getGiaDichVu();
    }
}
