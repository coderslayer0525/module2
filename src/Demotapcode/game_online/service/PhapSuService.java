package Demotapcode.game_online.service;

import Demotapcode.game_online.entity.PhapSu;
import Demotapcode.game_online.repository.IPhapSuRepository;
import Demotapcode.game_online.repository.PhapSuRepository;

import java.util.List;

public class PhapSuService implements IPhapSuService{
    private IPhapSuRepository phapSuRepository = new PhapSuRepository();

    @Override
    public List<PhapSu> findAll() {
        return phapSuRepository.findAll();
    }

    @Override
    public boolean add(PhapSu phapSu) {
        return phapSuRepository.add(phapSu);
    }

    @Override
    public boolean delete(int id) {
        return phapSuRepository.delete(id);
    }

    @Override
    public boolean update(int id, PhapSu newPhapSu) {
        return phapSuRepository.update(id,newPhapSu);
    }



    @Override
    public PhapSu findById(int id) {
        return phapSuRepository.findById(id);
    }
}
