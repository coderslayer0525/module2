package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;
import java.util.List;

public interface ICarsRepository {
    List<Cars> findAll();

    boolean add(Cars cars);

    boolean delete(int id);

    boolean update(int id, Cars newCars, double slot);

    Cars findbyId(int id);
}

