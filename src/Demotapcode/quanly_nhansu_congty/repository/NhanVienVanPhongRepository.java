package Demotapcode.quanly_nhansu_congty.repository;

import Demotapcode.quanly_nhansu_congty.entity.KySu;
import Demotapcode.quanly_nhansu_congty.entity.NhanVienBanHang;
import Demotapcode.quanly_nhansu_congty.entity.NhanVienVanPhong;

import java.util.ArrayList;

public class NhanVienVanPhongRepository implements  INhanVienVanPhongRepository{
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
        for (NhanVienVanPhong nhanVienVanPhong: nhanVienVanPhongArrayList){
            if (nhanVienVanPhong.getMaNhanVien()== maNhanVien){
                nhanVienVanPhongArrayList.remove(nhanVienVanPhong);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean update(int maNhanVien, NhanVienVanPhong newNhanVienVanPhong) {
        for (int i = 0; i < nhanVienVanPhongArrayList.size(); i++) {
            if (nhanVienVanPhongArrayList.get(i).getMaNhanVien() == new KySu().getMaNhanVien()) {
                nhanVienVanPhongArrayList.set(i, new NhanVienVanPhong());
                return true;
            }
        }
        return false;
    }

    @Override
    public NhanVienVanPhong findByName(String name) {
        for (int i = 0; i< nhanVienVanPhongArrayList.size();i++){
            if (nhanVienVanPhongArrayList.equals(name)){
                return nhanVienVanPhongArrayList.get(i);
            }
        }
        return null;
    }
}
