package Demotapcode.thi_module2.service;

import Demotapcode.thi_module2.entity.KhachVietNam;

import java.util.List;

public interface IKhachVietNamService {
    List<KhachVietNam> findAll();

    boolean add(KhachVietNam khachVietNam);

    boolean delete(int maKhachHang);

    boolean update(int maKhachHang, KhachVietNam newKhachVietNam);

    KhachVietNam findById(int maKhachHang);
}
