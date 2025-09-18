package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;

public class LuanVanRepository  implements ILuanVanRepository{
    private ArrayList<LuanVan> luanVanArrayList = new ArrayList<>();

    @Override
    public ArrayList<LuanVan> findAll() {
        return luanVanArrayList;
    }

    @Override
    public boolean add(LuanVan luanVan) {
        return luanVanArrayList.add(luanVan);
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        for (LuanVan luanVan : luanVanArrayList){
            if (luanVan.getMaTaiLieu() == luanVan.getMaTaiLieu()){
                luanVanArrayList.remove(luanVan);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int MaLuanVan, LuanVan newLuanVan) {
        for (int i = 0; i < luanVanArrayList.size(); i++){
            if (luanVanArrayList.get(i).getMaTaiLieu() == newLuanVan.getMaTaiLieu()){
                luanVanArrayList.set(i, newLuanVan);
                return true;
            }
        }
        return false;
    }

    @Override
    public LuanVan findById(int MaTaiLieu) {
        for (int i = 0; i < luanVanArrayList.size(); i++) {
            if(luanVanArrayList.get(i).getMaTaiLieu() == MaTaiLieu){
                return luanVanArrayList.get(i);
            }
        }
        return null;
    }
}
