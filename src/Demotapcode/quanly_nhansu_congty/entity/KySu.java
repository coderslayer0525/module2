package Demotapcode.quanly_nhansu_congty.entity;

public class KySu  extends NhanSu{
    private  String chuyenNganh;
    private  int bacKyThuat;

    public KySu(){
    }
    public KySu(int maNhanVien,String name,int namSinh,int soDienThoai){
        super(maNhanVien, name, namSinh, soDienThoai);
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
       this.chuyenNganh = chuyenNganh;
    }

    public  int getBacKyThuat() {
        return bacKyThuat;
    }

    public  void setBacKyThuat(int bacKyThuat) {
        this.bacKyThuat = bacKyThuat;
    }
    public KySu(int maNhanVien,String name,int namSinh, int soDienThoai,String chuyenNganh,int bacKyThuat){
        super(maNhanVien, name, namSinh, soDienThoai);
        this.chuyenNganh = chuyenNganh;
        this.bacKyThuat = bacKyThuat;
    }
    @Override
    public String toString(){
        return "KySu{"+
                "maNhanVien="+getMaNhanVien()+
                "TenNhanVien="+getName()+
                "NamSinh="+getNamSinh()+
                "SoDienThoai="+getSoDienThoai()+
                "ChuyenNganh="+getChuyenNganh()+
                "BacKyThuat="+getBacKyThuat()+
                '}';
    }
}
