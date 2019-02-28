package com.aosys.service.impl.user;

import com.aosys.dao.user.DeptDao;
import com.aosys.pojo.user.Dept;
import com.aosys.service.user.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;

    @Override
    public List<Dept> getDeptList() {
        return deptDao.findAll();
    }

    @Override
    public Dept findOne(long id) {
        return deptDao.findOne(id);
    }

    @Override
    public void save(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public void edit(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public void delete(long id) {
        deptDao.delete(id);
    }
}
