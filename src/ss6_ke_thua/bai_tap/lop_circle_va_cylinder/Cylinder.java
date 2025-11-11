package ss6_ke_thua.bai_tap.lop_circle_va_cylinder;

public class Cylinder extends Circle  {
    private double heigth;

    public Cylinder() {
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }
    public double getVolume(){
        return getArea()* heigth;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", height=" + heigth +
                ", volume=" + getVolume();
    }
}
