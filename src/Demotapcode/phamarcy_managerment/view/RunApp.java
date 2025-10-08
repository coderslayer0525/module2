package Demotapcode.phamarcy_managerment.view;

import Demotapcode.phamarcy_managerment.controller.ThuocNuocController;
import Demotapcode.phamarcy_managerment.controller.ThuocTiemController;
import Demotapcode.phamarcy_managerment.controller.ThuocVienController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {

        displayMain();

    }

    public static void displayMain() {
        ThuocNuocController thuocNuocController = new ThuocNuocController();
        ThuocVienController thuocVienController = new ThuocVienController();
        ThuocTiemController thuocTiemController = new ThuocTiemController();


        Scanner sc = new Scanner(System.in);
        final int THUOCNUOC = 1;
        final int THUOCVIEN = 2;
        final int THUOCTIEM = 3;
        final int EXIT_PROCESS = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("======================================");
            System.out.println("=        GIA NGHIEM PHAMARCY         =");
            System.out.println("=          -The loai Thuoc-          =");
            System.out.println("=              <GNPMCY>              =");
            System.out.println("======================================");
            System.out.println(" " +
                    "\n 1. Lớp Thuoc Nuoc" +
                    "\n 2. Lớp Thuoc Vien." +
                    "\n 3. Lớp Thuoc Tiem." +
                    "\n 4. Thoát Chương trình");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case THUOCNUOC:
                    System.out.println("Quản lý Thuốc nuước. ");
                    thuocNuocController.displayMenu();
                    break;
                case THUOCVIEN:
                    System.out.println(" Quản lý Thuốc Vien.");
                    thuocVienController.displayMenu();
                    break;
                case THUOCTIEM:
                    System.out.println(" Quản lý Thuoc TIem ");
                    thuocTiemController.displayMenu();
                    break;
                case EXIT_PROCESS:
                    System.out.println("Exited");
                default:
                    flag = false;
            }
        }
    }
}
