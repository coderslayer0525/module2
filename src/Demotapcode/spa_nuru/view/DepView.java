package Demotapcode.spa_nuru.view;


import Demotapcode.spa_nuru.entity.Dep;

import java.util.List;
import java.util.Scanner;

public class DepView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<Dep> depList) {
        if (depList.isEmpty()) {
            System.out.println("Danh sách đang trống.");
            return;
        }
        System.out.println("┌─────────++─────────┐");
        System.out.println("│     TâyThy'Staff   │");
        System.out.println("└─────────++─────────┘");

        for (Dep dep : depList) {
            System.out.println(dep);
        }
    }

    public static Dep inputData() {
        try {
            System.out.println("Ma So NV :");
            int maSo = Integer.parseInt(sc.nextLine());

            System.out.println("Nghe Danh :");
            String name = sc.nextLine();

            System.out.println(" OT :?");
            String nhap = sc.nextLine().trim().toLowerCase();
            boolean outTime = nhap.equals("co");

            System.out.println("Working :?");
            String nhapVao = sc.nextLine().trim().toLowerCase();
            boolean workingVao = nhapVao.equals("co");

            System.out.println("danh Gia :");
            double rating = Double.parseDouble(sc.nextLine());

            System.out.println("Tips");
            int giaDichVu = Integer.parseInt(sc.nextLine());

            return new Dep(maSo, name, outTime, workingVao, rating, giaDichVu);

        } catch (NumberFormatException e) {
            return null;
        }
    }
}