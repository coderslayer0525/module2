package ss8_cleanCode_mvc.entity;

public abstract  class Vehicles {
    private int id ;
    private String model;

    public Vehicles(){

    }

    public Vehicles(int id, String model){
        this.id = id;
        this.model = model;
    }
    public Vehicles(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public abstract Object getInfoToCSV();
    @Override
    public String toString(){
        return
                "id=" + id +
                        ", model'"+ model;
    }
}
