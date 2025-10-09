package ss8_mvc_quanly_phuongtien.repository;

import ss8_mvc_quanly_phuongtien.entity.Cars;

import java.util.List;

public interface ICarsRepository {
    List<Cars> findAll();

    boolean add(Cars cars);

    boolean delete(int id);

    boolean update(int id, Cars newCars, double slot);

    Cars findbyId(int id);
}

