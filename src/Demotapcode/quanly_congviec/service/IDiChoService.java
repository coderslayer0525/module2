package Demotapcode.quanly_congviec.service;

import Demotapcode.quanly_congviec.entity.DiCho;

import java.util.List;

public interface IDiChoService {
    List<DiCho> findAll();

    boolean add(DiCho diCho);

    boolean delete(int maChiTieu);

    boolean update(int maChiTieu, DiCho newDiCho);

    DiCho findById(int maChiTieu);
}
