package Demotapcode.zoo_tycoons.service;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;
import Demotapcode.zoo_tycoons.entity.ThuAnThit;

import java.util.ArrayList;

public class ThuAnThitService implements IThuAnThitService {
    private ArrayList<ThuAnThit> thuAnThitArrayList = new ArrayList<>();

    @Override
    public ArrayList<ThuAnThit> findAll() {
        return thuAnThitArrayList;
    }

    @Override
    public boolean add(ThuAnThit thuAnThit) {
        return thuAnThitArrayList.add(thuAnThit);
    }

    @Override
    public boolean delete(int maSo) {
        for (ThuAnThit thuAnThit : thuAnThitArrayList) {
            if (thuAnThit.getMaSo() == maSo) {
                thuAnThitArrayList.remove(thuAnThit);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maSo, ThuAnThit thuAnThit) {
        for (int i = 0; i < thuAnThitArrayList.size(); i++) {
            if (thuAnThitArrayList.get(i).getMaSo() == maSo){
                thuAnThitArrayList.set(i, new ThuAnThit());
                return true;
            }
        }
        return false;
    }

    @Override
    public ThuAnThit findByName(String name) {
        for(int i = 0; i < thuAnThitArrayList.size();i++){
            if (thuAnThitArrayList.get(i).getName().equals(name)){
                return thuAnThitArrayList.get(i);
            }
        }
        return null;
    }
}
