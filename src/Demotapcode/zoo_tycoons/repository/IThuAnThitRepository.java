package Demotapcode.zoo_tycoons.repository;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;
import Demotapcode.zoo_tycoons.entity.ThuAnThit;

import java.util.ArrayList;

public interface IThuAnThitRepository {
    ArrayList<ThuAnThit> findAll();

    boolean add(ThuAnThit thuAnThit);

    boolean delete(int maSo);

    boolean update(int maSo, ThuAnThit thuAnThit);

    ThuAnThit findByName(String name);
}
