package com.aosys.dao.login;

import com.aosys.pojo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginDao extends JpaRepository<User,Long>{
    public List<User> findAllByUserName(String userName);

}
