package cs_shop_moblie.service;

import cs_shop_moblie.entity.DienThoai;

import java.util.ArrayList;

public interface IDienThoaiService {
    ArrayList<DienThoai> findAll();

    boolean add(DienThoai dienThoai);

    boolean delete(int imel);

    boolean update();
}
