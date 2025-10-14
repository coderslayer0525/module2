package Demotapcode.robot_automatic.entity;

public class EntertainmentRobots extends AutoBot{
    private String skill;

    public EntertainmentRobots(){

    }
    public EntertainmentRobots(int id,String name, int serial,String brand) {
        super(id, name, serial, brand);
    }
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    public EntertainmentRobots(int id,String name, int serial,String brand,String skill){
        super(id,name,serial,brand);
        this.skill = skill;
    }
    @Override
    public String toString(){
        return "RobotE--{"+
                "=ID"+ getId() +
                "=Name"+getName()+
                "=Serial"+getSerial()+
                "=Brand" + getBrand()+
                "=Skill"+getSkill()+
                "}---";

    }

    public String getInfoToCSV() {
        return getId()+","+getName()+","+getSerial()+","+getBrand()+","+skill;
    }
}
