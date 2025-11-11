package cs_shop_moblie.service;

import cs_shop_moblie.entity.DienThoai;

import java.util.ArrayList;
import java.util.List;

public interface IDienThoaiService {
    List<DienThoai> findAll();

    boolean add(DienThoai dienThoai);

}
