package Demotapcode.game_online.service;

import Demotapcode.game_online.entity.XaThu;
import Demotapcode.game_online.repository.IXaThuRepository;
import Demotapcode.game_online.repository.XaThuRepository;

import java.util.List;

public class XaThuService implements IXaThuService{
    private IXaThuRepository xaThuRepository = new XaThuRepository();


    @Override
    public List<XaThu> findAll() {
        return xaThuRepository.findAll();
    }

    @Override
    public boolean add(XaThu xaThu) {
        return xaThuRepository.add(xaThu);
    }

    @Override
    public boolean delete(int id) {
        return xaThuRepository.delete(id);
    }

    @Override
    public boolean update(int id, XaThu xaThu) {
        return xaThuRepository.update(id, xaThu);
    }

    @Override
    public XaThu findById(int id) {
        return xaThuRepository.findById(id);
    }
}
