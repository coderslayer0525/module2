package Demotapcode.quanly_nhansu_congty.service;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;

import java.util.ArrayList;

public interface INhanVienVanPhongService {
    ArrayList<NhanVienVanPhong> findAll();

    boolean add(NhanVienVanPhong nhanVienVanPhong);

    boolean delete(int maNhanVien);

    boolean update(int maNhanVien, NhanVienVanPhong newNhanVienVanPhong);

    NhanVienVanPhong findById(String name);
}
