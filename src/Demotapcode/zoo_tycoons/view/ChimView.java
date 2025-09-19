package Demotapcode.zoo_tycoons.view;

import Demotapcode.zoo_tycoons.entity.Chim;

import java.util.ArrayList;
import java.util.Scanner;

public class ChimView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<Chim> chimArrayList){
        if (chimArrayList.isEmpty()){
            System.out.println(" khong co chim");
            return;
        }
        for (Chim chim : chimArrayList){
            System.out.println(chim);
        }
    }
    public static Chim inputData(){
        Scanner scanner1 = new Scanner(System.in);
        try{
            System.out.println("Ma Chim");
            int maSo = Integer.parseInt(scanner.nextLine());

            System.out.println("Ten Chim");
            String tenChim = scanner.nextLine();

            System.out.println("Nam Sinh");
            int namSinh = Integer.parseInt(scanner.nextLine());

            System.out.println("Chuong nuoi");
            int chuongNuoi = Integer.parseInt(scanner.nextLine());

            System.out.println("Sai canh");
            float saiCanh = Integer.parseInt(scanner.nextLine());

            System.out.println("Kha nang noi chuyen");
            String nhap = scanner1.nextLine().trim().toLowerCase();
            boolean yesNo  = nhap.equals("co");

            return new Chim(maSo, tenChim, namSinh, chuongNuoi,saiCanh,yesNo);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
