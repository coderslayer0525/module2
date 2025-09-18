package Demotapcode.Thuvien.service;

import Demotapcode.Thuvien.repository.ISachRepository;
import Demotapcode.Thuvien.repository.SachRepository;
import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;

public class SachService implements  ISachService{
    private ISachRepository sachRepository = new SachRepository();

    @Override
    public ArrayList<Sach> findAll() {
        return sachRepository.findAll();
    }

    @Override
    public boolean add(Sach sach) {
        return sachRepository.add(sach);
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        return sachRepository.delete(MaTaiLieu);
    }

    @Override
    public boolean update(int MaTaiLieu, Sach newSach) {
        return sachRepository.update(MaTaiLieu, newSach);
    }

    @Override
    public Sach findById(int MaTaiLieu) {
        return sachRepository.findById(MaTaiLieu);
    }
}
