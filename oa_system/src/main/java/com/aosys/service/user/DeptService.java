package com.aosys.service.user;

import com.aosys.pojo.user.Dept;

import java.util.List;

public interface DeptService {

    public List<Dept> getDeptList();

    public void save(Dept dept);

    public void edit(Dept dept);

    public void delete(long id);

    public Dept findOne(long id);
}
