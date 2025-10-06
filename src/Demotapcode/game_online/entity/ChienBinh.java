package Demotapcode.game_online.entity;

public class ChienBinh extends NhanVat {

    private int dame;

    public ChienBinh() {
    }

    public ChienBinh(int id, String name, int dame) {

    }

    public ChienBinh(int id, String name, int suDung, String hsx, int theTich) {
    }

    public int getDame() {
        return dame;
    }

    public void setDame(int dame) {
        if (dame < 10) {
            throw new IllegalArgumentException("DAME KO DUOC duoi 10");
        }
        setDame(dame);
    }

    public ChienBinh(int id, String name, int lever, int healing) {
        super(id, name, lever, healing);
    }

    public ChienBinh(int id, String name, int lever, int healing, int dame) {
        super(id, name, lever, healing);
        if (dame <=10){
            throw  new IllegalArgumentException("dame ko < 0");
        }
        setDame(dame);
    }

    @Override
    public String toString() {
        return "ChienBinh-{" +
                "=ID=" + getId() +
                "=NAME=" + getName() +
                "=LEVER=" + getLever() +
                "=HEALING=" + getHealing() +
                "=DAME=" + getDame() +
                "}-";
    }

    public String getInfoToCSV() {
        return getId() + "," + getName() + "," + getLever() + "," + getHealing() + "," + dame;
    }
}
