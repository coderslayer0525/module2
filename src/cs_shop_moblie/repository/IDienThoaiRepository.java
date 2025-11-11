package cs_shop_moblie.repository;

import cs_shop_moblie.entity.DienThoai;

import java.util.ArrayList;
import java.util.List;

public interface IDienThoaiRepository {
   List<DienThoai> findAll();

    boolean add(DienThoai dienThoai);

}
