package Demotapcode.game_online.service;

import Demotapcode.game_online.entity.ChienBinh;
import Demotapcode.game_online.repository.ChienBinhRepository;
import Demotapcode.game_online.repository.IChienBinhRepository;

import java.util.List;
import java.util.Map;

public class ChienBinhService implements IChienBinhService{
    private IChienBinhRepository chienBinhRepository = new ChienBinhRepository();

    @Override
    public List<ChienBinh> findAll() {
        return chienBinhRepository.findAll();
    }

    @Override
    public boolean choice(int id, int dame) {
        ChienBinh chienBinh = chienBinhRepository.findById(id);
        if (chienBinh == null){
            System.out.println(" Chien binh Khong ton tai");
            return  false;
        }
        int chienBinhConLai = chienBinh.getId() -  dame;
        chienBinh.setId(Math.max(0,chienBinhConLai));
        chienBinhRepository.update(id, chienBinh);
        System.out.println("Chien Binh" + chienBinh.getId() + chienBinh.getDame() + " dame");
        return true;
    }

    @Override
    public boolean add(ChienBinh chienBinh) {
        return chienBinhRepository.add(chienBinh);
    }

    @Override
    public boolean delete(int id) {
        return chienBinhRepository.delete(id);
    }

    @Override
    public boolean update(int id, ChienBinh newChienBinh) {
        return chienBinhRepository.update(id,newChienBinh);
    }

    @Override
    public ChienBinh findById(int id) {
        return chienBinhRepository.findById(id);
    }
}
