package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Trucks;

import java.util.ArrayList;
import java.util.List;

public interface ITrucksRepository {
    List<Trucks> findAll();

    boolean add(Trucks trucks);

    boolean delete(int id);

    boolean update(int id, Trucks newTrucks, double ranger);

    Trucks findbyId(int id);
}
