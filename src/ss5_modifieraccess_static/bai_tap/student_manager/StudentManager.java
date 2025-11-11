package ss5_modifieraccess_static.bai_tap.student_manager;

public class StudentManager {
    private static Student[] studentList = new Student[10];

    static {
        Student student1 = new Student(1, "Nghiem");
        Student student2 = new Student(2, "Thoi");
        Student student3 = new Student(3, "Thanh");
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
    }

    public Student[] getAll() {
        int count = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                count++;
            } else {
                break;
            }
        }
        Student[] students = new Student[count];
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                students[i] = studentList[i];
            } else {
                break;
            }
        }
        return students;
    }

    public void add(Student student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public boolean delete(int delId) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].getId() == delId) {
                for (int x = i; x < studentList.length - 1; x++) {
                    studentList[x] = studentList[x + 1];
                }
                return true;
            }
        }
        return false;
    }

    public Student findById(int id) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                if (studentList[i].getId() == id) {
                    return studentList[i];
                }
            }
        }
        return null;
    }
}