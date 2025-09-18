package Demotapcode.Thuvien.entity;

public class TapChi  extends  TaiLieu implements Comparable<TapChi> {
    private int SoPhatHanh;
    private int ThangPhatHanh;

    public TapChi() {

    }

    public TapChi(int MaTaiLieu, String TenTaiLieu, int NamXuatBan, String TenTacGia) {
        super(MaTaiLieu, TenTaiLieu, NamXuatBan, TenTacGia);
    }

    public TapChi(int maTaiLieu, String tenTacGia, int soPhatHanh, int thangPhatHanh, int namXuatban) {

    }

    public int getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        ThangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        SoPhatHanh = soPhatHanh;
    }

    public TapChi(int MaTaiLieu, String TenTaiLieu, int NamXuatBan, String TenTacGia, int SoPhatHanh, int THangPhatHanh) {
        super(MaTaiLieu, TenTaiLieu, NamXuatBan, TenTacGia);
        this.SoPhatHanh = SoPhatHanh;
        this.ThangPhatHanh = THangPhatHanh;
    }

    @Override
    public int compareTo(TapChi tapChi) {
        return this.getMaTaiLieu() - tapChi.getMaTaiLieu();
    }

    @Override
    public String toString() {
        return "TapChi{" +
                " MaTaiLieu=" + getMaTaiLieu() +
                " TenTaiLieu=" + getTenTaiLieu() +
                " NamXuatBan=" + getNamXuatBan() +
                " TacGia=" + getTenTacGia() +
                " SoPhatHanh=" + getSoPhatHanh() +
                " ThangPhatHanh="+getThangPhatHanh()+
                '}';
    }

    public String nextline() {
        return null;
    }
}
