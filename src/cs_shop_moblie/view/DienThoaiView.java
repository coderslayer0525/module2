package cs_shop_moblie.view;

import cs_shop_moblie.entity.DienThoai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<DienThoai> dienThoaiList) {
        if (dienThoaiList.isEmpty()) {
            System.out.println("file Rong");
            return;
        }
        for (DienThoai dienThoai : dienThoaiList) {
            System.out.println(dienThoai);
        }
    }

    public static DienThoai inputData() {
        try {
            System.out.println("ID");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Imel");
            int imel = Integer.parseInt(sc.nextLine());

            System.out.println("Name");
            String Name = sc.nextLine();

            System.out.println("price");
            float Price = Integer.parseInt(sc.nextLine());

            System.out.println("batery0");
            int batery = Integer.parseInt(sc.nextLine());

            System.out.println("imge");
            int imge = Integer.parseInt(sc.nextLine());

            return new DienThoai(id, imel, Name, Price, batery, imge);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
