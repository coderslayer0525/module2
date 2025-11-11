package ss5_modifieraccess_static.bai_tap.student_manager;



import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    public  void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        boolean flag = true;
        while (flag){
            System.out.println("Quản lý sinh viên ");
            System.out.println("----- Chức năng ----- " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xóa" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case DISPLAY :
                    System.out.println(" --Chức năng hiển thị--");
                    Student[] students = this.studentManager.getAll();
                    for(Student student : students){
                        System.out.println(student);
                    }
                    break;
                case ADD :
                    System.out.println("--Them hoc sinh--");
                    System.out.println("nhap id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap ten");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    studentManager.add(student);
                    System.out.println(" them thanh cong");
                    break;
                case DELETE:
                    System.out.println(" xoa sinh vien");
                    System.out.println("nhap id hoc sinh muon xoa");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                     boolean yesDelete = studentManager.delete(deleteId);
                     if(yesDelete) {
                         System.out.println("xoa thanh cong");
                     }else {
                         System.out.println(" khong co Id  nay");
                     }
                    break;
                case SEARCH:
                    System.out.println(" tim kiem sinh vien");
                    System.out.println("nhap id sinh vien");
                    int findId = Integer.parseInt(scanner.nextLine());
                    Student findStudent = studentManager.findById(findId);
                    if(findStudent == null){
                        System.out.println(" không co id này");
                    }else {
                        System.out.println("id này là của sinh vien co tên : "+ findStudent);
                    }
                    break;
                default:
                    flag = false;

            }
        }
    }
}
