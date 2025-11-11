package Demotapcode.Thuvien.entity;

public class Sach extends TaiLieu implements Comparable<Sach> {
    private static int soTrang;
    private String theLoai;

    public Sach(){
    }
    public Sach(int MaTaiLieu,String TenTaiLieu,int NamXuatBan,String TenTacGia){
        super(MaTaiLieu,TenTaiLieu,NamXuatBan,TenTacGia);
    }

    public static int getSoTrang() {
        return soTrang;
    }

    public static void setSoTrang(int soTrang) {
        Sach.soTrang = soTrang;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Sach(int MaTaiLieu, String TenTaiLieu, int NamXuatBan, String TenTacGia, int SoTrang, String TheLoai){
        this(MaTaiLieu,TenTaiLieu,NamXuatBan,TenTacGia);
        this.soTrang = SoTrang;
        this.theLoai = TheLoai;
    }

    @Override
    public int compareTo(Sach sach) {
        return this.getMaTaiLieu() - sach.getMaTaiLieu();
    }
    @Override
    public String toString(){
        return "Sach{" +
                "MaTaiLieu=" + getMaTaiLieu()+
                ", TenTaiLieu="+getTenTaiLieu()+
                ", NamXuatBan="+getNamXuatBan()+
                ", TenTacGia="+getTenTacGia()+
                " SoTrang="+getSoTrang()+
                " TheLoai="+getTheLoai()+
                '}';
    }

    public String nextline() {
        return null;
    }
}
