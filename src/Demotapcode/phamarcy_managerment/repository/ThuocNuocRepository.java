package Demotapcode.phamarcy_managerment.repository;

import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.exception.ThuocException;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ThuocNuocRepository implements IThuocNuocRepository {
    public final String THUOC_NUOC = "Demotapcode/phamarcy_managerment/data/thuocnuoc.csv";

    @Override
    public List<ThuocNuoc> findAll() {
        List<ThuocNuoc> thuocNuocList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(THUOC_NUOC);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3){
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
        return  thuocNuocList;
    }
    public int getNextId() {
        List<ThuocNuoc> thuocNuocList = findAll();
        if (thuocNuocList.isEmpty()) {
            return 1;
        }
        int maxId = 0;
        for (ThuocNuoc t : thuocNuocList) {
            if (t.getMaThuoc() > maxId) {
                maxId = t.getMaThuoc();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(ThuocNuoc thuocNuoc) {
        int nextId = getNextId();
        thuocNuoc.setMaThuoc(nextId);
        List<String> stringList = new ArrayList<>();
        stringList.add(thuocNuoc.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(THUOC_NUOC, stringList, true);
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
            boolean removed = thuocNuocList.removeIf(new Predicate<ThuocNuoc>() {
                @Override
                public boolean test(ThuocNuoc t) {
                    return t.getMaThuoc()==maThuoc;
                }
            });
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (ThuocNuoc t : thuocNuocList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(THUOC_NUOC, stringList, false);
            }else {
                throw new ThuocException("Id not found");
            }
            return removed;
        }catch (ThuocException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }


    @Override
    public boolean update(int maThuoc, ThuocNuoc newThuocNuoc) {
        try {
            List<ThuocNuoc> thuocNuocList = findAll();
            for (ThuocNuoc t : thuocNuocList) {
                if (t.getMaThuoc() == maThuoc) {
                    t.setMaThuoc(newThuocNuoc.getMaThuoc());
                    t.setTenThuoc(newThuocNuoc.getTenThuoc());
                    t.setHanSuDung(newThuocNuoc.getHanSuDung());
                    t.setHangSanXuat(newThuocNuoc.getHangSanXuat());
                    t.setTheTich(newThuocNuoc.getTheTich());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (ThuocNuoc t : thuocNuocList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(THUOC_NUOC, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public ThuocNuoc findByName(String tenThuoc) {
        try {
            List<ThuocNuoc> thuocNuocList = findAll();
            for (ThuocNuoc t : thuocNuocList) {
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

