package Demotapcode.quanly_traicay.service;

import Demotapcode.quanly_traicay.entity.DuaHau;
import Demotapcode.quanly_traicay.repository.DuaHauRepository;
import Demotapcode.quanly_traicay.repository.IDuaHauRepository;

import java.util.List;

public class DuaHauService implements IDuaHauService {
    private IDuaHauRepository duaHauRepository = new DuaHauRepository();

    @Override
    public List<DuaHau> findAll() {
        return duaHauRepository.findAll();
    }

    @Override
    public boolean add(DuaHau duaHau) {
        return duaHauRepository.add(duaHau);
    }

    @Override
    public boolean delete(int ngaySanXuat) {
        return duaHauRepository.delete(ngaySanXuat);
    }

    @Override
    public boolean update(String tenTraiCay, DuaHau newDuaHau) {
        return duaHauRepository.update(tenTraiCay, newDuaHau);
    }

    @Override
    public DuaHau findByName(String tenTraiCay) {
        return duaHauRepository.findByName(tenTraiCay   );
    }
}
