package Demotapcode.robot_automatic.entity;

public class ServiceRobot extends AutoBot{
    private String duty;

    public ServiceRobot() {
    }

    public ServiceRobot(int id,String name,int serial,String brand) {
        super(id, name, serial, brand);
    }
    public ServiceRobot(int id,String name,int serial,String brand,String duty){
        super(id, name, serial, brand);
        this.duty = duty;

    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    @Override
    public String toString(){
        return "RobotS---{"+
                "=ID"+ getId() +
                "=Name"+getName()+
                "=Serial"+getSerial()+
                "=Brand" + getBrand()+
                "=Duty"+getDuty()+
                "}---";
    }
}
