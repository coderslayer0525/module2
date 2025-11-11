package Demotapcode.phamarcy_managerment.service;

import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;

import java.util.List;

public interface IThuocNuocService {
    List<ThuocNuoc> findAll();

    boolean add(ThuocNuoc thuocNuoc);

    boolean delete(int maThuoc);

    boolean update(int maThuoc, ThuocNuoc newThuocNuoc);

    ThuocNuoc findByName(String tenThuoc);
}
