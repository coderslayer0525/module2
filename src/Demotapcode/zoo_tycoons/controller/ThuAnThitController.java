package Demotapcode.zoo_tycoons.controller;
import Demotapcode.Thuvien.repository.ILuanVanRepository;
import Demotapcode.zoo_tycoons.repository.IThuAnThitRepository;
import Demotapcode.zoo_tycoons.service.IThuAnThitService;
import Demotapcode.zoo_tycoons.service.ThuAnThitService;
import Demotapcode.zoo_tycoons.entity.Chim;
import Demotapcode.zoo_tycoons.entity.ThuAnThit;
import Demotapcode.zoo_tycoons.service.IThuAnCoService;
import Demotapcode.zoo_tycoons.service.ThuAnCoService;
import Demotapcode.zoo_tycoons.view.ChimView;
import Demotapcode.zoo_tycoons.view.ThuAnThitView;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuAnThitController {
    private final IThuAnCoService thuAnCoService = new ThuAnCoService();
    private IThuAnThitService thuAnThitService;

    public void  displayMenu(){
        Scanner scanner = new Scanner(System.in);

        final int ADD = 1;
        final int DISP = 2;
        final  int DEL = 3;
        final int SER = 4;
        final int EXIT = 5;
        boolean flag = true;
        while (flag){
            System.out.println("= THU AN THIT =");
            System.out.println(" OPTION " +
                    "\n 1. MUA THU." +
                    "\n 2. DANH SACH THU." +
                    "\n 3. HOA KIEP." +
                    "\n 4. TIM THU." +
                    "\n 5. QUAY LAI MAINMENU.");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case ADD :
                    System.out.println("Mua thu");
                    ThuAnThit thuAnThit = ThuAnThitView.inputData();
                    boolean ok = this.thuAnThitService.add(thuAnThit);
                    if (ok){
                        System.out.println("Mua");
                    }else {
                        System.out.println("khong mua");
                    }
                    break;
                case DISP:
                    System.out.println("DANH SACH THU AN THIT.");
                    ArrayList<ThuAnThit> thuAnThitArrayList = this.thuAnThitService.findAll();
                    ThuAnThitView.display(thuAnThitArrayList);
                    break;
                case DEL:
                    System.out.println("HOA KIEP THU .");
                    ThuAnThit thuViet = ThuAnThitView.inputData();
                    if (thuViet == null){
                        System.out.println("khong nhap dc thu");
                        break;
                    }
                    boolean not = this.thuAnThitService.delete(thuViet.getMaSo());
                    if (not){
                        System.out.println("hoa kiep");
                    }else {
                        System.out.println("Khong hoa kiep");
                    }
                    break;
                case SER:
                    System.out.println("TIM THU VUI.");
                    System.out.println("Ten");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    ThuAnThit timvedau = thuAnThitService.findByName(name);
                    if(timvedau != null){
                        System.out.println("Thu AN THIt"+ timvedau);
                    }else {
                        System.out.println(" khong thay");
                    }
                    break;
                case EXIT:
                    System.out.println("Quay lai menu chinh");

                    break;
                default:
                    flag = false;
            }
        }

    }
}
