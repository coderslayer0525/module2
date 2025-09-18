package cs_shop_moblie.entity;

public abstract  class SanPham {
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
    }
}
