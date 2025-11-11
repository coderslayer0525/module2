package Demotapcode.phamarcy_managerment.repository;

import Demotapcode.phamarcy_managerment.entity.ThuocTiem;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ThuocTiemRepository implements IThuocTiemRepository {
    public final String THUOC_TIEM = "Demotapcode/phamarcy_managerment/data/thuoctiem.csv";

    @Override
    public List<ThuocTiem> findAll() {
        List<ThuocTiem> thuocTiemList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(THUOC_TIEM);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) {
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    ThuocTiem thuocTiem = new ThuocTiem(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), array[3],
                            Integer.parseInt(array[4])
                    );
                    thuocTiemList.add(thuocTiem);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Paste Du lieu" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e.getMessage());
            e.printStackTrace();
        }
        return thuocTiemList;
    }

    public int getNextId() {
        List<ThuocTiem> thuocTiemList = findAll();
        if (thuocTiemList.isEmpty()) {
            return 1;
        }
        int maxId = 0;
        for (ThuocTiem t : thuocTiemList) {
            if (t.getMaThuoc() > maxId) {
                maxId = t.getMaThuoc();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(ThuocTiem thuocTiem) {
        int nextId = getNextId();
        thuocTiem.setMaThuoc(nextId);
        List<String> stringList = new ArrayList<>();
        stringList.add(thuocTiem.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(THUOC_TIEM, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int maThuoc) {
        try {
            List<ThuocTiem> thuocTiemList = findAll();
            boolean removed = thuocTiemList.removeIf(t -> t.getMaThuoc() == maThuoc);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (ThuocTiem t : thuocTiemList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(THUOC_TIEM, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(int maThuoc, ThuocTiem newThuocTiem) {
        try {
            List<ThuocTiem> thuocTiemList = findAll();
            for (ThuocTiem t : thuocTiemList) {
                if (t.getMaThuoc() == maThuoc) {
                    t.setMaThuoc(newThuocTiem.getMaThuoc());
                    t.setTenThuoc(newThuocTiem.getTenThuoc());
                    t.setHanSuDung(newThuocTiem.getHanSuDung());
                    t.setHangSanXuat(newThuocTiem.getHangSanXuat());
                    t.setLieuLuong(newThuocTiem.getLieuLuong());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (ThuocTiem t : thuocTiemList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(THUOC_TIEM, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public ThuocTiem findByName(String tenThuoc) {
        try {
            List<ThuocTiem> thuocTiemList = findAll();
            for (ThuocTiem t : thuocTiemList) {
                if (t.getTenThuoc().equalsIgnoreCase(tenThuoc)) {
                    return t;
                }
            }
        } catch (Exception e) {
            System.out.println(" loi khong tim thay " + e.getMessage());
        }
        return null;
    }
}