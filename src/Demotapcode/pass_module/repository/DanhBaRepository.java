package Demotapcode.pass_module.repository;

import Demotapcode.pass_module.entity.DanhBa;
import Demotapcode.pass_module.exception.BestException;
import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.entity.ThuocTiem;
import Demotapcode.phamarcy_managerment.exception.ThuocException;
import Demotapcode.quanly_congviec.entity.DiSieuThi;
import Demotapcode.spa_nuru.entity.Dep;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class DanhBaRepository implements IDanhBaRepository {

    private final String DANH_BA = "src/Demotapcode/pass_module/data/danhba.csv";

    @Override
    public List<DanhBa> findAll() {
        List<DanhBa> danhBaList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(DANH_BA);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) {
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    DanhBa danhBa = new DanhBa(Integer.parseInt(array[0]), array[1],
                            array[2], array[3], array[4], array[5]
                    );
                    danhBaList.add(danhBa);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Parse Du lieu" + line);
                } catch (Exception e) {
                    System.out.println("lỗi đọc file" + e.getMessage());
                    e.printStackTrace();
                }
            }
            return danhBaList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean add(DanhBa danhBa) {
        List<String> stringList = new ArrayList<>();
        stringList.add(danhBa.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(DANH_BA, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }


    @Override
    public boolean update(int soDienThoai, DanhBa newDanhBa) {
        try {
            List<DanhBa> danhBaList = findAll();
            for (DanhBa t : danhBaList) {
                if (t.getSoDienThoai() == soDienThoai) {
                    t.setSoDienThoai(newDanhBa.getSoDienThoai());
                    t.setHoTen(newDanhBa.getHoTen());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (DanhBa t : danhBaList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(DANH_BA, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }


    @Override
    public boolean delete(int soDienThoai) {
        try {
            List<DanhBa> danhBaList = findAll();
            boolean removed = danhBaList.removeIf(t -> t.getSoDienThoai() == soDienThoai);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (DanhBa  t : danhBaList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(DANH_BA, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }

    @Override
    public List<DanhBa> findByName(String keyWords) {
        List<DanhBa> result = new ArrayList<>();
        if (keyWords == null) return result;

        Iterable<DanhBa> danhBas = findAll();
        String keyW = keyWords.toLowerCase().trim();
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getHoTen() != null && danhBa.getHoTen().toLowerCase().contains(keyW)) {
                result.add(danhBa);
            }
        }
        return result;
    }
}
