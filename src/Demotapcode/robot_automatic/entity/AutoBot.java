package Demotapcode.robot_automatic.entity;

public abstract class AutoBot {
    private  int id ;
    private String name;
    private int serial;
    private String brand;

    public AutoBot(){
    }

    public AutoBot(int id, String name, int serial, String brand) {
        this.id = id;
        this.name = name;
        this.serial = serial;
        this.brand = brand;
    }

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

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
