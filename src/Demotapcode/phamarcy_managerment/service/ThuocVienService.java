package Demotapcode.phamarcy_managerment.service;

import Demotapcode.phamarcy_managerment.entity.ThuocVien;
import Demotapcode.phamarcy_managerment.repository.IThuocVienRepository;
import Demotapcode.phamarcy_managerment.repository.ThuocVienRepository;

import java.util.List;

public class ThuocVienService implements  IThuocVienService{
    private IThuocVienRepository thuocVienRepository = new ThuocVienRepository();
    @Override
    public List<ThuocVien> findAll() {
        return thuocVienRepository.findAll();
    }

    @Override
    public boolean add(ThuocVien thuocVien) {
        return thuocVienRepository.add(thuocVien);
    }

    @Override
    public boolean delete(int maThuoc) {
        return thuocVienRepository.delete(maThuoc);
    }

    @Override
    public boolean update(int maThuoc, ThuocVien newThuocVien) {
        return thuocVienRepository.update(maThuoc, newThuocVien);
    }

    @Override
    public ThuocVien findByName(String tenThuoc) {
        return thuocVienRepository.findByName(tenThuoc);
    }
}
