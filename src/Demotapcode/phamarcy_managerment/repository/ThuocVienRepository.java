package Demotapcode.phamarcy_managerment.repository;

import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.entity.ThuocVien;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ThuocVienRepository implements  IThuocVienRepository{
    public final String THUOC_VIEN = "Demotapcode/phamarcy_managerment/data/thuocvien.csv" ;
    @Override
    public List<ThuocVien> findAll() {
        List<ThuocVien> thuocVienList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(THUOC_VIEN);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3){
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    ThuocVien thuocVien = new ThuocVien(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), array[3],
                            Integer.parseInt(array[4])
                    );
                    thuocVienList.add(thuocVien);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Paste Du lieu" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e.getMessage());
            e.printStackTrace();
        }
        return  thuocVienList;
    }

    @Override
    public boolean add(ThuocVien thuocVien) {
        List<String> stringList = new ArrayList<>();
        stringList.add(thuocVien.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(THUOC_VIEN, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }
    @Override
    public boolean delete(int maThuoc) { try {
        List<ThuocVien> thuocVienList = findAll();
        boolean removed = thuocVienList.removeIf(v -> v.getMaThuoc() == maThuoc);
        if (removed) {
            List<String> stringList = new ArrayList<>();
            for (ThuocVien v : thuocVienList) {
                stringList.add(v.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(THUOC_VIEN, stringList, false);
        }
        return removed;
    } catch (Exception e) {
        System.out.println("nhap sai thong tin" + e.getMessage());
    }
        return false;
    }

    @Override
    public boolean update(int maThuoc, ThuocVien newThuocVien) {
        try {
            List<ThuocVien> thuocVienList = findAll();
            for (ThuocVien v : thuocVienList) {
                if (v.getMaThuoc() == maThuoc) {
                    v.setMaThuoc(newThuocVien.getMaThuoc());
                    v.setTenThuoc(newThuocVien.getTenThuoc());
                    v.setHanSuDung(newThuocVien.getHanSuDung());
                    v.setHangSanXuat(newThuocVien.getHangSanXuat());
                    v.setSoVien(newThuocVien.getSoVien());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (ThuocVien v : thuocVienList) {
                stringList.add(v.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(THUOC_VIEN, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public ThuocVien findById(int maThuoc) {
        try {
            List<ThuocVien> thuocVienList = findAll();
            for (ThuocVien v : thuocVienList) {
                if (v.getMaThuoc() == maThuoc) {
                    return v;
                }
            }
        } catch (Exception e) {
            System.out.println(" loi khong tim thay " + e.getMessage());
        }
        return null;
    }
}
