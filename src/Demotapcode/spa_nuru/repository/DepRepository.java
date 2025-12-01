package Demotapcode.spa_nuru.repository;



import Demotapcode.spa_nuru.entity.Dep;
import Demotapcode.spa_nuru.exception.MassaException;
import Demotapcode.spa_nuru.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DepRepository implements IDepRepository {
    public final String DEP_FILE = "src/Demotapcode/spa_nuru/data/monghonglau.csv";

    @Override
    public List<Dep> findAll() {

        List<Dep> depList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(DEP_FILE);
            if (stringList.isEmpty()) {
                System.out.println("Cac Nhan Vien deu dang ban, vui long doi.");
            } else {
                for (String line : stringList) {
                    String[] array = line.split(",");
                    if (array.length < 2) {
                        System.out.println("Thong tin thieu hoac chua xac dinh" + line);
                        continue;
                    }
                    try {
                        boolean working = Boolean.parseBoolean(array[3]);
                        boolean outTime = Boolean.parseBoolean(array[2]);
                        Dep dep = new Dep(Integer.parseInt(array[0]), array[1],
                                outTime,working, Double.parseDouble(array[4]),
                                Integer.parseInt(array[5]));
                        depList.add(dep);
                    } catch (MassaException e) {
                        System.out.println("Chuyen Du lieu Loi" + line);
                    } catch (Exception e) {
                        System.out.println("Doc File loi" + e.getMessage());    
                        e.printStackTrace();
                    }
                }
            }
            return depList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNextId() {
        List<Dep> depList = findAll();
        if (depList.isEmpty()) {
            return 1;
        }
        int maxId = 0;
        for (Dep t : depList) {
            if (t.getMaSo() > maxId) {
                maxId = t.getMaSo();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(Dep dep) {
        int nextId = getNextId();
        dep.setMaSo(nextId);
        List<String> stringList = new ArrayList<>();
        stringList.add(dep.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(DEP_FILE, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(int maSo, Dep newDep) {
        try {
            List<Dep> depList = findAll();
            for (Dep t : depList) {
                if (t.getMaSo() == maSo) {
                    t.setMaSo(newDep.getMaSo());
                    t.setNgheDanh(newDep.getNgheDanh());
                    t.setOutTime(newDep.isOutTime());
                    t.setWorking(newDep.isWorking());
                    t.setDanhGia(newDep.getDanhGia());
                    t.setGiaDichVu(newDep.getGiaDichVu());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (Dep d : depList) {
                stringList.add(d.getInfoToCSV());

            }
            ReadAndWriteFile.writeFileCSV(DEP_FILE, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int maSo) {
        try {
            List<Dep> depList = findAll();
            Dep depToDelete = depList.stream().filter(t -> t.getMaSo() == maSo).findFirst().orElse(null);
            if (depToDelete != null && depToDelete.isWorking()) {
                System.out.println(" Tạm Thời không xoá được.");
                return false;
            }
            boolean removed =depList.removeIf(t -> t.getMaSo() == maSo);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (Dep t : depList) {
                    stringList.add(t.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(DEP_FILE, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }


    @Override
    public List<Dep> searchByName(String keyword) {
        List<Dep> result = new ArrayList<>();
        if (keyword == null) return result;

        Iterable<Dep> deps = findAll();
        String keyW = keyword.toLowerCase().trim();
        for (Dep p : deps) {
            if (p.getNgheDanh() != null && p.getNgheDanh().toLowerCase().contains(keyW)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public Dep findById(int maSo) {
        try {
            List<Dep> depList = findAll();
            for (Dep d : depList) {
                if (d.getMaSo() == maSo) {
                    return d;
                }
            }
        } catch (Exception e) {
            System.out.println(" Loi khong tim thay" + e.getMessage());
        }
        return  null;
    }
}