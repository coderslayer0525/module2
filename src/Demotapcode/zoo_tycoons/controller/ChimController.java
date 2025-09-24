package Demotapcode.zoo_tycoons.controller;

import Demotapcode.zoo_tycoons.entity.Chim;
import Demotapcode.zoo_tycoons.service.ChimService;
import Demotapcode.zoo_tycoons.service.IChimService;
import Demotapcode.zoo_tycoons.view.ChimView;

import java.util.ArrayList;
import java.util.Scanner;

public class ChimController {
    private final IChimService chimService = new ChimService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);

        final int ADD_OBJECT = 1;
        final int DISPLAY_OBJECT = 2;
        final int DEL_OBJECT = 3;
        final int FIND_OBJECT = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Quan ly con chim");
            System.out.println("Tac vu :" +
                    "\n 1. Mua chim" +
                    "\n 2. Danh sach chim" +
                    "\n 3. Cat chim" +
                    "\n 4. Tim chim" +
                    "\n 5. Ve main");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case ADD_OBJECT :
                    ;System.out.println("Mua chim");
                Chim chim = ChimView.inputData();
                boolean ok = this.chimService.add(chim);
                if (ok){
                    System.out.println("Mua");
                }else {
                    System.out.println("khong mua");
                }
                break;
                case DISPLAY_OBJECT:
                    System.out.println("Danh sach Chim");
                    ArrayList<Chim> chimArrayList = this.chimService.findAll();
                    ChimView.display(chimArrayList);
                    break;
                case DEL_OBJECT:
                    System.out.println("Cat Chim");
                    Chim chimViet = ChimView.inputData();
                    if (chimViet == null){
                        System.out.println("khong nhap dc chim");
                        break;
                    }
                    boolean not = this.chimService.delete(chimViet.getMaSo());
                    if (not){
                        System.out.println("Cat");
                    }else {
                        System.out.println("Khong Cat");
                    }
                    break;
                case FIND_OBJECT:
                    System.out.println("Tim chim");
                    System.out.println("Ten");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    Chim tim = chimService.findByName(name);
                    if(tim != null){
                        System.out.println("chim"+ tim);
                    }else {
                        System.out.println(" khong thay");
                    }
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
                    System.out.println("chon sai");

            }
        }
    }
}
