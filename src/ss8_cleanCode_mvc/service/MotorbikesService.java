package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Motorbikes;
import ss8_cleanCode_mvc.repository.IMotorbikesRepository;
import ss8_cleanCode_mvc.repository.MotorbikesRepository;

import java.util.ArrayList;
import java.util.List;

public class MotorbikesService implements IMotorbikesService {
    private IMotorbikesRepository motorbikesRepository = new MotorbikesRepository();

    @Override
    public List<Motorbikes> findAll() {
        return motorbikesRepository.findAll();
    }

    @Override
    public boolean add(Motorbikes motorbikes) {
        return motorbikesRepository.add(motorbikes);
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Motorbikes newMotorbikes,int power) {
        return true;
    }

    @Override
    public Motorbikes findbyId(int id) {
        return null;
    }
}
