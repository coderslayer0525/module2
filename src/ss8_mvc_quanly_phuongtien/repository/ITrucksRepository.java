package ss8_mvc_quanly_phuongtien.repository;

import ss8_mvc_quanly_phuongtien.entity.Trucks;

import java.util.List;

public interface ITrucksRepository {
    List<Trucks> findAll();

    boolean add(Trucks trucks);

    boolean delete(int id);

    boolean update(int id, Trucks newTrucks, double ranger);

    Trucks findbyId(int id);
}
