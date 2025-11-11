package ss8_mvc_quanly_phuongtien.service;

import ss8_mvc_quanly_phuongtien.entity.Trucks;

import java.util.List;

public interface ITrucksService {
    List<Trucks> findAll();

    boolean add(Trucks trucks);

    boolean update(int id, Trucks newTrucks, int ranger);

    boolean delete(int id);

    Trucks findbyId(int id);
}
