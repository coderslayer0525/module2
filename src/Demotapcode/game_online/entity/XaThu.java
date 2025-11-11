package Demotapcode.game_online.entity;

public class XaThu extends NhanVat {
    private int rangeShot;

    public XaThu() {
    }


    public int getRangeShot() {
        return rangeShot;
    }

    public void setRangeShot(int rangeShot) {
        this.rangeShot = rangeShot;
    }

    public XaThu(int id, String name, int lever, int healing, int rangeShot) {
        super(id, name, lever, healing);
        this.rangeShot = rangeShot;
    }

    @Override
    public String toString() {
        return "Xa Thu--{" +
                "=ID=" + getId() +
                "=TEN=" + getName() +
                "=LEVER=" + getLever() +
                "=HEAL=" + getHealing() +
                "=RANGESHOT=" + getRangeShot() +
                "}--";
    }

    public String getInfoToCSV() {
        return getId() + "," + getName() + "," + getLever() + "," + getHealing() + "," + rangeShot;

    }
}
