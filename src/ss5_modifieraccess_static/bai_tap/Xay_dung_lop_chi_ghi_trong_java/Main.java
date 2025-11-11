package ss5_modifieraccess_static.bai_tap.Xay_dung_lop_chi_ghi_trong_java;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getCl());
        Student student1 = new Student();
        System.out.println(student.getName());
        System.out.println(student.getCl());
    }
}
