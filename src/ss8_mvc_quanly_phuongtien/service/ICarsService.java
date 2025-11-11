package ss8_mvc_quanly_phuongtien.service;

import ss8_mvc_quanly_phuongtien.entity.Cars;

import java.util.List;

public interface ICarsService {
    List<Cars> findAll();

    boolean add(Cars cars);

    boolean delete(int id);

    boolean update(int id, Cars newCars,int slot);

    Cars findbyId(int id);
}
