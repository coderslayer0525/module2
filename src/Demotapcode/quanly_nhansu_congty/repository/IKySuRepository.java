package Demotapcode.quanly_nhansu_congty.repository;

import Demotapcode.quanly_nhansu_congty.entity.KySu;

import java.util.ArrayList;

public interface IKySuRepository {

    ArrayList<KySu> findAll();

    boolean add(KySu kySu);

    boolean delete(int maNhanVien);

    boolean update(int maNhanVien, KySu kySu);

    KySu findByName(String name);
}
