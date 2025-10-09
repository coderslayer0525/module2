package Demotapcode.game_online.repository;

import Demotapcode.game_online.entity.XaThu;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class XaThuRepository implements IXaThuRepository {
    public final String XA_FILE = "Demotapcode/game_online/data/xathu.csv";

    @Override
    public List<XaThu> findAll() {
        List<XaThu> xaThuList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(XA_FILE);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) continue;
                try {
                    XaThu xaThu = new XaThu(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]));
                    xaThuList.add(xaThu);
                } catch (NumberFormatException e) {
                    System.out.println("Du Lieu khong hop le" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("Loi doc file" + e.getMessage());
            e.printStackTrace();
        }
        return xaThuList;
    }

    @Override
    public boolean add(XaThu xaThu) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xaThu.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(XA_FILE, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println(" loi ghi file :" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            List<XaThu> xaThuList = findAll();
            boolean removed = xaThuList.removeIf(X -> X.getId() == id);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (XaThu x : xaThuList) {
                    stringList.add(x.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(XA_FILE, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println(" Nhap sai thong tin" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int id, XaThu newxaThu) {
        try {
            List<XaThu> xaThuList = findAll();
            for (XaThu x : xaThuList) {
                if (x.getId() == id) {
                    x.setId(newxaThu.getId());
                    x.setName(newxaThu.getName());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (XaThu x : xaThuList) {
                stringList.add(x.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(XA_FILE, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println(" Loi Du  lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public XaThu findById(int id) {
        try {
            List<XaThu> xaThuList = findAll();
            for (XaThu x : xaThuList){
                if (x.getId() == id){
                    return x;
                }
            }
        }catch (Exception e){
            System.out.println(" Loi khong tim thay" + e.getMessage());
        }

        return null;
    }
}