package Demotapcode.zoo_tycoons.entity;

public  abstract class DongVat {
    private int maSo;
    private String name;
    private int namSinh;
    private int chuongNuoi;

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getChuongNuoi() {
        return chuongNuoi;
    }

    public void setChuongNuoi(int chuongNuoi) {
        this.chuongNuoi = chuongNuoi;
    }

    public DongVat(){
    }
    public DongVat(int maSo, String name,int namSinh,int chuongNuoi){
        this.maSo = maSo;
        this.name = name;
        this.namSinh = namSinh;
        this.chuongNuoi = chuongNuoi;
    }

}
