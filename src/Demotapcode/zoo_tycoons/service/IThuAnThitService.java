package Demotapcode.zoo_tycoons.service;

import Demotapcode.zoo_tycoons.entity.ThuAnThit;

import java.util.ArrayList;

public interface IThuAnThitService {
    ArrayList<ThuAnThit> findAll();

    boolean add(ThuAnThit thuAnThit);

    boolean delete(int maSo);

    boolean update(int maSo, ThuAnThit thuAnThit);

    ThuAnThit findByName(String name);
}
