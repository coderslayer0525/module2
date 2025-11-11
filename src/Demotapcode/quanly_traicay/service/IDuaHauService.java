package Demotapcode.quanly_traicay.service;

import Demotapcode.quanly_traicay.entity.DuaHau;

import java.util.List;

public interface IDuaHauService {
    List<DuaHau> findAll();

    boolean add(DuaHau duaHau);

    boolean delete(int ngaySanXuat);

    boolean update(String tenTraiCay, DuaHau newDuaHau);

    DuaHau findByName(String tenTraiCay);

}
