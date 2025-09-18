package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Trucks;

import java.util.ArrayList;
import java.util.List;

public interface ITrucksService {
    List<Trucks> findAll();

    boolean add(Trucks trucks);

    boolean update(int id, Trucks newTrucks, int ranger);

    boolean delete(int id);

    Trucks findbyId(int id);
}
