package cs_shop_moblie.service;

import cs_shop_moblie.entity.DienThoai;

import java.util.ArrayList;

public class DienThoaiService  implements  IDienThoaiService{
    @Override
    public ArrayList<DienThoai> findAll() {
        return null;
    }

    @Override
    public boolean add(DienThoai dienThoai) {
        return true;
    }

    @Override
    public boolean delete(int imel) {
        return true;
    }

    @Override
    public boolean update() {
        return false;
    }
}
