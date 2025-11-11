package Demotapcode.spa_nuru.repository;

import Demotapcode.spa_nuru.entity.Dep;

import java.util.List;

public interface IDepRepository {
    List<Dep> findAll();

    boolean add(Dep dep);

    boolean update(int maSo, Dep newDep);

    boolean delete(int maSo);

    List<Dep>
    searchByName(String keyword);

    Dep findById(int maSo);
}
