package ss8_cleanCode_mvc.entity;

import java.util.Objects;

public class Cars extends Vehicles implements Comparable<Cars> {
    private static String BRAND = " BỘ CÔNG NÔNG";
    private int slot;

    public Cars() {
    }

    public Cars(int id) {
        super(id);

    }

    public Cars(int id, String model) {
        super(id, model);
    }
    public Cars(int id , String model, int slot) {
        this(id, model);
        setSlot(slot);
    }
    public static String getBRAND(){
        return BRAND;
    }
    public  int getSlot(){
        return slot;
    }
    public void setSlot(int slot){
        if (slot<0){
            throw new IllegalArgumentException("slot khong dc am");
        }
        this.slot = slot;
    }

    @Override
    public String getInfoToCSV() {
        return getId() +","+ getModel()+","+slot;
    }

    public boolean equals(Object v){
       if (this == v) return  true;
       if (!(v instanceof Cars)) return false;
       Cars cars =(Cars) v;
       return getId() == cars.getId()
               && v.equals(getModel());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel());
    }



    @Override
    public int compareTo(Cars cars) {
        return this.getId() - cars.getId();
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + getId() +
                ", model="+getModel()+
                ", slot=" + getSlot() +
                '}';
    }
}

