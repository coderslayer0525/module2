package Demotapcode.thi_module2.controller;

import Demotapcode.thi_module2.entity.HoaDon;
import Demotapcode.thi_module2.service.IHoaDonService;
import Demotapcode.thi_module2.service.HoaDonService;
import Demotapcode.thi_module2.view.HoaDonView;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class HoaDonController {
    private final IHoaDonService hoaDonService = new HoaDonService();

    public void displayMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);

        final int DISPLAY_LIST = 1;
        final int ADD_OB = 2;
        final int FIND_OB = 3;
        final int EDIT_OB = 4;
        final int DETAIL_OB = 5;
        final int BACK_MENU = 6;

        boolean flag = true;

        while (flag) {
            System.out.println("=====================================");
            System.out.printf("%-35s%n", "=== QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Chọn chức năng:");
            System.out.printf("| %-3s | %-25s |%n", "STT", "Tên chức năng");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-25s |%n", DISPLAY_LIST, "Hiển thị danh sách hóa đơn");
            System.out.printf("| %-3d | %-25s |%n", ADD_OB, "Thêm mới hóa đơn");
            System.out.printf("| %-3d | %-25s |%n", FIND_OB, "Tìm kiếm hóa đơn");
            System.out.printf("| %-3d | %-25s |%n", EDIT_OB, "Chỉnh sửa hóa đơn");
            System.out.printf("| %-3d | %-25s |%n", DETAIL_OB, "Xem chi tiết hóa đơn");
            System.out.printf("| %-3d | %-25s |%n", BACK_MENU, "Quay lại menu chính");
            System.out.println("=====================================");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY_LIST:
                    System.out.println("Danh sách hóa đơn tiền điện:");
                    List<HoaDon> hoaDonList = hoaDonService.findAll();
                    HoaDonView.display(hoaDonList);
                    break;
                case ADD_OB:
                    System.out.println("Thêm mới hóa đơn:");
                    HoaDon hoaDon = HoaDonView.inputData();
                    boolean ok = hoaDonService.add(hoaDon);
                    if (ok) {
                        System.out.println("Thêm hóa đơn thành công!");
                    } else {
                        System.out.println("Lỗi khi thêm hóa đơn!");
                    }
                    break;
                case FIND_OB:
                    System.out.println("Tìm kiếm hóa đơn theo mã:");
                    System.out.print("Nhập mã hóa đơn cần tìm: ");
                    String maTim = scanner.nextLine();
                    HoaDon found = hoaDonService.findById(maTim);
                    if (found != null) {
                        System.out.println("Tìm thấy hóa đơn:");
                        System.out.println(found);
                    } else {
                        System.out.println("Không tìm thấy hóa đơn!");
                    }
                    break;
                case EDIT_OB:
                    System.out.println("Chỉnh sửa thông tin hóa đơn:");
                    hoaDonService.update();
                    break;
                case DETAIL_OB:
                    System.out.println("Hiển thị chi tiết hóa đơn:");
                    hoaDonService.displayDetail();
                    break;
                case BACK_MENU:
                    System.out.println("Quay lại menu chính...");
                    flag = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
}