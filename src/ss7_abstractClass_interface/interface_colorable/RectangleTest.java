package ss7_abstractClass_interface.interface_colorable;

public class RectangleTest {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 6.6);
        System.out.println(rectangle);

        rectangle = new Rectangle(3.3, 6.6, "blackpink",true);
        System.out.println(rectangle);
    }
}
