package ss8_mvc_quanly_phuongtien.view;
import ss8_mvc_quanly_phuongtien.controller.CarsController;
import ss8_mvc_quanly_phuongtien.controller.TrucksController;
import ss8_mvc_quanly_phuongtien.controller.MotorbikesController;

import  java.util.Scanner;



public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void  displayMain(){
        CarsController carsController = new CarsController();
        TrucksController trucksController = new TrucksController();
        MotorbikesController motorbikesController = new MotorbikesController();
        Scanner sc = new Scanner(System.in);

        final int CARS = 1;
        final int TRUCKS = 2;
        final  int MOTORBIKES = 3;
        final  int EXIT_PROCESS = 4;
        boolean flag = true;
        while (flag){
            System.out.println("======================================");
            System.out.println("=                                    =");
            System.out.println("=             BÃI TẬP KẾT            =");
            System.out.println("=      THU GIỮ PHƯƠNG TIỆN VI PHẠM   =");
            System.out.println("=                                    =");
            System.out.println("======================================");
            System.out.println("   Loại Phương Tiện Đang Tim :"+
                    "\n 1. Xe oto. " +
                    "\n 2. Xe bán tải" +
                    "\n 3. Xe gắn máy." +
                    "\n 4. Thoát Chương trình");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case  CARS:
                    System.out.println("QUẢN LÝ XE OTO ");
                    carsController.displayMenu();
                    break;
                case TRUCKS:
                    System.out.println(" QUẢN LÝ XE BÁN TẢI");
                    trucksController.displayMenu();
                    break;
                case MOTORBIKES:
                    System.out.println(" QUẢN LÝ XE GẮN MÁY ");
                    motorbikesController.displayMenu();
                    break;
                case EXIT_PROCESS:
                    System.out.println("Exited");
                default:
                    flag = false;
            }
        }
    }
}

