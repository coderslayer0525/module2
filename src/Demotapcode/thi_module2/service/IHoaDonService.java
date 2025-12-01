package Demotapcode.thi_module2.service;

import Demotapcode.thi_module2.entity.HoaDon;

import java.io.IOException;
import java.util.List;

public interface IHoaDonService {
    List<HoaDon> findAll();

    boolean add(HoaDon hoaDon) throws IOException;

    HoaDon findById(String maHoaDon) throws IOException;

    void update(String maHoaDon, HoaDon newHoaDon) throws IOException;

    void displayDetail();

    // Hiển thị danh sách hóa đơn
    void displayAll() throws IOException;

    void update();
}
