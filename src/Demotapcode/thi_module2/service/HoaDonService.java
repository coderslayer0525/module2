package Demotapcode.thi_module2.service;

import Demotapcode.thi_module2.entity.HoaDon;
import Demotapcode.thi_module2.util.ReadAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HoaDonService implements IHoaDonService {
    private static final String BILL_LIST = "src/Demotapcode/thi_module2/data/hoadondien.csv";



    public List<HoaDon> getAll() throws IOException {
        List<String> lines = ReadAndWriteFile.readFileCSV(BILL_LIST);
        List<HoaDon> list = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length >= 6) {
                String maHoaDon = parts[0];
                String maKhachHang = parts[1];
                String tenKhachHang = parts[2];
                LocalDate ngayRaHoaDon = LocalDate.parse(parts[3]);
                int soLuong = Integer.parseInt(parts[4]);
                double donGia = Double.parseDouble(parts[5]);

                HoaDon hoaDon = new HoaDon(maHoaDon, null, ngayRaHoaDon, soLuong, donGia);
                list.add(hoaDon);
            }
        }
        return list;
    }

    @Override
    public List<HoaDon> findAll() {
        return List.of();
    }

    // Thêm hóa đơn mới
    @Override
    public boolean add(HoaDon hoaDon) throws IOException {
        List<HoaDon> hoaDons = getAll();

        // kiểm tra trùng mã
        for (HoaDon h : hoaDons) {
            if (h.getMaHoaDon().equalsIgnoreCase(hoaDon.getMaHoaDon())) {
                System.out.println("⚠️ Mã hóa đơn đã tồn tại!");
                return false;
            }
        }

        hoaDons.add(hoaDon);
        writeToFile(hoaDons);
        System.out.println("✅ Thêm hóa đơn thành công!");
        return true;
    }

    // Tìm theo mã hóa đơn
    @Override
    public HoaDon findById(String maHoaDon) throws IOException {
        for (HoaDon h : getAll()) {
            if (h.getMaHoaDon().equalsIgnoreCase(maHoaDon)) {
                return h;
            }
        }
        return null;
    }

    // Cập nhật hóa đơn
    @Override
    public void update(String maHoaDon, HoaDon newHoaDon) throws IOException {
        List<HoaDon> hoaDons = getAll();
        boolean found = false;

        for (int i = 0; i < hoaDons.size(); i++) {
            if (hoaDons.get(i).getMaHoaDon().equalsIgnoreCase(maHoaDon)) {
                hoaDons.set(i, newHoaDon);
                found = true;
                break;
            }
        }

        if (found) {
            writeToFile(hoaDons);
            System.out.println("✅ Cập nhật hóa đơn thành công!");
        } else {
            System.out.println("❌ Không tìm thấy hóa đơn có mã: " + maHoaDon);
        }
    }

    @Override
    public void displayDetail() {

    }

    // Hiển thị danh sách hóa đơn
    @Override
    public void displayAll() throws IOException {
        List<HoaDon> list = getAll();
        if (list.isEmpty()) {
            System.out.println("⚠️ Chưa có hóa đơn nào!");
        } else {
            System.out.println("===== DANH SÁCH HÓA ĐƠN =====");
            list.forEach(System.out::println);
        }
    }

    @Override
    public void update() {

    }

    // Ghi lại file CSV
    private boolean writeToFile(List<HoaDon> hoaDons) throws IOException {
        List<String> lines = new ArrayList<>();
        for (HoaDon h : hoaDons) {
            String line = String.join(",",
                    h.getMaHoaDon(),
                    h.getNgayRaHoaDon().toString(),
                    String.valueOf(h.getSoLuong()),
                    String.valueOf(h.getDonGia())
            );
            lines.add(line);
        }
        ReadAndWriteFile.writeFileCSV(BILL_LIST, lines,false);
        return true;
    }
}
