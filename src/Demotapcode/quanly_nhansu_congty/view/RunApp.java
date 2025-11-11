package Demotapcode.quanly_nhansu_congty.view;

import Demotapcode.quanly_nhansu_congty.controller.KySuController;
import Demotapcode.quanly_nhansu_congty.controller.NhanVienBanHangController;
import Demotapcode.quanly_nhansu_congty.controller.NhanVienVanPhongController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        displayMain();
    }

    public static void displayMain() {
        KySuController kySuController = new KySuController();
        NhanVienBanHangController nhanVienBanHangController = new NhanVienBanHangController();
        NhanVienVanPhongController nhanVienVanPhongController = new NhanVienVanPhongController();

        Scanner scanner = new Scanner(System.in);

        final int KYSU = 1;
        final int NVBH = 2;
        final int NVVP = 3;
        final int EXIT_APP = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("QUAN LY NHAN SU");
            System.out.println(" Chon Lop Nhan su :" +
                    "\n 1. KY SU " +
                    "\n 2. Nhan Vien Ban Hang" +
                    "\n 3. Nhan Vien Van Phong" +
                    "\n 4. THoat .");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case KYSU:
                    System.out.println("Ky Su quan ly");
                    kySuController.displayMenu();
                    break;
                case NVBH:
                    System.out.println(" QUan ly may thang Ban hang");
                    nhanVienBanHangController.displayMenu();
                    break;
                case NVVP:
                    System.out.println(" may Thang Van Phong");
                    nhanVienVanPhongController.displayMenu();
                    break;
                case EXIT_APP:
                    System.out.println(" thoat ");
                default:
                    flag = false;
            }
        }
    }
}
