package com.aosys.dao.user;

import com.aosys.pojo.user.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionDao extends JpaRepository<Position,Long>{
}
