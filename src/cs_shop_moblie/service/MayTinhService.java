package cs_shop_moblie.service;

import cs_shop_moblie.entity.MayTinh;

import java.util.ArrayList;

public class MayTinhService implements IMayTinhService{
    @Override
    public ArrayList<MayTinh> findAll() {
        return null;
    }

    @Override
    public boolean add(MayTinh mayTinh) {
        return true;
    }


    @Override
    public boolean delete(MayTinh mayTinh1) {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }
}
