package Demotapcode.game_online.service;

import Demotapcode.game_online.entity.PhapSu;

import java.util.List;

public interface IPhapSuService {
    List<PhapSu> findAll();
    boolean add(PhapSu phapSu);
    boolean delete(int id);
    boolean update(int id, PhapSu newPhapSu);
    PhapSu findById(int id);
}
