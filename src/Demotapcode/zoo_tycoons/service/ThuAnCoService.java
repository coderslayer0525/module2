package Demotapcode.zoo_tycoons.service;

import Demotapcode.zoo_tycoons.entity.ThuAnCo;

import java.util.ArrayList;

public class ThuAnCoService implements IThuAnCoService {
    private ArrayList<ThuAnCo> thuAnCoArrayList = new ArrayList<>();

    @Override
    public ArrayList<ThuAnCo> findAll() {
        return thuAnCoArrayList;
    }

    @Override
    public boolean add(ThuAnCo thuAnCo) {
        return thuAnCoArrayList.add(thuAnCo);
    }

    @Override
    public boolean delete(int maSo) {
        for (ThuAnCo thuAnCo : thuAnCoArrayList) {
            if (thuAnCo.getMaSo() == maSo) {
                thuAnCoArrayList.remove(thuAnCo);
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean update(int maSo, ThuAnCo thuAnCo) {
        for (int i = 0; i < thuAnCoArrayList.size(); i++) {
            if (thuAnCoArrayList.get(i).getMaSo() == maSo){
            thuAnCoArrayList.set(i, new ThuAnCo());
            return true;
        }
    }
    return false;
}
    @Override
    public ThuAnCo findByName(String name) {
        for(int i = 0; i < thuAnCoArrayList.size();i++){
            if (thuAnCoArrayList.get(i).getName().equals(name)){
                return thuAnCoArrayList.get(i);
            }
        }
        return null;
    }
}
