package Demotapcode.phamarcy_managerment.service;

import Demotapcode.phamarcy_managerment.entity.ThuocNuoc;
import Demotapcode.phamarcy_managerment.repository.IThuocNuocRepository;
import Demotapcode.phamarcy_managerment.repository.ThuocNuocRepository;

import java.util.List;

public class ThuocNuocService  implements IThuocNuocService{
    private IThuocNuocRepository thuocNuocRepository = new ThuocNuocRepository();
    @Override
    public List<ThuocNuoc> findAll() {
        return thuocNuocRepository.findAll();
    }

    @Override
    public boolean add(ThuocNuoc thuocNuoc) {
       return thuocNuocRepository.add(thuocNuoc);
    }

    @Override
    public boolean delete(int maThuoc) {
        return thuocNuocRepository.delete(maThuoc);
    }

    @Override
    public boolean update(int maThuoc, ThuocNuoc newThuocNuoc) {
        return thuocNuocRepository.update(maThuoc, newThuocNuoc);
    }

    @Override
    public ThuocNuoc findByName(String tenThuoc) {
        return thuocNuocRepository.findByName(tenThuoc);
    }
}
