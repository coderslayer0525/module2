package Demotapcode.spa_nuru.service;

import Demotapcode.spa_nuru.entity.Dep;
import Demotapcode.spa_nuru.repository.DepRepository;
import Demotapcode.spa_nuru.repository.IDepRepository;
import Demotapcode.spa_nuru.repository.PgKhachVip;
import Demotapcode.spa_nuru.util.ReadAndWriteFile;

import java.util.List;

public class DepService implements IDepService{
    private final IDepRepository depRepository = new DepRepository();
    private final IDepRepository vipRepository = new PgKhachVip();
    @Override
    public List<Dep> findAll() {
        return depRepository.findAll();
    }

    @Override
    public boolean add(Dep dep) {
        return depRepository.add(dep);
    }

    @Override
    public Dep findById(int maSo) {
        return depRepository.findById(maSo);
    }


    @Override
    public List<Dep> searchByName(String keyWord) {
        return vipRepository.searchByName(keyWord);
    }

    @Override
    public boolean delete(int maSo) {
        return  depRepository.delete(maSo);
    }
}
