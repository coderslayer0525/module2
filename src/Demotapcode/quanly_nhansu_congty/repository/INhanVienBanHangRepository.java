package Demotapcode.quanly_nhansu_congty.repository;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;

import java.util.ArrayList;

public interface INhanVienBanHangRepository {
    ArrayList<NhanVienBanHang> findAll();

    boolean add(NhanVienBanHang nhanVienBanHang);

    boolean delete(int maNhanVien);

    boolean update(int maNhanVien, NhanVienBanHang newNhanVienBanHang);

    NhanVienBanHang findByName(String name);
}
