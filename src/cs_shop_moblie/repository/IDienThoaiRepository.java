package cs_shop_moblie.repository;

import cs_shop_moblie.entity.DienThoai;

import java.util.ArrayList;

public interface IDienThoaiRepository {
    ArrayList<DienThoai> findAll();

    boolean add(DienThoai dienThoai);

    boolean delete();

    boolean update();

}
