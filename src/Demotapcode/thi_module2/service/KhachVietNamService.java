package Demotapcode.thi_module2.service;

import Demotapcode.thi_module2.entity.KhachVietNam;
import Demotapcode.thi_module2.repository.IKhachVietNamRepository;
import Demotapcode.thi_module2.repository.KhachVietNamRepository;

import java.util.List;

public class KhachVietNamService  implements IKhachVietNamService{

    private final IKhachVietNamRepository khachVietNamRepository = new KhachVietNamRepository();
    @Override
    public List<KhachVietNam> findAll() {
        return khachVietNamRepository.findAll();
    }

    @Override
    public boolean add(KhachVietNam khachVietNam) {
        return khachVietNamRepository.add(khachVietNam);
    }

    @Override
    public boolean delete(int maKhachHang) {
        return khachVietNamRepository.delete(maKhachHang);
    }

    @Override
    public boolean update(int maKhachHang, KhachVietNam newKhachVietNam) {
        return khachVietNamRepository.update(maKhachHang, newKhachVietNam);
    }

    @Override
    public KhachVietNam findById(int maKhachHang) {
        return khachVietNamRepository.findById(maKhachHang);
    }
}
