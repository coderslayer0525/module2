package cs_shop_moblie.entity;

import java.io.Serializable;

    public class DienThoai  extends SanPham implements Comparable<DienThoai>, Serializable {
    private static final long serialVersionUID = 11;

    private int batery;
    private int imageSize;

    public DienThoai(){
    }
    public DienThoai(int id, int imel, String name, float price){
        super(id,imel,name,price);
    }

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }

    public DienThoai(int id, int imel, String name, float price, int batery, int imageSize){
        super(id, imel, name, price);
        this.batery = batery;
        this.imageSize = imageSize;
    }

    @Override
    public int compareTo(DienThoai o) {
        return Float.compare(this.getPrice(), o.getPrice());
    }
    @Override
    public String toString(){
        return "Dien Thoai-{"+
                "id=" + getId()+
                "imel="+getImel()+
                "Name="+getName()+
                "price="+getPrice()+
                "Batery="+batery+
                "imageSize"+imageSize+
                "}-";
    }
}
