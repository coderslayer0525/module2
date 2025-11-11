package Demotapcode.quanly_nhansu_congty.service;

import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;

import java.util.ArrayList;

public class NhanVienVanPhongService  implements  INhanVienVanPhongService{
    private ArrayList<NhanVienVanPhong> nhanVienVanPhongArrayList = new ArrayList<>();
    @Override
    public ArrayList<NhanVienVanPhong> findAll() {
        return nhanVienVanPhongArrayList;
    }

    @Override
    public boolean add(NhanVienVanPhong nhanVienVanPhong) {
        return nhanVienVanPhongArrayList.add(nhanVienVanPhong);
    }

    @Override
    public boolean delete(int maNhanVien) {
        for (NhanVienVanPhong nhanVienVanPhong : nhanVienVanPhongArrayList){
            if (nhanVienVanPhong.getMaNhanVien()==maNhanVien){
                nhanVienVanPhongArrayList.remove(nhanVienVanPhong);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maNhanVien, NhanVienVanPhong newNhanVienVanPhong) {
        for (int i = 0; i < nhanVienVanPhongArrayList.size(); i++){
            if (nhanVienVanPhongArrayList.get(i).getMaNhanVien()== newNhanVienVanPhong.getMaNhanVien()){
                nhanVienVanPhongArrayList.set(i, newNhanVienVanPhong);
                return true;
            }
        }
        return false;
    }

    @Override
    public NhanVienVanPhong findById(String name) {
        for (int i = 0; i< nhanVienVanPhongArrayList.size(); i++){
            if (nhanVienVanPhongArrayList.get(i).getName().equals(name)){
                return  nhanVienVanPhongArrayList.get(i);
            }
        }
        return null;
    }
}
