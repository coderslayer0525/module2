package cs_shop_moblie.entity;

import java.io.Serializable;

public abstract  class SanPham implements Serializable {
    private int id;
    private int imel;
    private String name;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImel() {
        return imel;
    }

    public void setImel(int imel) {
        this.imel = imel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public SanPham(){
    }

    public SanPham(int id, int imel, String name, float price){
        this.id = id;
        this.imel = imel;
        this.name = name;
        this.price = price;
    }
}
