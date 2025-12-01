package Demotapcode.pass_module.service;

import Demotapcode.pass_module.entity.DanhBa;
import Demotapcode.pass_module.repository.DanhBaRepository;
import Demotapcode.pass_module.repository.IDanhBaRepository;

import java.util.List;

public class DanhBaService implements IDanhBaService{
    private final IDanhBaRepository danhBaRepository = new DanhBaRepository();

    @Override
    public List<DanhBa> findAll() {
        return danhBaRepository.findAll();
    }

    @Override
    public boolean add(DanhBa danhBa) {
        return danhBaRepository.add(danhBa);
    }

    @Override
    public boolean update(int soDienThoai, DanhBa newDanhBa) {
        return danhBaRepository.update(soDienThoai, newDanhBa);
    }

    @Override
    public boolean delete(int soDienThoai) {
        return danhBaRepository.delete(soDienThoai);
    }

    @Override
    public List<DanhBa> findByName(String keyWords) {
        return danhBaRepository.findByName(keyWords);
    }
}
