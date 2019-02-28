package com.aosys.service.user;

import com.aosys.pojo.user.Dept;
import com.aosys.pojo.user.Position;

import java.util.List;

public interface PositionService {

    public List<Position> findAll();

    public void save(Position position);

    public void edit(Position position);

    public void delete(long id);

    public Position findById(long id);

}
