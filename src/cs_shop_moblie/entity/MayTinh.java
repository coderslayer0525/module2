package cs_shop_moblie.entity;

public class MayTinh extends SanPham implements Comparable<MayTinh>{
    private String CPU;
    private int ramCard;

    public MayTinh(){
    }

    public MayTinh(int id, int imel, String name, float price) {
        super(id, imel, name, price);
    }
    public MayTinh(String CPU, int ramCard){
       this.CPU = CPU;
       this.ramCard = ramCard;
    }


    @Override
    public int compareTo(MayTinh o) {
        return 0;
    }
}
