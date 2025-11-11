package Demotapcode.game_online.entity;

public class ChienBinh extends NhanVat {

    private int dame;

    public ChienBinh() {
    }

    public ChienBinh(int id, String name, int dame) {

    }


    public int getDame() {
        return dame;
    }

    public void setDame(int dame) {
        if (dame < 0) {
            throw new IllegalArgumentException("DAME KO DUOC duoi 0");
        }
        this.dame = dame;
    }

    public ChienBinh(int id, String name, int lever, int healing) {
        super(id, name, lever, healing);
    }

    public ChienBinh(int id, String name, int lever, int healing, int dame) {
        super(id, name, lever, healing);
        if (dame <=0){
            throw  new IllegalArgumentException("dame ko < 0");
        }
        this.dame = dame;
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
