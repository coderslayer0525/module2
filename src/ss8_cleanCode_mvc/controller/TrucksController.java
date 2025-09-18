package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.entity.Cars;
import  ss8_cleanCode_mvc.entity.Trucks;
import ss8_cleanCode_mvc.service.CarsService;
import ss8_cleanCode_mvc.service.ICarsService;
import ss8_cleanCode_mvc.service.ITrucksService;
import ss8_cleanCode_mvc.service.TrucksService;
import ss8_cleanCode_mvc.view.CarsView;
import ss8_cleanCode_mvc.view.TrucksView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TrucksController {
    private ITrucksService trucksService = new TrucksService();

    public void displaymenu() {
        Scanner sc = new Scanner(System.in);
        final int DISPLAYOPPTIONS = 1;
        final int ADDTRUCK = 2;
        final int REMOVETRUCK = 3;
        boolean okok = true;
        while (okok) {
            System.out.println("-<LỚP XE truck >- ");
            System.out.println("CHọn chức năng :" +
                    "\n 1. Danh sach xe đang trong bãi:" +
                    "\n 2. Thêm xe vào bãi : " +
                    "\n 3. Xuất xe khỏi bãi : " +
                    "\n 4. Quay lại bản quản ly chính. ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAYOPPTIONS:
                    System.out.println("Danh sách xe đang bị thu giữ :");
                    List<Trucks> trucksList = this.trucksService.findAll();
                    TrucksView.display((ArrayList<Trucks>) trucksList);
                    break;
                case ADDTRUCK:
                    System.out.println("Thêm xe vào bãi.");
                    Trucks trucks = TrucksView.inputData();
                    boolean isSucess = this.trucksService.add(trucks);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                        break;
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVETRUCK:
                    System.out.println("-Xuất xe ra bãi.");
                    Trucks trucks1 = TrucksView.inputData();
                    boolean isOk = this.trucksService.delete(trucks1.getId());
                    if (isOk) {
                        System.out.println(" Xoa thanh cong ");
                    } else {
                        System.out.println(" khong the tim thay thong tin cua xe");
                    }

                    break;
                default:
                    okok = false;
            }
        }
    }

    public void displayMenu() {

    }
}
