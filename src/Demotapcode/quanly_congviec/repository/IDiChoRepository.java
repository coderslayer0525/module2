package Demotapcode.quanly_congviec.repository;

import Demotapcode.quanly_congviec.entity.DiCho;

import java.util.List;

public interface IDiChoRepository {
    List<DiCho> findAll();

    boolean add(DiCho diCho);

    boolean delete(int maChiTieu);

    boolean update(int maChiTieu, DiCho newDiCho);

    DiCho findById(int maChiTieu);
}
