package Demotapcode.phamarcy_managerment.repository;


import Demotapcode.game_online.entity.ChienBinh;
import Demotapcode.phamarcy_managerment.entity.Thuoc;
import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ThuocNuocRepository implements IThuocNuocRepository {
    public final String THUOC_FILE = "Demotapcode/phamarcy_managerment/data/thuocnuoc.csv";

    @Override
    public List<ThuocNuoc> findAll() {
        List<ThuocNuoc> thuocNuocList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(THUOC_FILE);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length != 5){
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    ThuocNuoc thuocNuoc = new ThuocNuoc(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), array[3],
                            Integer.parseInt(array[4])
                    );
                    thuocNuocList.add(thuocNuoc);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Paste Du lieu" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e.getMessage());
            e.printStackTrace();
        }
        return thuocNuocList;
    }

    @Override
    public boolean add(ThuocNuoc thuocNuoc) {
        try {
            ReadAndWriteFile.writeFileCSV(THUOC_FILE, List.of(thuocNuoc.getInfoToCSV()), true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int maThuoc) {
        try {
            List<ThuocNuoc> thuocNuocList = findAll();
            boolean removed = thuocNuocList.removeIf(t -> t.getMaThuoc() == maThuoc);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (ThuocNuoc t : thuocNuocList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(THUOC_FILE, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }


    @Override
    public boolean update(int maThuoc, ThuocNuoc thuocNuoc) {
        try {
            List<ThuocNuoc> thuocNuocList = findAll();
            for (ThuocNuoc t : thuocNuocList) {
                if (t.getMaThuoc() == maThuoc) {
                    Thuoc newMaThuoc = null;
                    t.setMaThuoc(newMaThuoc.getMaThuoc());
                    t.setTenThuoc(newMaThuoc.getTenThuoc());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (ThuocNuoc t : thuocNuocList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(THUOC_FILE, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public ThuocNuoc findById(int maThuoc) {
        try {
            List<ThuocNuoc> thuocNuocList = findAll();
            for (ThuocNuoc t : thuocNuocList) {
                if (t.getMaThuoc() == maThuoc) {
                    return t;
                }
            }
        } catch (Exception e) {
            System.out.println(" loi khong tim thay " + e.getMessage());
        }
        return null;
    }
}

