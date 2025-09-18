package cs_shop_moblie.controller;

import cs_shop_moblie.entity.DienThoai;
import cs_shop_moblie.service.DienThoaiService;
import cs_shop_moblie.service.IDienThoaiService;
import cs_shop_moblie.view.DienThoaiView;

import java.util.ArrayList;
import java.util.Scanner;

public class DienThoaicontroller {
    private  final IDienThoaiService dienThoaiService= new DienThoaiService();

    public void displayMenu(){

        Scanner sc = new Scanner(System.in);
        final int DISPLAY_MOBILIST = 1;
        final  int ADD_NEWMOBI = 2;
        final  int DEL_MOBI = 3;
        final int FN_IP = 4;
        final  int BACK = 5;
         boolean flag = true;
         while (flag){
             System.out.println("");
             System.out.println("Chon hanh dong voi dien thoai" +
                     "\n 1. Danh sach dien thoai co trong shop" +
                     "\n 2. Them may dien thoai moi vao shop" +
                     "\n 3. Thanh ly Dien thoai" +
                     "\n 4. Tim Dien thoai trong kho" +
                     "\n 5. Quay lai Menu chinh");
             int choice = Integer.parseInt(sc.nextLine());
             switch (choice){
                 case DISPLAY_MOBILIST :
                     System.out.println("Danh sach dang hien thi");
                     ArrayList<DienThoai> dienThoaiArrayList = this.dienThoaiService.findAll();
                     DienThoaiView.display(dienThoaiArrayList);
                 case ADD_NEWMOBI:
                     System.out.println(" Nhâp thêm máy vào  cửa hàng");
                     DienThoai dienThoai =DienThoaiView.inputData();
                     boolean isOk = this.dienThoaiService.add(dienThoai);
                     if (isOk){
                         System.out.println("da theem");
                     }else {
                         System.out.println("ERROR");
                     }
                     break;
                 case DEL_MOBI:
                     System.out.println("Thanh ly dien thoai trong kho");
                     DienThoai dienThoai1 = DienThoaiView.inputData();
                     boolean okok = this.dienThoaiService.delete(dienThoai1.getImel());
                     if (okok){
                         System.out.println(" thanh ly thanh cong");
                     }else {
                         System.out.println("ko tim thay Imel cua DT can tim");

                     }
                     break;
                 case FN_IP:
                     System.out.println("nhap thong tin may can tim");
                     DienThoai dienThoai2 = DienThoaiView.inputData();
                     break;
                 case BACK:
                     System.out.println(" quay lai trang quan ly");

                     }
             }
         }
    }

