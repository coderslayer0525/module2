package Demotapcode.quanly_nhansu_congty.service;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;

import java.util.ArrayList;

public interface INhanVienBanHangService {
    ArrayList<NhanVienBanHang> findAll();

    boolean add(NhanVienBanHang nhanVienBanHang);

    boolean delete(int maNhanVien);

    boolean update(int maNhanVien, NhanVienBanHang newNhanVienbanHang);

    NhanVienBanHang findById(String name);
}
