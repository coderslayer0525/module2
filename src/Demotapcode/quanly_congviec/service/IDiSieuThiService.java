package Demotapcode.quanly_congviec.service;

import Demotapcode.quanly_congviec.entity.DiSieuThi;

import java.util.List;

public interface IDiSieuThiService {
    List<DiSieuThi> findAll();

    boolean add(DiSieuThi diSieuThi);

    boolean delete(int maChiTieu);

    boolean update(int maChiTieu, DiSieuThi newDiSieuThi);

    DiSieuThi findById(int maChiTieu);
}
