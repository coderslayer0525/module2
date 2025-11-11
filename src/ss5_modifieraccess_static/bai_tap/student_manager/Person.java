package ss5_modifieraccess_static.bai_tap.student_manager;

public class Person {
    Student student = new Student() {
        @Override
        public int getId() {
            return student.getId();
        }
        @Override
        public String getName(){
            return student.getName();
        }
        @Override
        public Student clone() {
            return new Student(student.getId(), student.getName());
        }
    };

    public void ghostStudent() {
        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}