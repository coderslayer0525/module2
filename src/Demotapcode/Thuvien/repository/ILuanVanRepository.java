package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;

public interface ILuanVanRepository {
    ArrayList<LuanVan> findAll();

    boolean add(LuanVan luanVan);

    boolean delete(int MaTaiLieu);

    boolean update(int MaLuanVan, LuanVan newLuanVan);

    LuanVan findById(int MaTaiLieu);
}
