package Demotapcode.zoo_tycoons.service;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;

import java.util.ArrayList;

public interface IThuAnCoService {
    ArrayList<ThuAnCo> findAll();

    boolean add(ThuAnCo thuAnCo);

    boolean delete(int maSo);

    boolean update(int maSo, ThuAnCo thuAnCo);

    ThuAnCo findByName(String name);
}
