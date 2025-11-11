package Demotapcode.spa_nuru.entity;

public abstract class KyThuatVien {
    private int maSo;
    private String ngheDanh;
    boolean outTime;
    boolean working;

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public boolean isOutTime() {
        return outTime;
    }

    public void setOutTime(boolean outTime) {
        this.outTime = outTime;
    }

    public KyThuatVien() {
    }

    public KyThuatVien(int maSo, String ngheDanh, boolean outTime,boolean working) {
        this.maSo = maSo;
        this.ngheDanh = ngheDanh;
        this.outTime = outTime;
        this.working = working;
    }
}
