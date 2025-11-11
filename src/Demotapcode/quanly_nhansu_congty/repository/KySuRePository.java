package Demotapcode.quanly_nhansu_congty.repository;

import Demotapcode.quanly_nhansu_congty.entity.KySu;

import java.util.ArrayList;

public class KySuRePository implements IKySuRepository {
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
        for (KySu kySu : kySuArrayList) {
            if (kySu.getMaNhanVien() == maNhanVien) {
                kySuArrayList.remove(kySu);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maNhanVien, KySu kySu) {
        for (int i = 0; i < kySuArrayList.size(); i++) {
            if (kySuArrayList.get(i).getMaNhanVien() == new KySu().getMaNhanVien()) {
                kySuArrayList.set(i, new KySu());
                return true;
            }
        }
        return false;
    }

    @Override
    public KySu findByName(String name) {
        for ( int i = 0; i < kySuArrayList.size(); i++)
            if(kySuArrayList.equals(name)){
                return kySuArrayList.get(i);
            }

        return null;
    }
}
