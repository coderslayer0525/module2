package Demotapcode.quanly_congviec.service;

import Demotapcode.quanly_congviec.entity.DiCho;
import Demotapcode.quanly_congviec.repository.DiChoRepository;
import Demotapcode.quanly_congviec.repository.IDiChoRepository;

import java.util.List;

public class DiChoService implements IDiChoService {
    private IDiChoRepository diChoRepository = new DiChoRepository();

    @Override
    public List<DiCho> findAll() {
        return diChoRepository.findAll();
    }

    @Override
    public boolean add(DiCho diCho) {
        return diChoRepository.add(diCho);
    }

    @Override
    public boolean delete(int maChiTieu) {
        return diChoRepository.delete(maChiTieu);
    }

    @Override
    public boolean update(int maChiTieu, DiCho newDiCho) {
        return diChoRepository.update(maChiTieu, newDiCho);
    }

    @Override
    public DiCho findById(int maChiTieu) {
        return diChoRepository.findById(maChiTieu);
    }
}
