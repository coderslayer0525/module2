package ss8_mvc_quanly_phuongtien.service;

import ss8_mvc_quanly_phuongtien.entity.Cars;
import ss8_mvc_quanly_phuongtien.repository.CarsRepository;
import ss8_mvc_quanly_phuongtien.repository.ICarsRepository;

import java.util.List;

public class CarsService implements ICarsService {
    private ICarsRepository carsRepository = new CarsRepository();

    @Override
    public List<Cars> findAll() {
        return carsRepository.findAll();
    }

    @Override
    public boolean add(Cars cars) {
        return carsRepository.add(cars);
    }

    @Override
    public boolean delete(int id) {
        return carsRepository.delete(id);
    }

    @Override
    public boolean update(int id, Cars newCars, int slot) {
        return carsRepository.update(id, newCars,slot);
    }



    @Override
    public Cars findbyId(int id) {
        return carsRepository.findbyId(id);
    }
}