package Demotapcode.game_online.entity;

public class PhapSu extends NhanVat {
    private String phepThuat;

    public String getPhepThuat() {
        return phepThuat;
    }

    public void setPhepThuat(String phepThuat) {
        this.phepThuat = phepThuat;
    }

    public PhapSu() {
    }

    public PhapSu(int id, String name, int lever, int healing) {
        super(id, name, lever, healing);
    }

    public PhapSu(int id, String name, int lever, int healing, String phepThuat) {
        super(id, name, lever, healing);
        this.phepThuat = phepThuat;
    }

    @Override
    public String toString() {
        return "Phap Su --{" +
                "=ID=" + getId() +
                "=NAME= " + getName() +
                "=LEVER = " + getLever() +
                "=HEALING=" + getHealing() +
                "=SKILL=" + getPhepThuat() +
                "}--";
    }

    public String getInfoToCSV() {
        return getId() + "," + getName() + "," + getLever() + "," + getHealing() + "," + phepThuat;
    }
}
