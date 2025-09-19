package Demotapcode.zoo_tycoons.entity;

public class Chim extends DongVat {
    private float saiCanh;
    private boolean noiChuyen;

    public Chim(){
    }
    public Chim(int maSo,String name,int namSinh, int chuongNuoi){
        super(maSo, name, namSinh, chuongNuoi);
    }

    public boolean isNoiChuyen() {
        return noiChuyen;
    }

    public void setNoiChuyen(boolean noiChuyen) {
        this.noiChuyen = noiChuyen;
    }

    public float getSaiCanh() {
        return saiCanh;
    }

    public void setSaiCanh(float saiCanh) {
        this.saiCanh = saiCanh;
    }

    public Chim(int maSo, String name, int namSinh, int chuongNuoi, float saiCanh, boolean noiChuyen){
        super(maSo, name, namSinh, chuongNuoi);
        this.saiCanh = saiCanh;
        this.noiChuyen = noiChuyen;

    }
    @Override
    public String toString(){
        return "Chim { "+
                "Ma So=" + getMaSo() +
                "Ten loai chim=" + getName() +
                "Nam sinh=" + getNamSinh() +
                "Chuong =" +  getChuongNuoi() +
                "Sai canh=" + getSaiCanh() +
                "Kha nang noi=" + noiChuyen +
                "}";
    }
}
