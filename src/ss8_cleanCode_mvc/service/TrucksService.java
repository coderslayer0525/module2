package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Trucks;
import ss8_cleanCode_mvc.repository.ITrucksRepository;
import ss8_cleanCode_mvc.repository.TrucksRepository;

import java.util.ArrayList;

public class TrucksService implements ITrucksService {
    private ITrucksRepository trucksRepository = new TrucksRepository();

    @Override
    public ArrayList<Trucks> findAll() {
        return (ArrayList<Trucks>) trucksRepository.findAll();
    }

    @Override
    public boolean add(Trucks trucks) {
        return trucksRepository.add(trucks);
    }

    @Override
    public boolean update(int id, Trucks newTrucks,int ranger) {
        return true;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Trucks findbyId(int id) {
        return null;
    }
}
