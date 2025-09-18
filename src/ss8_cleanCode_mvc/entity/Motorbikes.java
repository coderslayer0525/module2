package ss8_cleanCode_mvc.entity;

public  class Motorbikes extends Vehicles implements Comparable<Motorbikes>{
    public static String brand = " BO BO BO";
    public int id;
    public double power;

    public Motorbikes(){
    }
    public Motorbikes(int id){
        super(id);
    }

    @Override
    public Object getInfoToCSV() {
        return this.getModel()+","+ this.getId()+",";
    }

    public Motorbikes(int id, String model,double power){
        super(id,model);
        this.power = power;
    }
    public Motorbikes(int id, String brand, int power){
        super(id,brand);
    }
    public double getPower(){
        return power;
    }
    public void setPower(double power){
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Motorbikes o) {
        return this.getId() - o.getId();
    }
    @Override
    public String toString(){
        return "Motor{" +
                "id="+ getId() +
                ",model="+getModel()+
                ", power="+ getPower()+
                '}';
    }
}
