package Demotapcode.quanly_nhansu_congty.repository;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;

import java.util.ArrayList;

public interface INhanVienVanPhongRepository {
    ArrayList<NhanVienVanPhong> findAll();

    boolean add(NhanVienVanPhong nhanVienVanPhong);

    boolean delete(int maNhanVien);

    boolean update(int maNhanVien, NhanVienVanPhong newNhanVienVanPhong);

    NhanVienVanPhong findByName(String name);
}
