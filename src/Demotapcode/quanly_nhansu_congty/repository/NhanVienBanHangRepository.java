package Demotapcode.quanly_nhansu_congty.repository;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;

import java.util.ArrayList;

public class NhanVienBanHangRepository implements INhanVienBanHangRepository {
    private ArrayList<NhanVienBanHang> nhanVienBanHangArrayList = new ArrayList<>();
    @Override
    public ArrayList<NhanVienBanHang> findAll() {
        return nhanVienBanHangArrayList;
    }

    @Override
    public boolean add(NhanVienBanHang nhanVienBanHang) {
        return  nhanVienBanHangArrayList.add(nhanVienBanHang);
    }

    @Override
    public boolean delete(int maNhanVien) {
        for (NhanVienBanHang nhanVienBanHang : nhanVienBanHangArrayList){
            if(nhanVienBanHang.getMaNhanVien()== maNhanVien){
                nhanVienBanHangArrayList.remove(nhanVienBanHang);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maNhanVien, NhanVienBanHang newNhanVienBanHang) {
        for (int i = 0; i < nhanVienBanHangArrayList.size(); i++){
            if (nhanVienBanHangArrayList.get(i).getMaNhanVien() == new NhanVienBanHang().getMaNhanVien()){
                nhanVienBanHangArrayList.set(i, new NhanVienBanHang());
                return true;
            }
        }
        return false;
    }

    @Override
    public NhanVienBanHang findByName(String name) {
        for (int i = 0; i < nhanVienBanHangArrayList.size(); i++)
            if (nhanVienBanHangArrayList.equals(name)){
                return  nhanVienBanHangArrayList.get(i);
            }
        return null;
    }
}
