package Demotapcode.Thuvien.service;

import Demotapcode.Thuvien.repository.ITapChiRepository;
import Demotapcode.Thuvien.repository.TapChiRepository;
import Demotapcode.Thuvien.entity.TapChi;

import java.util.ArrayList;

public class TapChiService implements ITapChiService{
    private ITapChiRepository tapChiRepository = new TapChiRepository();

    @Override
    public ArrayList<TapChi> findAll() {
        return tapChiRepository.findAll();
    }

    @Override
    public boolean add(TapChi tapChi) {
        return tapChiRepository.add(tapChi);
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        return tapChiRepository.delete(MaTaiLieu);
    }

    @Override
    public boolean update(int MaTaiLieu, TapChi newTapChi) {
        return tapChiRepository.update(MaTaiLieu, newTapChi);
    }

    @Override
    public TapChi findById(int MaTaiLieu) {
        return tapChiRepository.findById(MaTaiLieu);
    }
}
