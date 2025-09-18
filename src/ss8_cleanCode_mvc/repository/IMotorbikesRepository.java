package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.ArrayList;
import java.util.List;

public interface IMotorbikesRepository {
    List<Motorbikes> findAll();

    boolean add(Motorbikes motorbikes);

    boolean delete(int id);

    boolean update(int id, Motorbikes newMotorbikes,int power);

    Motorbikes findbyId(int id);

}
