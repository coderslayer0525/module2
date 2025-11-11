package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;

public interface ISachRepository {
    ArrayList<Sach> findAll();

    boolean add(Sach sach);

    boolean delete(int MaTaiLieu);

    boolean update(int MaTaiLieu, Sach newSach);

    Sach findById(int MaTaiLieu);
}
