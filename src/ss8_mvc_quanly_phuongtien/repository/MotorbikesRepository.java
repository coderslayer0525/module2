package ss8_mvc_quanly_phuongtien.repository;

import ss8_mvc_quanly_phuongtien.entity.Motorbikes;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class MotorbikesRepository implements IMotorbikesRepository{
   private final String MOTORS_FILE = "ss8_mvc_quanly_phuongtien/data/motors";
    @Override
    public List<Motorbikes> findAll(){
        List<Motorbikes> motorbikesList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(MOTORS_FILE);
            String[] array = null;
            for (String line: stringList) {
                array = line.split(",");
                Motorbikes motorbikes = new Motorbikes(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]));
                motorbikesList.add(motorbikes);
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file");
        }
        return motorbikesList;
    }
    @Override
    public boolean add(Motorbikes motorbikes){
        List<String> stringList = new ArrayList<>();
        stringList.add((String) motorbikes.getInfoToCSV());
        try{
            ReadAndWriteFile.writeFileCSV(MOTORS_FILE,stringList,true);
        } catch (Exception e){
            System.out.println("Lôi ghi file");
            return  false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        return true;
    }

    @Override
    public boolean update(int id, Motorbikes newMotorbikes, int power) {
        return true;
    }


    @Override
    public Motorbikes findbyId(int id) {
        return null;
    }
}
