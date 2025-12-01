package Demotapcode.thi_module2.repository;

import Demotapcode.thi_module2.entity.KhachVietNam;

import java.util.List;

public interface IKhachVietNamRepository {

    List<KhachVietNam> findAll();

    boolean add(KhachVietNam khachVietNam);

    boolean delete(int maKhachHang);

    boolean update(int maKhachHang, KhachVietNam newKhachVietNam);

    KhachVietNam findById(int maKhachHang);
}
