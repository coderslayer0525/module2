package Demotapcode.game_online.service;

import Demotapcode.game_online.entity.ChienBinh;

import java.util.List;

public interface IChienBinhService {
    List<ChienBinh> findAll();

    boolean choice(int id, int lever);

    boolean add(ChienBinh chienBinh);

    boolean delete(int id);

    boolean update(int id, ChienBinh newChienBinh);


    ChienBinh findById(int id);
}
