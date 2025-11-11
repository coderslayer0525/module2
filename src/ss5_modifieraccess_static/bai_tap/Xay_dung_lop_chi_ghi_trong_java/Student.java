package ss5_modifieraccess_static.bai_tap.Xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = " jonh";
    private final String cl = "C02 ";

    public Student(){
    }
    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getCl(){
        return cl;
    }
}

