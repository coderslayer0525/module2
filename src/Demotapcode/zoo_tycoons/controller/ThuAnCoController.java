package Demotapcode.zoo_tycoons.controller;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;
import Demotapcode.zoo_tycoons.service.IThuAnCoService;
import Demotapcode.zoo_tycoons.service.ThuAnCoService;
import Demotapcode.zoo_tycoons.view.ThuAnCoView;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuAnCoController {
    private final IThuAnCoService thuAnCoService = new ThuAnCoService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);

        final int ADD_OB = 1;
        final int DISPLAY_OB = 2;
        final int DEL_OB =3;
        final int FIND_OB = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Quan ly Thu an co");
            System.out.println("Tac vu :" +
                    "\n  1. Thu moi." +
                    "\n 2. Danh sach thu." +
                    "\n 3. Giet thu." +
                    "\n 4. Tim thu" +
                    "\n 5. ve main.");

            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    System.out.println("Thu moi");
                    ThuAnCo thuAnCo = ThuAnCoView.inputData();
                    boolean ok = this.thuAnCoService.add(thuAnCo);
                    if (ok){
                        System.out.println("okela");
                    }else {
                        System.out.println("shit");
                    }
                    break;
                case 2:
                    System.out.println("danh sach Thu");
                    ArrayList<ThuAnCo> thuAnCoArrayList = this.thuAnCoService.findAll();
                    ThuAnCoView.display(thuAnCoArrayList);
                    break;
                case  3:
                    System.out.println("Giet");
                    ThuAnCo tac = ThuAnCoView.inputData();
                    if (tac == null){
                        System.out.println("khong nhap dc");
                        break;
                    }
                    boolean noot= this.thuAnCoService.delete(tac.getMaSo());
                    if(noot){
                        System.out.println("Giet");
                    }else {
                        System.out.println("ko giet");
                    }
                    break;
                case 4:
                    System.out.println("tim Thu");
                    System.out.println("Ten");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    ThuAnCo tim = thuAnCoService.findByName(name);
                    if (tim != null) {
                        System.out.println("Thu an co " + tim);

                    }else {
                        System.out.println("khong thay");
                    }
                    break;
                case  5:
                    flag = false;
                    break;
                default:
                    System.out.println("chon sai");
            }
        }
    }
}
