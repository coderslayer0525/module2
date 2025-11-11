package ss8_mvc_quanly_phuongtien.service;

import ss8_mvc_quanly_phuongtien.entity.Motorbikes;

import java.util.List;

public interface IMotorbikesService {
    List<Motorbikes> findAll();

    boolean add(Motorbikes motorbikes);

    boolean delete(int id);

    boolean update(int id, Motorbikes newMotorbikes, int power);

    Motorbikes findbyId(int id);
}
