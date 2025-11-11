package Demotapcode.robot_automatic.repository;

import Demotapcode.robot_automatic.entity.IndustrialRobots;

import java.util.List;

public class IndustrialRobotsRepository implements  IIndustrialRobotsRepository{
    private String AUTO_FILE = "Demotapcode/robot_automatic/data/indusrobot.csv";
    @Override
    public List<IndustrialRobots> findAll() {
        return List.of();
    }

    @Override
    public boolean add(IndustrialRobots industrialRobots) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, IndustrialRobots newIndustrialRobots) {
        return false;
    }

    @Override
    public IndustrialRobots findByName(String name) {
        return null;
    }
}
