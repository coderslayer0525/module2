package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.entity.Motorbikes;
import ss8_cleanCode_mvc.repository.IMotorbikesRepository;
import ss8_cleanCode_mvc.service.IMotorbikesService;
import ss8_cleanCode_mvc.service.MotorbikesService;
import ss8_cleanCode_mvc.view.MotorbikesView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikesController {
    private IMotorbikesService motorbikesService= new MotorbikesService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        final int MOTORMAJOR = 1;
        final int ADDNEWOBJECT = 2;
        final int DELOBJECT = 3;
        boolean flag = true;
        while (flag){
            System.out.println("----Chuc nang vơi Motor<--- " +
                    "\n 1. Hiển thị danh sách xe may đang bị thu giữ : "+
                    "\n 2. Thêm xe vào bãi:" +
                    "\n 3. Xuất xe khỏi bãi:" +
                    "\n 4. Back to menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case MOTORMAJOR :
                    System.out.println("Danh sách xe đang bị luộc :");
                   List<Motorbikes> motorbikesList =this.motorbikesService.findAll();
                    MotorbikesView.display(motorbikesList);
                    break;
                case ADDNEWOBJECT:
                    System.out.println("Tiến hành siết xe.");
                        System.out.println("siết xong");
               break;
                case DELOBJECT:
                    System.out.println("Đang luộc phụ tùng xe máy.");
                    System.out.println("luộc xong");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
