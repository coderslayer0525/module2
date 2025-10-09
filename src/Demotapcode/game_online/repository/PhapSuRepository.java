package Demotapcode.game_online.repository;

import Demotapcode.game_online.entity.PhapSu;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PhapSuRepository implements IPhapSuRepository {
    public final String PHAP_FILE = "Demotapcode/game_online/data/phapsu.csv";

    @Override
    public List<PhapSu> findAll() {
        List<PhapSu> phapSuList = new ArrayList<>();
        try{
            List<String> stringList = ReadAndWriteFile.readFileCSV(PHAP_FILE);
            for (String line : stringList){
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3) continue;
                try{
                    PhapSu phapSu = new PhapSu(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), (array[4]));
                    phapSuList.add(phapSu);
                } catch (NumberFormatException e) {
                    System.out.println("Du Lieu khong hop le" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("Loi doc file" + e.getMessage());
            e.printStackTrace();
        }
        return phapSuList;
    }

    @Override
    public boolean add(PhapSu phapSu) {
        List<String> stringList = new ArrayList<>();
        stringList.add(phapSu.getInfoToCSV());
        try{
            ReadAndWriteFile.writeFileCSV(PHAP_FILE,stringList, true);
            return true;
        }catch (Exception e) {
            System.out.println(" loi ghi file :" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            List<PhapSu> phapSuList = findAll();
            boolean removed  = phapSuList.removeIf( p -> p.getId()== id);
            if (removed){
                List<String> stringList= new ArrayList<>();
                for (PhapSu p : phapSuList){
                    stringList.add(p.getInfoToCSV());

                }
                ReadAndWriteFile.writeFileCSV(PHAP_FILE, stringList, false);
            }
            return removed;
        }catch (Exception e) {
            System.out.println(" kiem tra lai thong tin da nhap" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int id, PhapSu newPhapSu) {
        try {
            List<PhapSu> phapSuList = findAll();
            for (PhapSu p : phapSuList) {
                if (p.getId() == id) {
                    p.setId(newPhapSu.getId());
                    p.setName(newPhapSu.getName());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (PhapSu p : phapSuList){
                stringList.add(p.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(PHAP_FILE,stringList,false);
            return true;
        }catch (Exception e){
            System.out.println(" Loi Du  lieu" + e.getMessage());
            return false;
        }
    }

    @Override
    public PhapSu findById(int id) {
        try {
            List<PhapSu> phapSuList = findAll();
            for (PhapSu p : phapSuList){
                if (p.getId() == id){
                    return p;
                }
            }
        }catch (Exception e){
            System.out.println(" Loi khong tim thay" + e.getMessage());
        }

        return null;
    }
}