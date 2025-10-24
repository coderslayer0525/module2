package Demotapcode.quanly_congviec.service;

import Demotapcode.quanly_congviec.entity.DiSieuThi;
import Demotapcode.quanly_congviec.repository.DiSieuThiRepository;
import Demotapcode.quanly_congviec.repository.IDiSieuThiRepository;

import java.util.List;

public class DiSieuThiService implements IDiSieuThiService{
    private IDiSieuThiRepository diSieuThiRepository = new DiSieuThiRepository();
    @Override
    public List<DiSieuThi> findAll() {
        return diSieuThiRepository.findAll();
    }

    @Override
    public boolean add(DiSieuThi diSieuThi) {
        return diSieuThiRepository.add(diSieuThi);
    }

    @Override
    public boolean delete(int maChiTieu) {
        return diSieuThiRepository.delete(maChiTieu);
    }

    @Override
    public boolean update(int maChiTieu, DiSieuThi newDiSieuThi) {
        return diSieuThiRepository.update(maChiTieu, newDiSieuThi);
    }

    @Override
    public DiSieuThi findById(int maChiTieu) {
        return diSieuThiRepository.findById(maChiTieu);
    }
}
