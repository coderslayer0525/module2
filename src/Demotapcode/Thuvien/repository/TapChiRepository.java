package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.TapChi;

import java.util.ArrayList;

public class TapChiRepository  implements  ITapChiRepository{
    private ArrayList<TapChi> tapChiArrayList= new ArrayList<>();

    @Override
    public ArrayList<TapChi> findAll() {
        return tapChiArrayList;
    }

    @Override
    public boolean add(TapChi tapChi) {
        return tapChiArrayList.add(tapChi);
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        for (TapChi tapChi : tapChiArrayList){
            if (tapChi.getMaTaiLieu()== tapChi.getMaTaiLieu()){
                tapChiArrayList.remove(tapChi);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int MaTaiLieu, TapChi newTapChi) {
        for (int i = 0; i < tapChiArrayList.size(); i++) {
            if (tapChiArrayList.get(i).getMaTaiLieu() == newTapChi.getMaTaiLieu()) {
                tapChiArrayList.set(i, newTapChi);
                return true;
            }
        }
        return false;
    }

    @Override
    public TapChi findById(int MaTaiLieu) {
        for(TapChi tapChi : tapChiArrayList){
            if (tapChi.getMaTaiLieu() == tapChi.getMaTaiLieu()){
                return tapChi;
            }
        }
        return null;
    }
}
