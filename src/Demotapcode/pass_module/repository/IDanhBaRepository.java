package Demotapcode.pass_module.repository;

import Demotapcode.pass_module.entity.DanhBa;

import java.util.List;

public interface IDanhBaRepository {
    List<DanhBa> findAll();

    boolean add(DanhBa danhBa);

    boolean update(int soDienThoai, DanhBa newDanhBa);

    boolean delete(int soDienThoai);

    List <DanhBa> findByName(String keyWords);

}
