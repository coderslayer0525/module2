package Demotapcode.game_online.entity;

public abstract class NhanVat {
    private int id;
    private String name;
    private int lever;
    private int healing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public NhanVat(){
    }
    public NhanVat(int id, String name, int lever, int healing){
        this.id = id;
        this.name = name;
        this.lever = lever;
        this.healing = healing;
    }

}
