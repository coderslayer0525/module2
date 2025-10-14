package Demotapcode.phamarcy_managerment.service;

import Demotapcode.phamarcy_managerment.entity.ThuocVien;

import java.util.List;

public interface IThuocVienService {
    List<ThuocVien> findAll();

    boolean add(ThuocVien thuocVien);

    boolean delete(int maThuoc);

    boolean update(int maThuoc, ThuocVien newThuocVien);

    ThuocVien findByName(String tenThuoc);
}
