package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.entity.Trucks;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrucksRepository implements  ITrucksRepository {
    private final String TRUCKS_FILE ="ss8_cleanCode_mvc/data/trucks";
    @Override
    public List<Trucks> findAll(){
        List<Trucks> trucksList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(TRUCKS_FILE);
            String[] array = null;
            for (String line: stringList) {
                array = line.split(",");
//                int id, String model,power
                Trucks trucks = new Trucks(Integer.parseInt(array[0]),Integer.parseInt(array[2]),array[1]);
                trucksList.add(trucks);
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return trucksList;
    }

    @Override
    public boolean add(Trucks trucks) {
        return false;
    }


    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Trucks newTrucks, double ranger) {
        return true;
    }


    @Override
    public Trucks findbyId(int id) {
        return null;
    }
}
