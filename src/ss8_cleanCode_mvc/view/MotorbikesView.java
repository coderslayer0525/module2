package ss8_cleanCode_mvc.view;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.List;
import java.util.Scanner;

public class MotorbikesView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(List<Motorbikes> motorbikesArrayList) {
        for (Motorbikes motorbikes : motorbikesArrayList) {
            System.out.println(motorbikes);
        }
    }

    public static Motorbikes inputData() {
        System.out.println("số khung xe máy");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("model xe ");
        String model = scanner.nextLine();
        System.out.println(" xé gió không ");
        int power = Integer.parseInt(scanner.nextLine());
        Motorbikes motorbikes = new Motorbikes(id, model, power);
        return motorbikes;
    }

    public static void display(Motorbikes motorbikes) {
        System.out.println(motorbikes);
    }
}
