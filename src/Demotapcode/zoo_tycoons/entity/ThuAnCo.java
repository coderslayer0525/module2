package Demotapcode.zoo_tycoons.entity;

public class ThuAnCo extends DongVat{
    private String loaiRau;

    public String getLoaiRau() {
        return loaiRau;
    }

    public void setLoaiRau(String loaiRau) {
        this.loaiRau = loaiRau;
    }

    public ThuAnCo(){

    }
    public ThuAnCo(int maSo, String name, int namSinh, int chuongNuoi){
        super(maSo, name, namSinh, chuongNuoi);
    }
    public ThuAnCo(int maSo, String name, int namSinh, int chuongNuoi,String loaiRau){
        super(maSo, name, namSinh, chuongNuoi);
        this.loaiRau = loaiRau;

    }
    @Override
    public String toString(){
        return "Thu An Co{" +
                "maSo=" + getMaSo() +
                "Ten loai thu=" + getName() +
                " Nam Sinh =" + getNamSinh()+
                " Chuong=" + getChuongNuoi() +
                " Loai co thich an=" + getLoaiRau() +
                "}";

    }

}
