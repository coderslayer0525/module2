package cs_shop_moblie.service;

import cs_shop_moblie.entity.DienThoai;
import cs_shop_moblie.util.ReadAndWriteBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class DienThoaiService  implements  IDienThoaiService {
    private static final String FILE_BNR = "cs_shop_moblie/data/dienthoai.dat";
    private List<DienThoai> dienThoaiList = new ArrayList<>();

    public DienThoaiService() {
        dienThoaiList = ReadAndWriteBinaryFile.readFromFile(FILE_BNR);
        if (dienThoaiList == null) {
            dienThoaiList = new ArrayList<>();
        }
    }

    @Override
    public List<DienThoai> findAll() {
        return dienThoaiList;
    }


    @Override
    public boolean add(DienThoai dienThoai) {
        dienThoaiList.add(dienThoai);
        ReadAndWriteBinaryFile.writeToFile(FILE_BNR, dienThoaiList);
        return true;
    }
}

