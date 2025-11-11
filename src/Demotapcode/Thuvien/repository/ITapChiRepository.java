package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.TapChi;

import java.util.ArrayList;

public interface ITapChiRepository {
    ArrayList<TapChi> findAll();

    boolean add(TapChi tapChi);

    boolean delete(int MaTaiLieu);

    boolean update(int MaTaiLieu, TapChi newTapChi);

    TapChi findById(int MaTaiLieu);
}
