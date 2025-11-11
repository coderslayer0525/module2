package Demotapcode.quanly_traicay.repository;

import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.entity.ThuocTiem;
import Demotapcode.quanly_traicay.entity.DuaHau;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DuaHauRepository implements IDuaHauRepository {
    public final String FILE_TRAI = "Demotapcode/quanly_traicay/data/duahau.csv";

    @Override
    public List<DuaHau> findAll() {
        List<DuaHau> duaHauList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(FILE_TRAI);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) {
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    DuaHau duaHau = new DuaHau(array[0], array[1],
                            Integer.parseInt(array[2]),
                            Integer.parseInt(array[3]), array[4],
                            Integer.parseInt(array[5])
                    );
                    duaHauList.add(duaHau);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Paste Du lieu" + line);
                } catch (Exception e) {
                    System.out.println("lỗi đọc file" + e.getMessage());
                    e.printStackTrace();
                }
            }
            return duaHauList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean add(DuaHau duaHau) {
        List<String> stringList = new ArrayList<>();
        stringList.add(duaHau.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(FILE_TRAI, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int ngaySanXuat) {
        try {
            List<DuaHau> duaHauList = findAll();
            boolean removed = duaHauList.removeIf(t -> t.getNgaySanXuat() == ngaySanXuat);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (DuaHau t : duaHauList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(FILE_TRAI, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(String tenTraiCay, DuaHau newDuaHau) {
        try {
            List<DuaHau> duaHauList = findAll();
            for (DuaHau t : duaHauList) {
                if (t.getTenTraiCay() == tenTraiCay) {
                    t.setLoaiTraiCay(newDuaHau.getLoaiTraiCay());
                    t.setNgaySanXuat(newDuaHau.getNgaySanXuat());
                    t.setHanSuDung(newDuaHau.getHanSuDung());
                    t.setXuatXu(newDuaHau.getXuatXu());
                    t.setGiaThanh(newDuaHau.getGiaThanh());
                    t.setDoNgot(newDuaHau.getDoNgot());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (DuaHau t : duaHauList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(FILE_TRAI, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi Du Lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public DuaHau findByName(String tenTraiCay) {
        try {
            List<DuaHau> duaHauList = findAll();
            for (DuaHau t : duaHauList) {
                if (t.getTenTraiCay().equalsIgnoreCase(tenTraiCay)) {
                    return t;
                }
            }
        } catch (Exception e) {
            System.out.println(" loi khong tim thay " + e.getMessage());
        }
        return null;
    }
}