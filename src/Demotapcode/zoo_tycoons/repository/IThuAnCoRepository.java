package Demotapcode.zoo_tycoons.repository;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;

import java.util.ArrayList;

public interface IThuAnCoRepository {
    ArrayList<ThuAnCo> findAll();

    boolean add(ThuAnCo thuAnCo);

    boolean delete(int maSo);

    boolean update(int maSo, ThuAnCo thuAnCo);

    ThuAnCo finbByName(String name);
}
