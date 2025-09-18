package cs_shop_moblie.repository;

import cs_shop_moblie.entity.MayTinh;

import java.util.ArrayList;

public interface IMayTinhRepository {
    ArrayList<MayTinh> findAll();

    boolean add(MayTinh mayTinh);

    boolean delete();

    boolean update();
}
