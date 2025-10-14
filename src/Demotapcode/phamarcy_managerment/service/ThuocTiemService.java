package Demotapcode.phamarcy_managerment.service;


import Demotapcode.phamarcy_managerment.entity.ThuocTiem;
import Demotapcode.phamarcy_managerment.repository.IThuocTiemRepository;
import Demotapcode.phamarcy_managerment.repository.ThuocTiemRepository;

import java.util.List;

public class ThuocTiemService implements IThuocTiemService {
    private IThuocTiemRepository thuocTiemRepository = new ThuocTiemRepository();
    @Override
    public List<ThuocTiem> findAll() {
        return thuocTiemRepository.findAll();
    }

    @Override
    public boolean add(ThuocTiem thuocTiem) {
        return thuocTiemRepository.add(thuocTiem);
    }

    @Override
    public boolean delete(int maThuoc) {
        return thuocTiemRepository.delete(maThuoc);
    }

    @Override
    public boolean update(int maThuoc, ThuocTiem newThuocTiem) {
        return thuocTiemRepository.update(maThuoc, newThuocTiem);
    }

    @Override
    public ThuocTiem findByName(String tenThuoc) {
        return thuocTiemRepository.findByName(tenThuoc);
    }
}
