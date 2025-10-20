package Demotapcode.quanly_congviec.repository;

import Demotapcode.game_online.entity.PhapSu;
import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.entity.ThuocTiem;
import Demotapcode.phamarcy_managerment.exception.ThuocException;
import Demotapcode.quanly_congviec.entity.DiCho;
import Demotapcode.quanly_traicay.entity.DuaHau;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DiChoRepository implements IDiChoRepository {
    private final String CHI_TIEU = "Demotapcode/quanly_congviec/data/dicho.csv";

    @Override
    public List<DiCho> findAll() {
        List<DiCho> diChoList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CHI_TIEU);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) {
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    boolean chuyenKhoan = Boolean.parseBoolean(array[5]);
                    DiCho diCho = new DiCho(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4],
                            chuyenKhoan
                    );
                    diChoList.add(diCho);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Paste Du lieu" + line);
                } catch (Exception e) {
                    System.out.println("lỗi đọc file" + e.getMessage());
                    e.printStackTrace();
                }
            }
            return diChoList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean add(DiCho diCho) {
        List<String> stringList = new ArrayList<>();
        stringList.add(diCho.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(CHI_TIEU, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int maChiTieu) {
        try {
            List<DiCho> diChoList = findAll();
            boolean removed = diChoList.removeIf(t -> t.getMaChiTieu() == maChiTieu);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (DiCho t : diChoList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(CHI_TIEU, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(int maChiTieu, DiCho newDiCho) {
        try {
            List<DiCho> diChoList = findAll();
            for (DiCho t : diChoList) {
                if (t.getMaChiTieu() == maChiTieu) {
                    t.setMaChiTieu(newDiCho.getMaChiTieu());
                    t.setTenChiTieu(newDiCho.getTenChiTieu());
                    t.setNgayChi(newDiCho.getNgayChi());
                    t.setSoTienChi(newDiCho.getSoTienChi());
                    t.setMoTa(newDiCho.getMoTa());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (DiCho t : diChoList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(CHI_TIEU, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public DiCho findById(int maChiTieu) {
        try {
            List<DiCho> diChoList = findAll();
            for (DiCho t : diChoList) {
                if (t.getMaChiTieu() == maChiTieu) {
                    return t;
                }
            }
        } catch (Exception e) {
            System.out.println(" Loi khong tim thay" + e.getMessage());
        }

        return null;
    }
}