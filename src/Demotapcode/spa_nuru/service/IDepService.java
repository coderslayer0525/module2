package Demotapcode.spa_nuru.service;

import Demotapcode.spa_nuru.entity.Dep;

import java.util.List;

public interface IDepService {
    List<Dep> findAll();

    boolean add(Dep dep);

    Dep findById(int maSo);

   List<Dep> searchByName(String keyWord);


    boolean delete(int maSo);
}
