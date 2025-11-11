package Demotapcode.spa_nuru.repository;

import Demotapcode.spa_nuru.entity.Dep;
import Demotapcode.spa_nuru.exception.MassaException;
import Demotapcode.spa_nuru.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PgKhachVip implements IDepRepository{
    public final String VIP_FILE = "src/Demotapcode/spa_nuru/data/pgavip.csv";
    @Override
    public List<Dep> findAll() {
        List<Dep> depList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(VIP_FILE);
            if (stringList.isEmpty()) {
                System.out.println("Không có dữ liệu trong Ngưng Bích Lâu!");
            } else {
                for (String line : stringList) {
                    String[] array = line.split(",");
                    if (array.length < 5) {
                        System.out.println("Thiếu thông tin: " + line);
                        continue;
                    }
                    try {

                        boolean outTime = Boolean.parseBoolean(array[2]);
                        boolean working = Boolean.parseBoolean(array[3]);
                        Dep dep = new Dep(
                                Integer.parseInt(array[0]),
                                array[1],
                                outTime,working,
                                Double.parseDouble(array[4]),
                                Integer.parseInt(array[5])
                        );
                        depList.add(dep);
                    } catch (MassaException e) {
                        System.out.println("Chuyển dữ liệu lỗi: " + line);
                    } catch (Exception e) {
                        System.out.println("Lỗi đọc file: " + e.getMessage());
                    }
                }
            }
            return depList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public boolean add(Dep dep) {
        return false;
    }

    @Override
    public boolean update(int maSo, Dep newDep) {
        return false;
    }

    @Override
    public boolean delete(int maSo) {
        return false;
    }

    @Override
    public List<Dep> searchByName(String keyword) {
        List<Dep> result = new ArrayList<>();
        String key = keyword.toLowerCase().trim();
        for (Dep d : findAll()) {
            if (d.getNgheDanh() != null && d.getNgheDanh().toLowerCase().contains(key)) {
                result.add(d);
            }
        }
        return result;
    }

    @Override
    public Dep findById(int maSo) {
        return null;
    }
}
