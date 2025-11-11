package Demotapcode.quanly_congviec.repository;

import Demotapcode.quanly_congviec.entity.DiSieuThi;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiSieuThiRepository implements IDiSieuThiRepository {
    private final String SIEU_THI = "Demotapcode/quanly_congviec/data/disieuthi.csv";

    @Override
    public List<DiSieuThi> findAll() {
        List<DiSieuThi> diSieuThiList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(SIEU_THI);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) {
                    System.out.println("dong du lieu loi" + line);
                    continue;
                }
                try {
                    boolean chuyenKhoan = Boolean.parseBoolean(array[5]);
                    DiSieuThi diSieuThi = new DiSieuThi(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4],
                            chuyenKhoan
                    );
                    diSieuThiList.add(diSieuThi);
                } catch (NumberFormatException e) {
                    System.out.println(" Loi Parse Du lieu" + line);
                } catch (Exception e) {
                    System.out.println("lỗi đọc file" + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return diSieuThiList;
    }

    public int getNextId() {
        List<DiSieuThi> diSieuThiList = findAll();
        if (diSieuThiList.isEmpty()) {
            return 1;
        }
        int maxId = 0;
        for (DiSieuThi t : diSieuThiList) {
            if (t.getMaChiTieu() > maxId) {
                maxId = t.getMaChiTieu();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(DiSieuThi diSieuThi) {
        int nextId = getNextId();
        diSieuThi.setMaChiTieu(nextId);
        List<String> stringList = new ArrayList<>();
        stringList.add(diSieuThi.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(SIEU_THI, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int maChiTieu) {
        try {
            List<DiSieuThi> diSieuThiList = findAll();
            boolean removed = diSieuThiList.removeIf(t -> t.getMaChiTieu() == maChiTieu);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (DiSieuThi t : diSieuThiList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(SIEU_THI, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(int maChiTieu, DiSieuThi newDiSieuThi) {
        try {
            List<DiSieuThi> diSieuThiList = findAll();
            for (DiSieuThi t : diSieuThiList) {
                if (t.getMaChiTieu() == maChiTieu) {
                    t.setMaChiTieu(newDiSieuThi.getMaChiTieu());
                    t.setTenChiTieu(newDiSieuThi.getTenChiTieu());
                    t.setNgayChi(newDiSieuThi.getNgayChi());
                    t.setSoTienChi(newDiSieuThi.getSoTienChi());
                    t.setMoTa(newDiSieuThi.getMoTa());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (DiSieuThi t : diSieuThiList) {
                stringList.add(t.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(SIEU_THI, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public DiSieuThi findById(int maChiTieu) {
        try {
            List<DiSieuThi> diSieuThiList = findAll();
            for (DiSieuThi t : diSieuThiList) {
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