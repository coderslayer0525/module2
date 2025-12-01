package Demotapcode.spa_nuru.controller;


import Demotapcode.spa_nuru.entity.Dep;
import Demotapcode.spa_nuru.service.DepService;
import Demotapcode.spa_nuru.service.IDepService;
import Demotapcode.spa_nuru.view.DepView;


import java.util.List;
import java.util.Scanner;

public class DepController {
    private final IDepService depService = new DepService();

    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DIS = 1;
        final int ADD = 2;
        final int SER = 3;
        final int SERA = 4;
        final int DEL = 5;
        final int EXT = 6;
        boolean flag = true;
        while (flag) {
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "=== TÂY THI PARADIES ===");
            System.out.println("=====================================");
            System.out.printf("%-30s%n", "Xin CHao Quy Khach:");
            System.out.printf("| %-3s | %-20s |%n", "STT", "");
            System.out.println("-------------------------------------");
            System.out.printf("| %-3d | %-20s |%n", DIS, "Danh Sách kỹ thuật viên trị liệu.");
            System.out.printf("| %-3d | %-20s |%n", ADD, "Them KTV mới vào he thống.");
            System.out.printf("| %-3d | %-20s |%n", SER, "Tim  Theo Mã sô KTV: ");
            System.out.printf("| %-3d | %-20s |%n", SERA, "Tim ten Ktv ngoài hệ thống :( yêu cầu mã Admin ) ");
            System.out.printf("| %-3d | %-20s |%n", DEL, " Gỡ thông tin KTV khỏi hệ thống.");
            System.out.printf("| %-3d | %-20s |%n", EXT, "Quay Lại Menu Chính");
            System.out.println("=====================================");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DIS:
                    System.out.println("List My Nhan:");
                    List<Dep> depList = this.depService.findAll();
                    DepView.display(depList);
                    break;
                case ADD:
                    System.out.println("Thêm KTV mới :");

                    Dep dep = DepView.inputData();
                    boolean isOk = this.depService.add(dep);
                    if (isOk) {
                        System.out.println("Thanh cong");
                    } else {
                        System.out.println("Loi khong xac dinh");
                    }
                    break;
                case SER:
                    System.out.println("ma so");
                        Scanner scanner = new Scanner(System.in);
                        int maSo = Integer.parseInt(scanner.nextLine());
                        Dep tim = depService.findById(maSo);
                        if (tim != null) {
                            System.out.println("Tim thay NV :" + tim);
                        } else {
                            System.out.println("Khong tim thay thong tin vua nhap.");
                        }
                    break;
                case SERA:
                    System.out.println("Nhập Mã ADMIN :");
                    String passCode = sc.nextLine();
                    final String SERA_PASS ="123";
                    if (passCode.equals(SERA_PASS)) {
                        System.out.println("ADMINTRAITOR");
                        System.out.println("Nhap ten(gan Dung):");
                        String ngheDanh = sc.nextLine();
                        List<Dep> timVip = depService.searchByName(ngheDanh);
                        if (timVip != null && !timVip.isEmpty()) {
                            System.out.println("ket qua : " + timVip);
                        }else {
                            System.out.println("khong co trong he thong");
                        }
                    }else {
                        System.out.printf("Sai ma ! truy cap bi tu choi");
                    }
                    break;
                case DEL:
                    System.out.println("Xoá KTV.");
                    Dep kick = DepView.inputData();
                    boolean okKick = this.depService.delete(kick.getMaSo());
                    if (okKick) {
                        System.out.println("xoá thanh cong");
                    } else {
                        System.out.println("Lỗi!! KTV đang trong phiên làm viêc. vui long thử lại sau khi kết thuc phien làm .");
                    }
                    break;
                case EXT:
                    flag = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le");

            }
        }
    }
}
