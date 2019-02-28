package com.aosys.dao.user;

import com.aosys.pojo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long>{
}
