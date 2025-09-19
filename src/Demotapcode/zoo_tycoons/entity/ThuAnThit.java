package Demotapcode.zoo_tycoons.entity;

public class ThuAnThit  extends DongVat{
    private  String thitYeuThich;

    public ThuAnThit(){
    }

    public String getThitYeuThich() {
        return thitYeuThich;
    }

    public void setThitYeuThich(String thitYeuThich) {
        this.thitYeuThich = thitYeuThich;
    }

    public ThuAnThit(int maSo, String name, int namSinh, int chuongNuoi){
        super(maSo, name, namSinh, chuongNuoi);
    }
    public ThuAnThit(int maso,String name, int namSinh,int chuongNuoi,String thitYeuThich){
        super(maso,name,namSinh,chuongNuoi);
        this.thitYeuThich = thitYeuThich;
    }
    @Override
    public String toString(){
        return "Thu an Thit {" +
                "Ma So=" + getMaSo() +
                "Ten=" + getName() +
                "Nam sinh=" + getNamSinh() +
                "Chuong nuoi=" + getChuongNuoi() +
                "Loai thit yeu thich =" + getThitYeuThich() +
                "}";
    }
}
