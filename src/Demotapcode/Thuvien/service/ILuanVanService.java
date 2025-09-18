package Demotapcode.Thuvien.service;

import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;

public interface ILuanVanService {
    ArrayList<LuanVan> findAll();

    boolean add(LuanVan luanVan);

    boolean delete(int MaTaiLieu);

    boolean update(int MaTaiLieu, LuanVan newLuanVan);

    LuanVan findById(int MaTaiLieu);
}
