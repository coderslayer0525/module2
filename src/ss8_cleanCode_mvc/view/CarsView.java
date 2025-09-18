package ss8_cleanCode_mvc.view;
import ss8_cleanCode_mvc.entity.Cars;

import java.util.List;
import java.util.Scanner;

public class CarsView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<Cars> carsList) {
        if (carsList.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }
        for (Cars cars : carsList) {
            System.out.println(cars);
        }
    }

    public static Cars inputData() {
        try {
            System.out.println(" ID xe:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(" Model xe :");
            String model = sc.nextLine();

            System.out.println(" Nhap so ghe");
            int slot = Integer.parseInt(sc.nextLine());

            return new Cars(id, model, slot);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
