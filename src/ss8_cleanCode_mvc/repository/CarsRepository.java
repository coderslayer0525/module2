package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsRepository implements ICarsRepository {
    private final String CARS_FILE = "ss8_cleanCode_mvc/data/cars";

    @Override
    public List<Cars> findAll() {
        List<Cars> carsList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CARS_FILE);
            for (String line : stringList) {
                String[] array = line.split(",");
                Cars cars = new Cars(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]));
                carsList.add(cars);
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e.getMessage());
            e.printStackTrace();
        }
        return carsList;
    }

    @Override
    public boolean add(Cars cars) {
        List<String> stringList = new ArrayList<>();
        stringList.add(cars.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(CARS_FILE, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println(" Loi Ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            List<Cars> carsList = findAll();
            boolean removed = carsList.removeIf(c -> c.getId() == id);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (Cars c : carsList) {
                    stringList.add(c.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(CARS_FILE, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println(" xoa nham xe" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int id, Cars newCars, double slot) {
        try {
            List<Cars> carsList = findAll();
            for (Cars c : carsList) {
                if (c.getId() == id) {
                    c.setModel(newCars.getModel());
                    c.setSlot((int) slot);
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (Cars c : carsList) {
                stringList.add(c.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(CARS_FILE, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("loi mua xe moi" + e.getMessage());
            return false;
        }
    }


    @Override
    public Cars findbyId(int id) {
        try {
            List<Cars> carsList = findAll();
            for (Cars c : carsList) {
                if (c.getId() == id) {
                    return c;
                }
            }
        } catch (Exception e) {
            System.out.println(" loi khong tim thay xe" + e.getMessage());
        }
        return null;
    }
}
