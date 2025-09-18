package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;
import java.util.List;

public interface ICarsService {
    List<Cars> findAll();

    boolean add(Cars cars);

    boolean delete(int id);

    boolean update(int id, Cars newCars,int slot);

    Cars findbyId(int id);
}
