package Demotapcode.quanly_nhansu_congty.service;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;

import java.util.ArrayList;

public class NhanVienBanHangService  implements  INhanVienBanHangService{
    private ArrayList<NhanVienBanHang> nhanVienBanHangArrayList = new ArrayList<>();
    @Override
    public ArrayList<NhanVienBanHang> findAll() {
        return nhanVienBanHangArrayList;
    }

    @Override
    public boolean add(NhanVienBanHang nhanVienBanHang) {
        return nhanVienBanHangArrayList.add(nhanVienBanHang);
    }

    @Override
    public boolean delete(int maNhanVien) {
        for (NhanVienBanHang nhanVienBanHang : nhanVienBanHangArrayList){
            if (nhanVienBanHang.getMaNhanVien() == maNhanVien){
                nhanVienBanHangArrayList.remove(nhanVienBanHang);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maNhanVien, NhanVienBanHang newNhanVienbanHang) {
        for (int i = 0; i < nhanVienBanHangArrayList.size(); i++){
            if (nhanVienBanHangArrayList.get(i).getMaNhanVien() == maNhanVien){
                nhanVienBanHangArrayList.set(i, newNhanVienbanHang);
                return true;
            }
        }
        return false;
    }

    @Override
    public NhanVienBanHang findById(String name) {
        for (int i = 0; i < nhanVienBanHangArrayList.size(); i++){
            if (nhanVienBanHangArrayList.get(i).getName().equals(name)){
                return nhanVienBanHangArrayList.get(i);
            }
        }
        return null;
    }
}
