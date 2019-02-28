package com.aosys.service.impl.user;

import com.aosys.dao.user.PositionDao;
import com.aosys.pojo.user.Position;
import com.aosys.service.user.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    PositionDao positionDao;

    @Override
    public List<Position> findAll() {
        return positionDao.findAll();
    }

    @Override
    public void save(Position position) {
        positionDao.save(position);
    }

    @Override
    public void edit(Position position) {
        positionDao.save(position);
    }

    @Override
    public void delete(long id) {
        positionDao.delete(id);
    }

    @Override
    public Position findById(long id) {
        return positionDao.findOne(id);
    }
}
