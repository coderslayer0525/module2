package cs_shop_moblie.entity;

public class DienThoai  extends SanPham implements Comparable<DienThoai>{
    private int batery;
    private int imageSize;

    public DienThoai(){
    }
    public DienThoai(int id, int imel, String name, float price){
        super(id,imel,name,price);
    }
    public DienThoai(int batery, int imageSize){
        this.batery = batery;
        this.imageSize = imageSize;
    }

    @Override
    public int compareTo(DienThoai o) {
        return 0;
    }
}
