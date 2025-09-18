package Demotapcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for(int i = 0; i < 3; i++){
            students[i] = new Student();
            System.out.println("nhap thong tin sinh vien");
            System.out.println("ID");
            students[i].id= sc.nextInt();
            System.out.println("Age :");
            students[i].age = sc.nextInt();
            sc.nextLine();
            System.out.println("Name :");
            students[i].name = sc.nextLine();
        }
        System.out.println("\n Danh sach sinh vien");
        for(Student s : students){
            s.displayStudent();
        }
        sc.close();
    }
}
