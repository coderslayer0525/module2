package Demotapcode.zoo_tycoons.repository;

import Demotapcode.zoo_tycoons.entity.Chim;

import java.util.ArrayList;

public class ChimRepository implements IChimRepository{
    private ArrayList<Chim>  chimArrayList = new ArrayList<>();
    @Override
    public ArrayList<Chim> findAll() {
        return chimArrayList;
    }

    @Override
    public boolean add(Chim chim) {
        return chimArrayList.add(chim);
    }

    @Override
    public boolean delete(int maSo) {
        for (Chim chim : chimArrayList){
            if (chim.getMaSo() == maSo){
                chimArrayList.remove(chim);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int maSo, Chim chim) {
        for (int i = 0;i < chimArrayList.size();i++){
            if (chimArrayList.get(i).getMaSo()== new Chim().getMaSo()){
                chimArrayList.set(i, new Chim());
            }
        }
        return false;
    }

    @Override
    public Chim findByName(String name) {
        for (int i = 0; i < chimArrayList.size(); i++)
            if (chimArrayList.equals(name)){
                return chimArrayList.get(i);
            }
        return  null;
    }
}
