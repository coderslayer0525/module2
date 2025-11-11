package Demotapcode.robot_automatic.repository;

import Demotapcode.robot_automatic.entity.IndustrialRobots;

import java.util.List;

public interface IIndustrialRobotsRepository {
    List<IndustrialRobots> findAll();

    boolean add(IndustrialRobots industrialRobots);

    boolean delete(int id);

    boolean update(int id, IndustrialRobots newIndustrialRobots);

    IndustrialRobots findByName(String name);

}
