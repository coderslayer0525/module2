package Demotapcode.thi_module2.view;

import Demotapcode.thi_module2.entity.HoaDon;
import Demotapcode.thi_module2.entity.KhachHang;
import Demotapcode.thi_module2.entity.KhachTay;
import Demotapcode.thi_module2.entity.KhachVietNam;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class HoaDonView {
    private static final Scanner scanner = new Scanner(System.in);


    public static void display(List<HoaDon> hoaDonList) {
        if (hoaDonList == null || hoaDonList.isEmpty()) {
            System.out.println(" Không có hóa đơn nào để hiển thị!");
            return;
        }

        System.out.printf("%-10s | %-20s | %-12s | %-8s | %-10s | %-12s%n",
                "Mã HD", "Tên khách hàng", "Ngày lập", "SL", "Đơn giá", "Thành tiền");
        System.out.println("--------------------------------------------------------------------------");

        for (HoaDon hd : hoaDonList) {
            System.out.printf("%-10s | %-20s | %-12s | %-8d | %-10.2f | %-12.2f%n",
                    hd.getMaHoaDon(),
                    hd.getKhachHang().getName(),
                    hd.getNgayRaHoaDon(),
                    hd.getSoLuong(),
                    hd.getDonGia(),
                    hd.getThanhTien());
        }
    }
    public static HoaDon inputData() {
        System.out.println("=== Nhập thông tin hóa đơn mới ===");

        System.out.print("Nhập mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();

        System.out.println("Chọn loại khách hàng:");
        System.out.println("1. Khách Việt Nam");
        System.out.println("2. Khách nước ngoài");
        System.out.print("Lựa chọn: ");
        int loai = Integer.parseInt(scanner.nextLine());

        KhachHang khachHang;
        if (loai == 1) {
            khachHang = new KhachVietNam();
        } else {
            khachHang = new KhachTay();
        }

        System.out.print("Nhập mã khách hàng: ");
        khachHang.setMaKhachHang(Integer.parseInt(scanner.nextLine()));

        System.out.print("Nhập tên khách hàng: ");
        khachHang.setName(scanner.nextLine());

        System.out.print("Nhập ngày ra hóa đơn (yyyy-MM-dd): ");
        LocalDate ngayRaHoaDon = LocalDate.parse(scanner.nextLine());

        System.out.print("Nhập số lượng (kWh): ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập đơn giá (VNĐ/kWh): ");
        double donGia = Double.parseDouble(scanner.nextLine());

        return new HoaDon(maHoaDon, khachHang, ngayRaHoaDon, soLuong, donGia);
    }

    public static HoaDon inputUpdateData(HoaDon oldHoaDon) {
        System.out.println("=== Cập nhật thông tin hóa đơn ===");
        System.out.println("(Để trống nếu không muốn thay đổi)");

        System.out.print("Số lượng [" + oldHoaDon.getSoLuong() + "]: ");
        String soLuongStr = scanner.nextLine();
        if (!soLuongStr.isEmpty()) oldHoaDon.setSoLuong(Integer.parseInt(soLuongStr));

        System.out.print("Đơn giá [" + oldHoaDon.getDonGia() + "]: ");
        String donGiaStr = scanner.nextLine();
        if (!donGiaStr.isEmpty()) oldHoaDon.setDonGia(Double.parseDouble(donGiaStr));

        double thanhTien = oldHoaDon.getKhachHang().tinhThanhTien(oldHoaDon.getSoLuong(), oldHoaDon.getDonGia());
        oldHoaDon.setThanhTien(thanhTien);

        return oldHoaDon;
    }

    public static void displayDetail(HoaDon hoaDon) {
        if (hoaDon == null) {
            System.out.println(" Không có hóa đơn để hiển thị!");
            return;
        }

        System.out.println("=====================================");
        System.out.println("Mã hóa đơn     : " + hoaDon.getMaHoaDon());
        System.out.println("Khách hàng     : " + hoaDon.getKhachHang().getName());
        System.out.println("Ngày ra hóa đơn: " + hoaDon.getNgayRaHoaDon());
        System.out.println("Số lượng (kWh) : " + hoaDon.getSoLuong());
        System.out.println("Đơn giá (VNĐ)  : " + hoaDon.getDonGia());
        System.out.println("Thành tiền (VNĐ): " + hoaDon.getThanhTien());
        System.out.println("=====================================");
    }
}