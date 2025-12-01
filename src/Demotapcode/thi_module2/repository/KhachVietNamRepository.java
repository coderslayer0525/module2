package Demotapcode.thi_module2.repository;


import Demotapcode.thi_module2.entity.KhachVietNam;
import Demotapcode.thi_module2.exception.DienLucException;
import Demotapcode.thi_module2.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KhachVietNamRepository implements IKhachVietNamRepository {
    private final String KH_VIET = "src/Demotapcode/thi_module2/data/khachviet.csv";
    @Override
    public List<KhachVietNam> findAll() {
       List<KhachVietNam> khachVietNamList = new ArrayList<>();
       try{
           List<String> stringList = ReadAndWriteFile.readFileCSV(KH_VIET);
           if(stringList.isEmpty()){
               System.out.println("KhachViet Nam List is Empty");
           }else {
               for (String line : stringList) {
                   String[] arr = line.split(",");
                   if(arr.length < 2){
                       System.out.println("thong tin thieu , ko xac dinh " + line);
                       continue;
                   }
                   try{
                       KhachVietNam khachVietNam = new KhachVietNam(arr[0],Integer.parseInt(arr[1]),
                               arr[2],Integer.parseInt(arr[3]));
                       khachVietNamList.add(khachVietNam);
                   }catch (DienLucException e){
                       System.out.println("Loi chuyen du lieu" + line);

                   } catch (Exception e) {
                       System.out.println(" doc chuyen loi" + e.getMessage());
                       e.printStackTrace();
                   }
               }
           }
           return khachVietNamList;
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

    public int getNextId() {
        List<KhachVietNam> khachVietNamList = findAll();
        if (khachVietNamList.isEmpty()) {
            return 1;
        }
        int maxId = 0;
        for (KhachVietNam vn : khachVietNamList) {
            if (vn.getMaKhachHang() > maxId) {
                maxId = vn.getMaKhachHang();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(KhachVietNam khachVietNam) {
       int nextId = getNextId();
       khachVietNam.setMaKhachHang(nextId);
       List<String> stringList = new ArrayList<>();
       stringList.add(khachVietNam.getInfoToCSV());
       try{
           ReadAndWriteFile.writeFileCSV(KH_VIET, stringList, true);
           return true;
       }catch (Exception e){
           System.out.println("Loi ghi file" + e.getMessage());
           return false;
       }
    }

    @Override
    public boolean delete(int maKhachHang) {
        return false;
    }

    @Override
    public boolean update(int maKhachHang, KhachVietNam newKhachVietNam) {
        try {
            List<KhachVietNam> khachVietNamList = findAll();
            for (KhachVietNam vn : khachVietNamList) {
                if (vn.getMaKhachHang() == maKhachHang) {
                    vn.setMaKhachHang(newKhachVietNam.getMaKhachHang());
                    vn.setName(newKhachVietNam.getName());
                    vn.setLoaiKhach(newKhachVietNam.getLoaiKhach());
                    vn.setDinhMucTieuThu(newKhachVietNam.getDinhMucTieuThu());
                    break;
                }
            }
            List<String> stringList = new ArrayList<>();
            for (KhachVietNam vn : khachVietNamList) {
                stringList.add(vn.getInfoToCSV());
            }
            ReadAndWriteFile.writeFileCSV(KH_VIET, stringList, false);
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return false;
        }
    }

    @Override
    public KhachVietNam findById(int maKhachHang) {
        try {
            List<KhachVietNam> khachVietNamList = findAll();
            for (KhachVietNam vn : khachVietNamList) {
                if (vn.getMaKhachHang() == maKhachHang) {
                    return vn;
                }
            }
        } catch (Exception e) {
            System.out.println(" Loi khong tim thay" + e.getMessage());
        }
        return null;
    }
}
