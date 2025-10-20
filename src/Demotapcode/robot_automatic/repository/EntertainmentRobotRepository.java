package Demotapcode.robot_automatic.repository;


import Demotapcode.robot_automatic.entity.EntertainmentRobots;
import ss8_mvc_quanly_phuongtien.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EntertainmentRobotRepository implements  IEntertainmentRobotRepository{
    private final String AUTO_FILE = "Demotapcode/robot_automatic/data/enterrobot.csv";
    @Override
    public List<EntertainmentRobots> findAll() {
        List<EntertainmentRobots> entertainmetnRobotsList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(AUTO_FILE);
            for (String line : stringList) {
                if (line.trim().isEmpty()) continue;
                String[] array = line.split(",");
                if (array.length < 3){
                    System.out.println("Line exception:" + line);
                    continue;
                }
                try {
                    EntertainmentRobots entertainmetnRobots = new EntertainmentRobots(Integer.parseInt(array[0]), array[1],
                            Integer.parseInt(array[2]), array[3],
                            array[4]);
                    entertainmetnRobotsList.add(entertainmetnRobots);
                } catch (NumberFormatException e) {
                    System.out.println(" Error Data value:" + line);
                }
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e.getMessage());
            e.printStackTrace();
        }
        return  entertainmetnRobotsList;
    }
    public int getNextId() {
        List<EntertainmentRobots> entertainmentRobotsList = findAll();
        if (entertainmentRobotsList.isEmpty()) {
            return 1;
        }
        int maxId = 0;
        for (EntertainmentRobots e : entertainmentRobotsList) {
            if (e.getId() > maxId) {
                maxId = e.getId();
            }
        }
        return maxId + 1;
    }

    @Override
    public boolean add(EntertainmentRobots entertainmentRobots) {
        int nextId = getNextId();
        entertainmentRobots.setId(nextId);
        List<String> stringList = new ArrayList<>();
        stringList.add(entertainmentRobots.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(AUTO_FILE, stringList, true);
            return true;
        } catch (Exception e) {
            System.out.println("loi ghi file" + e.getMessage());
            return false;
    }
        }

    @Override
    public boolean delete(int id) {
        try {
            List<EntertainmentRobots> entertainmentRobotsList = findAll();
            boolean removed = entertainmentRobotsList.removeIf(et -> et.getId() == id);
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (EntertainmentRobots et : entertainmentRobotsList) {
                    stringList.add(et.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(AUTO_FILE, stringList, false);
            }
            return removed;
        } catch (Exception e) {
            System.out.println("nhap sai thong tin" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(int id, EntertainmentRobots entertainmentRobots) {
        return  true;
    }

    @Override
    public EntertainmentRobots findByName(String name) {
        return null;
    }
}
