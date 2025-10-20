package Demotapcode.quanly_traicay.repository;

import Demotapcode.quanly_traicay.entity.DuaHau;

import java.io.IOException;
import java.util.List;

public interface IDuaHauRepository {
    List<DuaHau> findAll() ;

    boolean add(DuaHau duaHau);

    boolean delete(int ngaySanXuat);


    boolean update(String tenTraiCay, DuaHau newDuaHau);

    DuaHau findByName(String tenTraiCay);
}
