package Demotapcode.zoo_tycoons.repository;

import Demotapcode.zoo_tycoons.entity.Chim;

import java.util.ArrayList;

public interface IChimRepository {
    ArrayList<Chim> findAll();

    boolean add(Chim chim);

    boolean delete(int maSo);

    boolean update(int maSo, Chim chim);

    Chim findByName(String name);

}
