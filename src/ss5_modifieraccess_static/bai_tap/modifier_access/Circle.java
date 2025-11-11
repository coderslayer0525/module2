package ss5_modifieraccess_static.bai_tap.modifier_access;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }
    public Circle(double r){
    this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

