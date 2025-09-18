package ss8_cleanCode_mvc.entity;

public class Trucks extends Vehicles implements Comparable<Trucks> {
    public static String brand = " OE OE OE";
    public int id;
    public double ranger;

    public Trucks() {
    }

    public Trucks(int id, String model, double ranger) {
        super(id, model);
        this.ranger = ranger;
    }

    public Trucks(int id, String brand, int ranger) {
        super(id, brand);
    }

    public Trucks(int id, int ranger, String model) {

    }

    public double getRanger() {
        return ranger;
    }

    public void setRanger(double ranger) {
        this.ranger = ranger;
    }

    @Override
    public int compareTo(Trucks o) {
        return this.getId() - o.getId();
    }

    @Override
    public Object getInfoToCSV() {
        return this.getModel() + "," + this.getId() + "," + this.getRanger() + ",";
    }
    @Override
    public String toString(){
        return "Trucks{"+
                "id="+getId()+
                ",model="+getModel()+
                ",ranger="+getRanger()+
                '}';
}
}