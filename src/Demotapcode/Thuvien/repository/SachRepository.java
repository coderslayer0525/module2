package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;

public class SachRepository implements ISachRepository{
    private ArrayList<Sach> sachArrayList = new ArrayList<>();
    @Override
    public ArrayList<Sach> findAll() {
        return sachArrayList;
    }

    @Override
    public boolean add(Sach sach) {
        return sachArrayList.add(sach);
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        for (Sach sach : sachArrayList){
            if (sach.getMaTaiLieu() == sach.getMaTaiLieu()){
                sachArrayList.remove(sach);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int MaTaiLieu, Sach newSach) {
        for (int i = 0; i < sachArrayList.size(); i++){
            if (sachArrayList.get(i).getMaTaiLieu() == newSach.getMaTaiLieu()){
                sachArrayList.set(i, newSach);
                return true;
            }
        }
        return  false;
    }

    @Override
    public Sach findById(int MaTaiLieu) {
        for (int i = 0; i < sachArrayList.size(); i++) {
            if(sachArrayList.get(i).getMaTaiLieu() == MaTaiLieu){
                return sachArrayList.get(i);
            }
        }
        return null;
    }
}
