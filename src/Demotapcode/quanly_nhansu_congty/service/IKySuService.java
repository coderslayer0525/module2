package Demotapcode.quanly_nhansu_congty.service;

import Demotapcode.quanly_nhansu_congty.entity.KySu;

import java.util.ArrayList;

public interface IKySuService {
    ArrayList<KySu> findAll();

    boolean add(KySu kySu);

    boolean delete(int maNhanVien);

    boolean update(int maNhanVien, KySu newKySu);

    KySu findById(String name);
}
