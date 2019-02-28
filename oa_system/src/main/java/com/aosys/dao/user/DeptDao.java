package com.aosys.dao.user;

import com.aosys.pojo.user.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao extends JpaRepository<Dept,Long>{
}
