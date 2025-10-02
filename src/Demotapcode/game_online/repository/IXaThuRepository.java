package Demotapcode.game_online.repository;

import Demotapcode.game_online.entity.XaThu;

import java.util.List;

public interface IXaThuRepository {
    List<XaThu>  findAll();
    boolean add(XaThu xaThu);
    boolean delete(int id);
    boolean update(int id,  XaThu xaThu);

    XaThu findById(int id);
}
