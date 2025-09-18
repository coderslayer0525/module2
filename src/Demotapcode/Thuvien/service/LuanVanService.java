package Demotapcode.Thuvien.service;

import Demotapcode.Thuvien.repository.ILuanVanRepository;
import Demotapcode.Thuvien.repository.LuanVanRepository;
import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;

public class LuanVanService  implements ILuanVanService{
    private ILuanVanRepository luanVanRepository = new LuanVanRepository();

    @Override
    public ArrayList<LuanVan> findAll() {
        return luanVanRepository.findAll();
    }

    @Override
    public boolean add(LuanVan luanVan) {
        return luanVanRepository.add(luanVan);
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        return luanVanRepository.delete(MaTaiLieu);
    }

    @Override
    public boolean update(int MaTaiLieu, LuanVan newLuanVan) {
        return luanVanRepository.update(MaTaiLieu,newLuanVan);
    }

    @Override
    public LuanVan findById(int MaTaiLieu) {
        return luanVanRepository.findById(MaTaiLieu);
    }
}
