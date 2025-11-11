package Demotapcode.quanly_nhansu_congty.service;

import Demotapcode.quanly_nhansu_congty.entity.KySu;

import java.util.ArrayList;

public class KySuService  implements  IKySuService{
    private ArrayList<KySu> kySuArrayList = new ArrayList<>();
    @Override
    public ArrayList<KySu> findAll() {
        return kySuArrayList;
    }

    @Override
    public boolean add(KySu kySu) {
        return kySuArrayList.add(kySu);
    }

    @Override
    public boolean delete(int maNhanVien) {
        for (KySu kySu : kySuArrayList){
            if (kySu.getMaNhanVien()== maNhanVien){
                kySuArrayList.remove(kySu);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maNhanVien, KySu newKySu) {
        for (int i = 0; i < kySuArrayList.size(); i++) {
            if (kySuArrayList.get(i).getMaNhanVien() == newKySu.getMaNhanVien()) {
                kySuArrayList.set(i, newKySu);
                return true;
            }
        }
        return false;
    }

    @Override
    public KySu findById(String name) {
        for (int i = 0; i < kySuArrayList.size(); i++){
            if (kySuArrayList.get(i).getName().equals(name)){
                return kySuArrayList.get(i);
            }
        }
        return null;
    }
}
