package Demotapcode.phamarcy_managerment.service;

import Demotapcode.phamarcy_managerment.entity.ThuocTiem;

import java.util.List;

public interface IThuocTiemService {
    List<ThuocTiem> findAll();

    boolean add(ThuocTiem thuocTiem);

    boolean delete(int maThuoc);

    boolean update(int maThuoc, ThuocTiem newThuocTiem);

    ThuocTiem findByName(String tenThuoc);
}
