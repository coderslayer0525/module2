package Demotapcode.robot_automatic.repository;

import Demotapcode.robot_automatic.entity.EntertainmentRobots;

import java.util.List;

public interface IEntertainmentRobotRepository {
    List<EntertainmentRobots> findAll();

    boolean add(EntertainmentRobots entertainmentRobots);

    boolean delete(int id);

    boolean update(int id, EntertainmentRobots entertainmentRobots);

    EntertainmentRobots findByName(String name);
}
