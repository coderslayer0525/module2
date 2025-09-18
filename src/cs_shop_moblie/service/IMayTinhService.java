package cs_shop_moblie.service;

import cs_shop_moblie.entity.MayTinh;

import java.util.ArrayList;

public interface IMayTinhService {
    ArrayList<MayTinh> findAll();

    boolean add(MayTinh mayTinh);

    boolean delete(MayTinh mayTinh1);

    boolean update();
}
