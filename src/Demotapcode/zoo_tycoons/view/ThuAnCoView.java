package Demotapcode.zoo_tycoons.view;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuAnCoView {
    public static void display(ArrayList<ThuAnCo> thuAnCoArrayList){
        if (thuAnCoArrayList.isEmpty()){
            System.out.println("Khong co thu");
            return;
        }
        for (ThuAnCo thuAnCo : thuAnCoArrayList){
            System.out.println(thuAnCo);
        }
    }
    public static ThuAnCo inputData(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ma THu");
            int maThu = Integer.parseInt(scanner.nextLine());

            System.out.println("Ten Thu");
            String tenThu = scanner.nextLine();

            System.out.println("Nam Sinh");
            int namSinh = Integer.parseInt(scanner.nextLine());

            System.out.println("Chuong nuoi");
            int chuongNuoi = Integer.parseInt(scanner.nextLine());

            System.out.println(" Rau Co thich an");
            String doAn = scanner.next();


            return new ThuAnCo(maThu,tenThu,namSinh,chuongNuoi,doAn);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
