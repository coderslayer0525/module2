package Demotapcode.game_online.repository;

import Demotapcode.game_online.entity.ChienBinh;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ChienBinhRepository implements IChienBinhRepository {
    public final String BINH_FILE = "Demotapcode/game_online/data/chienbinh.csv";


    @Override
    public List<ChienBinh> findAll() {
        List<ChienBinh> chienBinhList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(BINH_FILE);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) continue;
                try {
                    ChienBinh chienBinh = new ChienBinh(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), Integer.parseInt(array[3]),
                                Integer.parseInt(array[4]));
                    chienBinhList.add(chienBinh);
                } catch (NumberFormatException e) {
                    System.out.println(" Du lieu khong hop le:" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e.getMessage());
            e.printStackTrace();
        }
        return chienBinhList;
    }

    @Override
    public boolean choice(int id, int lever) {
        return false;
    }

    @Override
    public boolean add(ChienBinh chienBinh) {
        List<String> stringList = new ArrayList<>();
        stringList.add(chienBinh.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(BINH_FILE, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println(" Loi Ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            List<ChienBinh> chienBinhList = findAll();
            boolean removed = chienBinhList.removeIf(c -> c.getId() == id);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (ChienBinh c : chienBinhList) {
                    stringList.add(c.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(BINH_FILE, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println(" Nhap sai thong tin" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int id, ChienBinh newChienBinh) {
        try {
            List<ChienBinh> chienBinhList = findAll();
            for (ChienBinh c : chienBinhList) {
                if (c.getId() == id) {
                    c.setId(newChienBinh.getId());
                    c.setName(newChienBinh.getName());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (ChienBinh c : chienBinhList) {
                stringList.add(c.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(BINH_FILE, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Loi DU lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public ChienBinh findById(int id) {
        try {
            List<ChienBinh> chienBinhList = findAll();
            for (ChienBinh c : chienBinhList) {
                if (c.getId() == id) {
                    return c;
                }
            }
        } catch (Exception e) {
            System.out.println(" loi khong tim thay " + e.getMessage());
        }
        return null;
    }
}
