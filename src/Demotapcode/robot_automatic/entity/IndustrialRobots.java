package Demotapcode.robot_automatic.entity;

public class IndustrialRobots extends AutoBot {
    private int efficiency;

    public IndustrialRobots(){
    }
    public IndustrialRobots(int id,String name, int serial, String brand,int efficiency){
        super(id, name, serial, brand);
        this.efficiency = efficiency;

    }
    public IndustrialRobots(int id,String name, int serial, String brand){
        super(id, name, serial, brand);
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
    @Override
    public String toString(){
        return "RobotI--{"+
                "=ID"+ getId() +
                "=Name"+getName()+
                "=Serial"+getSerial()+
                "=Brand" + getBrand()+
                "=Effic"+getEfficiency()+
                "}---";

    }
}
