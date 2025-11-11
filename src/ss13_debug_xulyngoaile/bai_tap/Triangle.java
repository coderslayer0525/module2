package ss13_debug_xulyngoaile.bai_tap;

class Triangle {
    private double a;
    private double  b;
    private double  c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Phải lớn hơn 0");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException(" Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        if(a + b > c || a + c > b || b + c > a){
            System.out.println(" đây là 1 tam giác");
        }
    }

    public void display() {
        System.out.println("Chính xác là 1 tam giác :D :D");
    }
}
