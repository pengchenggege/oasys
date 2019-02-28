package com.aosys.service.user;

import com.aosys.pojo.user.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void save(User user);

    public void edit(User user);

    public void delete(long id);


    public User findById(long id);
}
